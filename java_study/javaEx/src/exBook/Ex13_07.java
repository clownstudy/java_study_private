package exBook;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_07 {
	static class MyGUI extends JFrame {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 1");
			
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("��ư1");
			btn1.setBackground(Color.BLACK);
			btn1.setBackground(Color.MAGENTA);
			this.add(btn1);
			
			JButton btn2 = new JButton("��ư2");
			btn2.setFont(new Font("�������",Font.BOLD,30));
			
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			btn2.setToolTipText("�� ��ư�� ũ�� ������~");
			this.add(btn2);
			
			JButton btn3 = new JButton("��ư3");
			btn3.setEnabled(false);
			this.add(btn3);
			
			setSize(256,256);
			setVisible(true);
			
		}
			
	}
	public static void main(String[] args) {
		
	}

}
