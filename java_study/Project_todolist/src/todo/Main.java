package todo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
public class Main extends JFrame{
		// 사용할 변수 선언
		private JPanel bottom, tb;
		JButton btn1, btn2, btn3;
		private int rows = 7;
		private int cols = 5;
		Calendar cal = Calendar.getInstance();
		int[] monDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		public Main(){
			setTitle("Menu Test");
			this.setLayout(new BorderLayout(30,30));
//			top.setPreferredSize(new Dimension(MAXIMIZED_HORIZ,top_height));	
//			bottom.setPreferredSize(new Dimension(MAXIMIZED_HORIZ,MAXIMIZED_VERT-top_height));
			// 각 패널 레이아웃 구성
		
			// top panel
			
			int month = cal.get(Calendar.MONTH)+1;
			
			JLabel lb = new JLabel("글자 추가 테스트");
			lb.setHorizontalAlignment(JLabel.CENTER);
			lb.setPreferredSize(new Dimension(600,200));
			this.add(lb);
			
			tb = new JPanel();
			btn1 = new JButton("<");
			btn2 = new JButton(month+"월");
			btn3 = new JButton(">");
			tb.add(btn1);
			tb.add(btn2);
			tb.add(btn3);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					lb.setText(lb.getText()+"<");
				}
			});
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					btn2.setText(8+"월");
				}
			});
			tb.setPreferredSize(new Dimension(300,50));
			this.add(tb, BorderLayout.NORTH);
			// bottom panel 
			bottom = new JPanel();
			bottom.setLayout(new GridLayout(rows,cols,5,5));
			JButton[] btn = new JButton[rows*cols];
			for(int i=0;i<rows*cols;i++) {
				btn[i] = new JButton(""+(i+1));
				bottom.add(btn[i]);
			}
			this.add(bottom, "South");
			
			
			this.setSize(600,400);
			setVisible(true);
			}
				
	public static void main(String[] args) {
		new Main();
	}
}