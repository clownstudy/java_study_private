import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem_35 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Android ¿ÃπÃ¡ˆ");

			this.setLayout(new GridLayout(3, 3, 10, 10));

			String[] imageName = 
				{ "eclair.jpg", "froyo.jpg", "gingerbread.jpg", 
				"honeycomb.jpg", "icecream.jpg","jellybean.jpg", 
				"kitkat.jpg", "lollipop.jpg", "marshmallow.jpg" };
			ImageIcon[] img = new ImageIcon[9];
			JButton[] btn = new JButton[9];

			for (int i = 0; i < 9; i++) {
				img[i] = new ImageIcon("image/android/" + imageName[i]);
				btn[i] = new JButton(img[i]);
				MyGUI.this.add(btn[i]);
			}

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
