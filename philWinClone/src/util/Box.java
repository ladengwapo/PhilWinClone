package util;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class Box extends JPanel implements MouseListener {

	private Dimension size;
	private JLabel label;
	private int type;
	
	private static int status = 0;
	
	public Box(int type) {
		this.type = type;
		initCompoenent();
	}
	
	private void initCompoenent() {
		
		size = new Dimension(55,55);
		
		this.setSize(size);
		this.setPreferredSize(size);
		
		this.setBackground(Color.decode(Theme.BTN_COLOR_MINED));
		setLayout(null);
		
		label = new JLabel("?");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setBounds(0, 0, 55, 55);
		add(label);
		
		this.addMouseListener(this);	
		
	}
	
	
	public void Reveal() {
		
		label.setText("");
		if(type == 1) {
			label.setIcon(new ImageIcon(new ImageIcon("resource\\bomb.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		}else if(type == 2) {
			label.setIcon(new ImageIcon(new ImageIcon("resource\\coin.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		}
		type = 3;
	}
	
	public int getType(){
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
				
		if(type != 3) {
			status = 1;
			label.setText("");
			this.setBackground(Color.decode(Theme.BTN_COLOR_PICK));
			
			if(type == 1) {
				label.setIcon(new ImageIcon(new ImageIcon("resource\\bomb.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
			}else if(type == 2) {
				label.setIcon(new ImageIcon(new ImageIcon("resource\\coin.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(status == 0) {
			this.setBackground(Color.decode(Theme.BTN_COLOR_MINED));	
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		if(status == 0) {
			this.setBackground(Color.decode(Theme.BTN_COLOR_MINED_HOVER));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(status == 0) {
			this.setBackground(Color.decode(Theme.BTN_COLOR_MINED_HOVER));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(status == 0) {
			this.setBackground(Color.decode(Theme.BTN_COLOR_MINED));	
		}
		
	}
	
}
