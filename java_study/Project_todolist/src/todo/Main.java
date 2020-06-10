package todo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		private JPanel top, bottom, center;
		private int rows = 7;
		private int cols = 5;
		
		public Main(){
			setTitle("Menu Test");
			this.setLayout(new GridLayout(6,1));
			top = new JPanel();
				this.add(top);
			center = new JPanel();
				this.add(center);	
			bottom = new JPanel();
				this.add(bottom);
			// 각 패널 레이아웃 구성
			top.setLayout(new FlowLayout(1,10,10));
			center.setLayout(new GridLayout(10,10));
			bottom.setLayout(new GridLayout(rows,cols,5,5));
		
			
			// top panel
			
			JLabel lb = new JLabel("글자 변경 테스트");
			top.add(lb);
			JToolBar tb = new JToolBar();
			JButton btn1 = new JButton("<");
			JButton btn2 = new JButton("월");
			JButton btn3 = new JButton(">");
			top.add(tb, BorderLayout.CENTER);
			tb.add(btn1);
			tb.add(btn2);
			tb.add(btn3);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					lb.setText(lb.getText()+"<");
				}
			});
			top.add(tb);
			// bottom panel 
			JButton[] btn = new JButton[rows*cols];
			for(int i=0;i<rows*cols;i++) {
				btn[i] = new JButton(""+(i+1));
				bottom.add(btn[i]);
			}
			
			
			this.setSize(500,1000);
			setVisible(true);
			}
				
	public static void main(String[] args) {
		new Main();
	}
}