package javaEx.ch13;


import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

	// ex01
//	public class MyGUI extends JFrame {
//		MyGUI() {
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			setTitle("GUI ����");
//
//			// �� �κп� ��ư, ���̺�, üũ�ڽ� ���� �ڵ���
//
//			setSize(500, 500);
//			setVisible(true);
//		}
//	}
	
	// ex03
//	class MyGUI extends JFrame {
//		MyGUI() {
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			setTitle("BorderLayout ����");
//
//			this.setLayout(new BorderLayout(10, 10));
//
//			JButton btn1 = new JButton("��ư1");
//			this.add(btn1, BorderLayout.NORTH);
//
//			JButton btn2 = new JButton("��ư2");
//			this.add(btn2, BorderLayout.WEST);
//
//			JButton btn3 = new JButton("��ư3");
//			this.add(btn3, BorderLayout.CENTER);
//
//			JButton btn4 = new JButton("��ư4");
//			this.add(btn4, BorderLayout.EAST);
//
//			JButton btn5 = new JButton("��ư5");
//			this.add(btn5, BorderLayout.SOUTH);
//			
//			setSize(256, 256);
//			setVisible(true);
//		}
//	}

	// Ex13_05
//class MyGUI extends JFrame {
//	MyGUI() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setTitle("CardLayout ����");
//
//		this.setLayout(new CardLayout(10, 10));
//
//		JButton btn1 = new JButton("��ư1");
//		this.add(btn1);
//
//		JButton btn2 = new JButton("��ư2");
//		this.add(btn2);
//
//		JButton btn3 = new JButton("��ư3");
//		this.add(btn3);
//
//		setSize(256, 256);
//		setVisible(true);
//	}
//}

// Ex13_06
class MyGUI extends JFrame {
	MyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���̾ƿ��� ���� â ����");

		this.setLayout(null);

		JButton btn1 = new JButton("��ư1");
		btn1.setBounds(50, 50, 70, 60);
		this.add(btn1);

		JButton btn2 = new JButton("��ư2");
		btn2.setBounds(80, 80, 70, 60);
		this.add(btn2);

		JButton btn3 = new JButton("��ư3");
		btn3.setBounds(110, 110, 70, 60);
		this.add(btn3);

		setSize(256, 256);
		setVisible(true);
	}
}

