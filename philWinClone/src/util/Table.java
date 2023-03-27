package util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Table extends JPanel {
	
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	public Table(String time, String round_id, String mines, String bets, String profit ) {
		setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.DARK_GRAY));

		setPreferredSize(new Dimension(10, 40));
		setBackground(Color.decode(Theme.BACKGROUND_TWO));
		setSize(439, 40);
		this.setPreferredSize(new Dimension(439, 40));
		setLayout(null);
		
		lblNewLabel_3 = new JLabel(time);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 11, 104, 18);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel(round_id);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(116, 11, 104, 18);
		add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel(bets);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(290, 11, 59, 18);
		add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel(mines);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(219, 11, 75, 18);
		add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel(profit);
		if(profit.contains("-")) {
			lblNewLabel_7.setForeground(Color.RED);
		}else {
			lblNewLabel_7.setForeground(Color.GREEN);
		}
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(359, 11, 59, 18);
		add(lblNewLabel_7);
	}

}
