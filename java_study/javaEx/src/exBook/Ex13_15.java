package exBook;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_15 {
	static class MyGUI15 extends JFrame {
		MyGUI15() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���� �����");
			this.setLayout(new FlowLayout());

			JToolBar toolBar = new JToolBar();
			
			JButton newItem = new JButton("�� ����");
			JButton openItem = new JButton("����");
			JButton closeItem = new JButton(new ImageIcon("image/exit.png"));

			add(toolBar
					// , BorderLayout.NORTH
					);
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator(new Dimension(20,10));
			toolBar.add(closeItem);

			JLabel lbl = new JLabel("�� ���ڰ� �ٲ�ϴ�");
			this.add(lbl);

			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[�� ����]�� �����߽��ϴ�.");
				}
			});

			openItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lbl.setText("[����]�� �����߽��ϴ�.");
				}
			});

			closeItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});

			setSize(300, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI15();
	}
}