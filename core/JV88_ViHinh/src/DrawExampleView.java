import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame {
	
	public DrawExampleView() {
		// TODO Auto-generated constructor stub
		this.setTitle("Draw Example");
		this.setSize(500, 500); // width, height
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanelDraw jPanelDraw= new JPanelDraw();
		 this.setLayout(new BorderLayout());
		 this.add(jPanelDraw, BorderLayout.CENTER);
		 this.setVisible(true);
	}
	
	

}
