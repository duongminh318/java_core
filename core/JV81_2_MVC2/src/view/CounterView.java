package view;
/* goc nhin giao dien nguoi dung*/

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	
	private JButton JButton_up;
	private JButton JButton_down;
	private JButton JButton_reset;
	private JLabel jLabel_value;
	private JLabel jLabel_title;
	
	
	public CounterView() {
		// TODO Auto-generated method stub
		this.counterModel= new CounterModel();
		this.init();
		this.setVisible(true);
	}
//khởi tạo và sắp xếp layout
	public void init() {
		// TODO Auto-generated method stub
		this.setTitle("Counter");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac= new CounterListener(this);
		
		
		JButton_up = new JButton("UP");
		JButton_up.addActionListener(ac);
		
		JButton_down = new JButton("DOWN");
		JButton_down.addActionListener(ac);
		
		JButton_reset = new JButton("RESET");
		JButton_reset.addActionListener(ac);
		
		//chuyền giá trị value (một hàm của model vào) label	
		jLabel_value= new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);
		jLabel_title= new JLabel("Counter Number",JLabel.CENTER);
		

		JPanel jPannel = new JPanel();
		jPannel.setLayout(new BorderLayout());
		jPannel.add(JButton_up, BorderLayout.WEST);
		jPannel.add(jLabel_value, BorderLayout.CENTER);
		jPannel.add(JButton_down, BorderLayout.EAST);
		jPannel.add(JButton_reset, BorderLayout.SOUTH);
		jPannel.add(jLabel_title, BorderLayout.NORTH);
		this.setLayout(new BorderLayout());
		this.add(jPannel, BorderLayout.CENTER);
		
	}
	
	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement() {
		this.counterModel.decrement();;
		this.jLabel_value.setText(this.counterModel.getValue()+"");
		
	}
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	

}
