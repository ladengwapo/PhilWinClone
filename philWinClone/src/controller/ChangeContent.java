package controller;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class ChangeContent implements MouseListener{

	private JPanel main;
	private JPanel show;

	
	public ChangeContent(JPanel main, JPanel show) {
		this.main = main;
		this.show = show;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {		
		main.removeAll();	
		main.add(show);		
		main.repaint();
		
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
	
}	
