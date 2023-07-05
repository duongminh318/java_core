package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	
	public MyWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void Show()
	{
		this.setVisible(true);
	}
	
	public void Show(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void Show(String tille, int width, int height) {
		
		this.setTitle(tille);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
public void Show(String tille, int width, int height, int x, int y) {
		
		this.setTitle(tille);
		this.setSize(width, height);
		this.setLocation(x,y);
		this.setVisible(true);
	}

public static void main(String[] args) {
	MyWindow m1= new MyWindow();
	m1.Show("ahihi", 500, 400, 200,200);
	
	MyWindow m2= new MyWindow();
	m2.Show("ahihi2");
	
	MyWindow m3= new MyWindow();
	m3.Show();
	
}

}
