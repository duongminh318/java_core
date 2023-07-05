package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	private MouseExampleModel model;
	private JPanel jPanel_mouse;
	private JLabel jLabel_position;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count_value;
	private JLabel jLabel_count;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_check_in;
	private JLabel jLabel_check_in_value;
	private JLabel jLabel_empty_2;
	public MouseExampleView() {
		// TODO Auto-generated constructor stub
		this.model=new MouseExampleModel();
		this.init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Mouse Example");
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Font font = new Font("Arial", Font.BOLD, 40);
		MouseExampleController mouseExampleController= new MouseExampleController(this);
		// jPanel_mouse => panel o tren di chuot len
		 jPanel_mouse= new JPanel();
		jPanel_mouse.setBackground(Color.CYAN);
		
		jPanel_mouse.addMouseListener(mouseExampleController);
		jPanel_mouse.addMouseMotionListener(mouseExampleController);
		//jPanel_info => hien thi cac thong tin 
		JPanel jPanel_info= new JPanel();
		jPanel_info.setLayout(new GridLayout(3,3));
		
		jLabel_position = new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y =  new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count = new JLabel("Number of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel("n");
		jLabel_count_value.setFont(font);
		jLabel_empty_1 = new JLabel();
		jLabel_empty_1.setFont(font);
		jLabel_check_in = new JLabel("Mouse is in component:");
		jLabel_check_in.setFont(font);
		jLabel_check_in_value = new JLabel("no");
		jLabel_check_in_value.setFont(font);
		jLabel_empty_2 = new JLabel();
		jLabel_empty_2.setFont(font);
		
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_check_in);
		jPanel_info.add(jLabel_check_in_value);
		jPanel_info.add(jLabel_empty_2);
		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);
		this.setVisible(true);

	}
	public void click() {
		this.model.addClick();
		this.jLabel_count_value.setText(this.model.getCount()+"");
	}
	
	public void enter() {
		this.model.enter();
		this.jLabel_check_in_value.setText(this.model.getCheckIn());
	}
	public void exit() {
		this.model.exit();
		this.jLabel_check_in_value.setText(this.model.getCheckIn());
	}
	public void update(int x, int y) {
		this.model.setX(x);
		this.model.setY(y);
		this.jLabel_x.setText(this.model.getX()+"");
		this.jLabel_y.setText(this.model.getY()+"");
		//this.jLabel_x.setText(x+"");
	}
}
