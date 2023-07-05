package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;

	
	public LastButtonView() {
		// TODO Auto-generated constructor stub
		this.lastButtonModel= new LastButtonModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		
		// tao Jpanel_center
		JPanel jpanel_Center= new JPanel();
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		// tao noi gian => Listener
		LastButtonListener noigian= new LastButtonListener(this);
		
		Font font = new Font("Arial", Font.ROMAN_BASELINE , 40);
		// tao cac button va set font cho chung
		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(font);
		// lien ket voi noi gian
		jButton_1.addActionListener(noigian);	
		
		JButton jButton_2= new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(noigian);
		
		JButton jButton_3= new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(noigian);
		
		JButton jButton_4= new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(noigian);
		
//		add cac button vao jpanel
		jpanel_Center.add(jButton_1);
		jpanel_Center.add(jButton_2);
		jpanel_Center.add(jButton_3);
		jpanel_Center.add(jButton_4);
//		them label vao jframe
		jLabel = new JLabel("------", JLabel.CENTER);
		jLabel.setFont(font);
		
		this.add(jpanel_Center, BorderLayout.CENTER);
		this.add(jLabel, BorderLayout.SOUTH);
	}
	
	//cac ham khi click chuot vao button
	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	

}
