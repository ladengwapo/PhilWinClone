package view;

import javax.swing.JPanel;

import util.Button;
import util.Field;
import util.Theme;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Register extends JPanel {
	
	private Dimension size;
	private Button btn_login;
	private Field field_userName;
	private JPanel pane_main;
	private Login login;

	public Register(JPanel pane_main) {
		this.pane_main = pane_main;
		size = new Dimension(400, 400);
		initComponent();
		
	}
		
	private void initComponent() {
		this.setBackground(Color.decode(Theme.BACKGROUND_TWO));
		this.setSize(size);
		this.setPreferredSize(size);
		this.setLocation(250,100);
		
		field_userName = new Field(40, 200, 15, "Enter your Username", 2);

		field_userName.setLocation(50, 73);
		
		add(field_userName);
		
		btn_login = new Button(Theme.BTN_COLOR_OK,Theme.BTN_COLOR_OK_HOVER, "Register", 20);

		btn_login.setSize(300, 40);
		btn_login.setLocation(50,279);
		
		this.add(btn_login);
		setLayout(null);
		
		Field field_password = new Field(40, 200, 15, "Enter your Password", 1);
		field_password.setBounds(50, 134, 300, 40);
		add(field_password);
		
		JLabel header = new JLabel("Register");
		header.setForeground(Color.WHITE);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Tahoma", Font.BOLD, 25));
		header.setBounds(10, 11, 380, 40);
		add(header);
		
		Field field_code = new Field(40, 200, 15, "Enter the Code", 2);
		field_code.setSize(200, 40);
		field_code.setLocation(50, 198);
		add(field_code);

		Button btn_code = new Button(Theme.BTN_COLOR_OK, Theme.BTN_COLOR_OK_HOVER, "Code", 20);
		btn_code.setSize(100, 40);
		btn_code.setLocation(251, 198);

		add(btn_code);
		
		JLabel btn_back = new JLabel("<");
		btn_back.setBorder(new LineBorder(Color.decode(Theme.BTN_COLOR_OK), 2));
		btn_back.setHorizontalAlignment(SwingConstants.CENTER);
		btn_back.setForeground(Color.WHITE);
		btn_back.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_back.setBounds(10, 20, 30, 30);
		btn_back.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				login = new Login(pane_main);
				
				pane_main.removeAll();	
				pane_main.add(login);	
				pane_main.revalidate();
				pane_main.repaint();
				
			}
			

			@Override
			public void mousePressed(MouseEvent e) {
					
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btn_back);
		
	}
}
