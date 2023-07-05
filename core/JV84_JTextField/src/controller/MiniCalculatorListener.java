package controller;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {

	private MiniCalculatorView miniCalculatorView;
	
	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView2) {
		// TODO Auto-generated constructor stub
		this.miniCalculatorView= miniCalculatorView2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if(button.equals("+")){
			this.miniCalculatorView.plus();
		}else if(button.equals("-")){
			this.miniCalculatorView.minus();
		}else if(button.equals("*")){
			this.miniCalculatorView.multiply();
		}else if(button.equals("/")){
			this.miniCalculatorView.divide();
		}else if(button.equals("^")){
			this.miniCalculatorView.pow();
		}else if(button.equals("%")){
			this.miniCalculatorView.mod();
		}
		
	}

}
