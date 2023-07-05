package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import view.CounterView;

public class CounterListener implements ActionListener{

	private CounterView ctv;
	
	
	public CounterListener(CounterView ctv) {
		// TODO Auto-generated constructor stub
		this.ctv=ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String src= e.getActionCommand();
		System.out.println("Ban da nhan nut! "+ src);
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}else if(src.equals("RESET")) {
			this.ctv.reset();
		}
		
	}
	
	

}
