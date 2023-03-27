package util;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends JPanel implements MouseListener {

	// Instance variables
	private JLabel textLabel;
	private String btnColor;
	private String btnHoverColor;
	private String text;
	private Integer fontSize;
		
	public Button(String btnColor, String btnHoverColor, String text, Integer fontSize) {
		// Constructor that initializes instance variables and calls initComponent() method
		this.btnColor = btnColor;
		this.btnHoverColor = btnHoverColor;
		this.text = text;
		this.fontSize = fontSize;
		initComponent();
	}
	
	private void initComponent() {
		// Method that sets up the components of the button
		// Add mouse listener to the button
		this.addMouseListener(this);
		// Create a new JLabel with the specified text and font size
		textLabel = new JLabel(text);
		textLabel.setForeground(Color.WHITE);
		textLabel.setFont(new Font("Dialog", Font.BOLD, fontSize));
		// Set the background color of the panel to the specified color
		this.setBackground(Color.decode(btnColor));
		// Set the layout of the panel to BorderLayout
		setLayout(new BorderLayout(0, 0));
		// Set the horizontal alignment of the text to center
		textLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// Add the text label to the center of the panel
		add(textLabel, BorderLayout.CENTER);
		// Revalidate and repaint the panel to reflect the changes
		revalidate();
		repaint();	
	}
	
	public void setText(String str) {
		// Method that sets the text of the button
		textLabel.setText(str);
	}
	
	public String getText() {
		// Method that returns the text of the button
		return textLabel.getText();
	}
		
	@Override
	public void mouseClicked(MouseEvent e) {
		// Method that handles the mouseClicked event, but we don't need to do anything here
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Method that handles the mousePressed event by setting the background color of the panel to the button color
		this.setBackground(Color.decode(btnColor));		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Method that handles the mouseReleased event by setting the background color of the panel to the hover color
		this.setBackground(Color.decode(btnHoverColor));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Method that handles the mouseEntered event by setting the background color of the panel to the hover color
		this.setBackground(Color.decode(btnHoverColor));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Method that handles the mouseExited event by setting the background color of the panel to the button color
		this.setBackground(Color.decode(btnColor));	
	}
	
}
