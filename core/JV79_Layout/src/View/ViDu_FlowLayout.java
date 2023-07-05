package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		
//		null => can giua cua so chuong trinh
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		set Layout
		FlowLayout flowlayout= new FlowLayout();
//		can phai
		FlowLayout flowlayout1= new FlowLayout(FlowLayout.RIGHT);
//		khoang cach giua cac componet theo (,chieudoc, chieu ngang)
		FlowLayout flowlayout2= new FlowLayout(FlowLayout.CENTER,50,10);
		//this.setLayout(flowlayout);
		this.setLayout(flowlayout2);

		
		JButton jButton_1= new JButton("1");
		JButton jButton_2= new JButton("2");
		JButton jButton_3= new JButton("3");
		
		// add thanh phan
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		ViDu_FlowLayout vd1= new ViDu_FlowLayout();
		

	}

}
