package exBook;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_11 {
	static class MyGUI11 extends JFrame {
		MyGUI11() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈ ó�� 1");
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("��ư 1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setBackground(Color.RED);
					
				}
			});
			
			this.add(btn1);
			
			setSize(200,200);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI11();
	}
}
