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
		if(click.equals("Exit")) {
			System.exit(0);
		}else{
			this.menuExampleView.setTextJLabel("Bạn đã click: "+click);
		}
	}

}
