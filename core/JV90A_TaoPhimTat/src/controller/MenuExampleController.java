package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;
	
	
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		
		this.menuExampleView = menuExampleView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String click= e.getActionCommand();
		if(click.equals("Open")) {
			this.menuExampleView.setTextJLabel("da click vao JmenuItem Open");
			
		}else if(click.equals("Exit")) {
			System.exit(0);
		}else if(click.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Welcome");
		}else if(click.equals("vnch1")) {
			this.menuExampleView.setTextJLabel("Viet Nam Cong Hoa Muon Nam");
		}else if(click.equals("Help")) {
			this.menuExampleView.setTextJLabel("Bạn đã click Jmenu Help");
		}
	}

}
