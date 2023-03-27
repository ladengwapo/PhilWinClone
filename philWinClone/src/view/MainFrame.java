package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.Theme;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Login login;

	public MainFrame() {
		initComponent();
	}
	
	public void initComponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode(Theme.BACKGROUND));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setUndecorated(true);
		contentPane.setLayout(null);
		
		login = new Login(contentPane);
		
		contentPane.add(login);
		
	}

}
