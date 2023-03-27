package util;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Field extends JPanel{
	
	private JTextField field;
	private JPasswordField fieldP;
	private JLabel label;

	private Dimension size;
	private String placeHolder;
	private Integer type;
	private Integer fontSize;

	public Field(Integer height, Integer width,Integer fontSize, String placeHolder, Integer type) {
		this.fontSize = fontSize;
		this.size = new Dimension(height, width);
		this.placeHolder = placeHolder;
		this.type = type;
		initComponent();
	}
	
	
	private void initComponent() {
		
		size = new Dimension(300, 40);
		
		setLayout(null);	
		setSize(size);
		setBackground(Color.BLACK);
		
		label = new JLabel();
		label.setForeground(Color.WHITE);	
		label.setBorder(null);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setPreferredSize(size);
		label.setText(placeHolder);
		label.setLocation(10,0);
		label.setSize(size);
		label.setForeground(Color.WHITE);	
		
		add(label);
		
		if(type == 1) {
			fieldP = new JPasswordField();
			fieldP.setLocation(10, 0);
			fieldP.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
			fieldP.setForeground(Color.WHITE);
			
			fieldP.setPreferredSize(size);
			fieldP.setBorder(null);
			fieldP.setSize(new Dimension(290, 40));
			fieldP.setOpaque(false);
			add(fieldP);
			fieldP.setColumns(10);
			
			fieldP.addKeyListener(new KeyAdapter() {
			    @Override
			    public void keyReleased(KeyEvent e) {
			    	 if(String.valueOf(fieldP.getPassword()).length() == 0) {
			             label.setText(placeHolder);
			         }else {
			        	 label.setText("");	
			         }	
			    }
			});
		}else if(type == 2) {
			field = new JTextField();
			field.setLocation(10, 0);
			field.setFont(new Font("Tahoma", Font.PLAIN, 20));
			field.setForeground(Color.WHITE);
			
			field.setPreferredSize(size);
			field.setBorder(null);
			field.setSize(new Dimension(290, 40));
			field.setOpaque(false);
			add(field);
			field.setColumns(10);
			
			field.addKeyListener(new KeyAdapter() {
			    public void keyReleased(KeyEvent e) {
			    	if(field.getText().length() == 0) {
			             label.setText(placeHolder);
			         }else {
			        	 label.setText("");	
			         }	
			    }
			});
		}
		
	}

	public String getPassword() {
		return String.valueOf(fieldP.getPassword());
	}
	
	public JTextField getText() {
		return field;
	}
}
