package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener {
	// tạo một biến của view
	private LastButtonView lastButtonView;
	
	public LastButtonListener(LastButtonView lastButtonView) {
		// TODO Auto-generated constructor stub
		this.lastButtonView = lastButtonView;
	}
	
	@Override
//	ham dieu huong
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		bat su kien ben view va dieu huong nguoc lai
		String nguonSuKien = e.getActionCommand();
		if (nguonSuKien.equals("1")) {
			this.lastButtonView.changeTo_1();
		}else if (nguonSuKien.equals("2")) {
			this.lastButtonView.changeTo_2();
		}else if (nguonSuKien.equals("3")) {
			this.lastButtonView.changeTo_3();
		}else if (nguonSuKien.equals("4")) {
			this.lastButtonView.changeTo_4();
		}
	}
	

}
