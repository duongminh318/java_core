package view;

import javax.swing.JFrame;

public class ViDu {

	public static void main(String[] args) {
		JFrame jf= new JFrame();
//		gan kich co(rong, dai)
		jf.setSize(600,400);
//		gan ten
		jf.setTitle("Vi Du JFrame");

//		while(true) {
//			System.out.println("chuong trinh dang chay");
//		}
//		dung chay khi tat cua so
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		gan vi tri hien thi
		jf.setLocation(100, 100);
		
		
//		cho phep hien thi
		jf.setVisible(true);
		
	}

}
