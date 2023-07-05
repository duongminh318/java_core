package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	
	public ViDu_GridLayout() {
		this.setTitle("ViDu_GridLayout");
		this.setSize(600, 400);
		// căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		// Set Layout
		GridLayout gridLayout = new GridLayout();
//		so luong dong, co luong cot
		GridLayout gridLayout_2 = new GridLayout(4, 4);
//		4 dong, 4 cot khoang cach moi dong va cot la 25 pixel
		GridLayout gridLayout_3 = new GridLayout(4, 4, 25, 25);
		this.setLayout(gridLayout_3);
		
		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i+"");
			this.add(jButton);
		}

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
	
}
