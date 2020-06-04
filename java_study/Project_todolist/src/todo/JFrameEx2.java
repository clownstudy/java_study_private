package todo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JFrameEx2 {
	static class ex2 extends JFrame{
		ex2(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("JFrameEx2_FlowLayout");
			this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // new FlowLayout() 만 쓸 경우, center, 5, 5가 기본 값이다.

			JButton jbt1 = new JButton("FL1");
			this.add(jbt1);
			JButton jbt2 = new JButton("FL2");
			this.add(jbt2);
			JButton jbt3 = new JButton("FL3");
			this.add(jbt3);
			JButton jbt4 = new JButton("FL4");
			this.add(jbt4);
			JButton jbt5 = new JButton("FL5");
			this.add(jbt5);
			JButton jbt6 = new JButton("FL6");
			this.add(jbt6);
			JButton jbt7 = new JButton("FL7");
			this.add(jbt7);
			JButton jbt8 = new JButton("FL8");
			this.add(jbt8);
			
			setSize(200, 200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new ex2();
	}
}
