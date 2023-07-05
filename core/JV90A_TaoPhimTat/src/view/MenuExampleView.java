package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;
	

	public MenuExampleView() {
		// TODO Auto-generated constructor stub
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Tạo thanh menu
		JMenuBar jMenuBar = new JMenuBar();

		// Tạo controller
		MenuExampleController menuExampleController = new MenuExampleController(this);

		
		// Tạo 1 menu bự File
		JMenu jMenu_file = new JMenu("File");
		// tạo các menu con
		JMenuItem jMenuItem_new = new JMenuItem("New");
		jMenuItem_new.addActionListener(menuExampleController);
		
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.addActionListener(menuExampleController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_E);
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		
		// thêm menu con vào menu bự
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();	//dấu gạch ngang
		jMenu_file.add(jMenuItem_exit);
		// Tạo 1 menu bự Help
		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		jMenu_help.setDisplayedMnemonicIndex(0);
//		jMenu_help.addActionListener(menuExampleController);
		
		
		
		// tạo và thêm menu con welcome 
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		// cài gián điệp nghe lén
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		JMenu jMenu_vnch = new JMenu("vnch");
		jMenu_vnch.setMnemonic(KeyEvent.VK_V);
		jMenu_vnch.setDisplayedMnemonicIndex(0);
		JMenuItem jMenuItem_vnch1 = new JMenuItem("vnch1");
		jMenuItem_vnch1.addActionListener(menuExampleController);

		
		jMenu_vnch.add(jMenuItem_vnch1);
		// thêm 2 menu bự vào trên thanh menu
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		jMenuBar.add(jMenu_vnch);

		// Thêm thanh thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);

		// Tạo label hiển thị
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();
//set layout cho jframe
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);

		this.setVisible(true);

	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

}
