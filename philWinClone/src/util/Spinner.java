package util;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Spinner extends JPanel implements MouseListener{
	
	private JTextField textField; // Text field to display and edit the numerical value.
	private JLabel add, minus; // Plus and minus buttons to increase or decrease the numerical value.

	// Constructor to initialize the spinner component.
	public Spinner() {
	    initComponent();
	}

	// Method to initialize the components of the spinner.
	private void initComponent() {
	    setSize(156, 40);
	    setLayout(null);
	    setBackground(Color.BLACK);
	    
	    // Label to display the name of the spinner.
	    JLabel lblNewLabel = new JLabel("Mines");
	    lblNewLabel.setForeground(Color.GRAY);
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel.setBounds(10, 1, 58, 40);
	    add(lblNewLabel);
	    
	    // Text field to display and edit the numerical value.
	    textField = new JTextField();
	    textField.setHorizontalAlignment(SwingConstants.TRAILING);
	    textField.setText("1");
	    textField.setEnabled(false);
	    textField.setForeground(Color.WHITE);
	    textField.setBorder(null);
	    textField.setOpaque(false);
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    textField.setBounds(0, 0, 115, 40);
	    add(textField);
	    textField.setColumns(10);
	    
	    // Plus and minus buttons to increase or decrease the numerical value.
	    add = new JLabel("+");
	    add.setHorizontalAlignment(SwingConstants.CENTER);
	    add.setForeground(Color.WHITE);
	    add.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    add.setBounds(124, -1, 32, 19);
	    add.addMouseListener(this);
	    add(add);
	    
	    minus = new JLabel("-");
	    minus.setHorizontalAlignment(SwingConstants.CENTER);
	    minus.setForeground(Color.WHITE);
	    minus.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    minus.setBounds(125, 20, 32, 19);
	    minus.addMouseListener(this);
	    add(minus);
	}

	// Method to get the text field of the spinner.
	public JTextField getText() {
	    return textField;
	}

	// Mouse listener method to handle the click events on the plus and minus buttons.
	@Override
	public void mouseClicked(MouseEvent e) {
	    Integer number = Integer.valueOf(textField.getText());
	    
	    // Decrease the numerical value if the minus button is clicked.
	    if(e.getSource() == minus) {
	        if(number > 1) {
	            number--;
	            textField.setText(String.valueOf(number));
	        }
	    }
	    // Increase the numerical value if the plus button is clicked.
	    else if(e.getSource() == add) {
	        if(number < 24) {
	            number++;
	            textField.setText(String.valueOf(number));
	        }
	    }   
	}

	// Unused mouse listener methods.
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}