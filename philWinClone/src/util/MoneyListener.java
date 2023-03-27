package util;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Dashboard;

public class MoneyListener extends JFrame implements MouseListener {

	private Dashboard ds;
	private JPanel contentPane;
	
	public MoneyListener(Dashboard dashboard) {
		this.ds = dashboard;
		initComponent();

	}

	private void initComponent() {
		
		this.setSize(500,500);
		this.setUndecorated(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode(Theme.BACKGROUND));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setUndecorated(true);
		contentPane.setLayout(null);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

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

}
