package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MovePane implements MouseListener, MouseMotionListener {
 
	private JPanel pane;
	private JScrollPane scrollPane;
	private int y;
	
	public MovePane(JPanel pane, JScrollPane scrollPane) {
	    this.pane = pane;
	    this.scrollPane = scrollPane;
	  }
	
	public void mousePressed(MouseEvent e) {
		  y = e.getY();
	  }
	
	public void mouseDragged(MouseEvent e) {
	
		int newY = pane.getY() + (e.getY() - y);
		int maxY = pane.getHeight() - scrollPane.getHeight();
		int paneY = pane.getY() * -1;

		if(newY <= 0 && (maxY >= paneY || y < e.getY() ) ) {
			pane.setLocation(pane.getX(), newY);
			if(scrollPane != null) {
				scrollPane.getVerticalScrollBar().setValue(newY * -1);
			}
			
		 }
	  }
	
	@Override
	public void mouseClicked(MouseEvent e) {
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
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

