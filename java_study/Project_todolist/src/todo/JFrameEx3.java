package todo;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class JFrameEx3 { // 외부 클래스
	public static class ex3 extends JFrame { // 내부 클래스. static을 써야 아래  main 함수에서 호출 가능. public static 붙이면 상속받은 친구가 사용 가능하다!
		ex3() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("JFrameEx3_BorderLayout");
			
			this.setLayout(new BorderLayout(10, 10)); // 기본값은 0,0
			JButton b1 = new JButton("버튼1");
			JButton b2 = new JButton("버튼2");
				
			this.add(b1, BorderLayout.WEST);
			this.add(b2, BorderLayout.EAST);
			
			setSize(200,200);
			setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		new ex3();
	}
}
