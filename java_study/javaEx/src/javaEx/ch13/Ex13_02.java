package javaEx.ch13;
import java.awt.*;
import javax.swing.*;

public class Ex13_02 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("버튼1");
			this.add(btn1);

			JButton btn2 = new JButton("버튼2");
			this.add(btn2);

			JButton btn3 = new JButton("버튼3");
			this.add(btn3);

			JButton btn4 = new JButton("버튼4");
			this.add(btn4);

			JButton btn5 = new JButton("버튼5");
			this.add(btn5);

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
