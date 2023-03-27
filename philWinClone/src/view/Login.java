package view;

import javax.swing.JPanel;

import util.Button;
import util.Field;
import util.Theme;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;


public class Login extends JPanel {
	
	
	private JPanel pane_main;
	private Dimension size;
	private Button btn_login;
	private Field field_userName;
	private Register register;
	private Dashboard dashboard;

	public Login(JPanel pane_main) {
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
		
		btn_login = new Button(Theme.BTN_COLOR_OK,Theme.BTN_COLOR_OK_HOVER, "Log In", 20);

		btn_login.setSize(300, 40);
		btn_login.setLocation(50,234);
		btn_login.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dashboard = new Dashboard(pane_main);
				pane_main.removeAll();	
				pane_main.add(dashboard);	
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
		
		this.add(btn_login);
		setLayout(null);
		
		Field field_password = new Field(40, 200, 15, "Enter your Password", 1);
		field_password.setBounds(50, 134, 300, 40);
		add(field_password);
		
		Button btn_signup = new Button(Theme.BTN_COLOR_CANCEL, Theme.BTN_COLOR_CANCEL_HOVER, "Register", 20);
		btn_signup.setBounds(50, 298, 300, 40);
		add(btn_signup);
		
		
		
		btn_signup.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				register = new Register(pane_main);
				pane_main.removeAll();	
				pane_main.add(register);	
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
		
		JLabel header = new JLabel("Log In");
		header.setForeground(Color.WHITE);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Tahoma", Font.BOLD, 25));
		header.setBounds(10, 11, 380, 40);
		add(header);
		
		JLabel lblNewLabel = new JLabel("Forget Password?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(169, 185, 180, 25);
		add(lblNewLabel);
		
	}
}
