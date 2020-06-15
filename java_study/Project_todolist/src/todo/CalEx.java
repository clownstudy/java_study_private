package todo;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CalEx {
	static class cal extends JFrame {
		cal(){
			int rows = 7;
			int cols = 5;
			 setLayout(new GridLayout(rows,cols,5,5));
			 JButton[] btn = new JButton[rows*cols];
			 
			 for(int i=0;i<rows*cols;i++) {
				 btn[i] = new JButton(""+(i+1));
				 this.add(btn[i]);
			 }
			 setSize(200,200);
			 setVisible(true);
		}
	}
}
