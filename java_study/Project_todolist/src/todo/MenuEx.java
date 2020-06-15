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
import javax.swing.JToolBar;
public class MenuEx{
	
	
	static class Menu extends JFrame {
		
		Menu(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Menu Test");
		setLayout(new FlowLayout(1,10,10));
		JLabel lb = new JLabel("글자 변경 테스트");
		this.add(lb);
		JToolBar tb = new JToolBar();
		JButton btn1 = new JButton("<");
		JButton btn2 = new JButton("월");
		JButton btn3 = new JButton(">");
		add(tb, BorderLayout.CENTER);
		tb.add(btn1);
		tb.add(btn2);
		tb.add(btn3);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setText(lb.getText()+"<");
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Menu();
	}
}
}
