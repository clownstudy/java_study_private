package todo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Jframe extends JFrame {
	Jframe() {
		setTitle("menu ex");
		createMenu();
		setSize(300,300);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 객체 생성
		JMenu screenMenu = new JMenu("Screen"); // Screen 메뉴 객체 생성 
		
		// Screen에 하위 메뉴 추가
		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(new MenuActionListener());
		screenMenu.add(load);
		
		
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); // 구분선 추가
		screenMenu.add(new JMenuItem("Exit"));
		
		mb.add(screenMenu); // 메뉴바에 Screen 메뉴 추가
		// 그리고 나머지 메뉴 추가.
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		// 최종적으로 메뉴바 객체에 담아줌.
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		new Jframe();
	}
	
	class MenuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}