package todo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEx1 {
	static class ex1 extends JFrame{
		ex1(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // window 닫기 버튼 활성화
		
		setTitle("JFrameEx1_?"); // window 제목 출력 (생략 가능)
		
		setSize(100,100);
		setVisible(true);
			JLabel lbl1 = new JLabel("이것은 테스트입니다.");
			this.add(lbl1);
		}
	}
	
	public static void main(String[] args) {
		new ex1();
	}

	
}
