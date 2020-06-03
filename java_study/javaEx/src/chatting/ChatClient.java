package chatting;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

class ChatClient extends JFrame implements ActionListener, Runnable {

	private JTextField input;
	private JTextArea output;
	private JButton send;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;

	public ChatClient() {
		input = new JTextField(15);

		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		output.setEditable(false);

		send = new JButton("蹂대�닿린");

		JPanel p = new JPanel(new BorderLayout());
		p.add("Center", input);
		p.add("East", send);

		Container c = this.getContentPane();
		c.add("Center", scroll);
		c.add("South", p);

		setBounds(100, 80, 300, 300);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("exit");
				pw.flush();
			}
		});
	}

	public void service() {
		// ��踰�IP
		// String serverIP = JOptionPane.showInputDialog(this,"��踰�IP瑜�
		// ���ν���몄��","��踰�IP",JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "��踰�IP瑜� ���ν���몄��", "192.168.0.43");
		if (serverIP == null || serverIP.length() == 0) {
			System.out.println("��踰�IP媛� ���λ��吏� �����듬����");
			System.exit(0);
		}

		// ���ㅼ��
		String nickName = JOptionPane.showInputDialog(this, "���ㅼ���� ���ν���몄��", "���ㅼ��", JOptionPane.INFORMATION_MESSAGE);
		if (nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}

		// ��耳� ����
		try {
			socket = new Socket(serverIP, 9500);

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			// ��踰� 蹂대�닿린
			pw.println(nickName);
			pw.flush();

		} catch (UnknownHostException e) {
			System.out.println("��踰�瑜� 李얠�� �� ���듬����");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("��踰��� �곌껐�� �������듬����");
			e.printStackTrace();
			System.exit(0);
		}

		// �대깽��
		send.addActionListener(this);
		input.addActionListener(this);

		// �ㅻ���� ����
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��踰�濡� 蹂대�닿린
		String line = input.getText();
		pw.println(line);
		pw.flush();
		input.setText("");
	}

	@Override
	public void run() {
		// 諛���履�
		String line = null;

		while (true) {
			try {
				line = br.readLine();
				if (line == null || line.toLowerCase().equals("exit")) {
					br.close();
					pw.close();
					socket.close();

					System.exit(0);; 
				}
			} catch (IOException io) {
				io.printStackTrace();
			}

			output.append(line + "\n");

			int pos = output.getText().length();
			output.setCaretPosition(pos);
		} // while
	}

	public static void main(String[] args) {
		new ChatClient().service();
	}
}
