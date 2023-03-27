package view;

import javax.swing.JPanel;


import util.Box;
import util.Button;
import util.Field;
import util.MessageBox;
import util.MoneyListener;
import util.Multiplier;
import util.Spinner;
import util.Theme;
import util.Table;
import controller.MovePane;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.awt.FlowLayout;
import javax.swing.JLabel;


import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;


public class Dashboard extends JPanel {

	
	private Box[] box;
	
	private JPanel pane_main;
	private Login login;
	
	private Field field_bet;
	private Button btn_bet;
	private Spinner spinner;
	private JPanel panel_mined_1;
	private JPanel panel_bal;
	private JLabel lblNewLabel;
	private JLabel account_balance;
	private JLabel lblNewLabel_2;
	private JPanel panel_mined;
	private JLabel total_win;
	private static int  total_hit = 0;
	private JPanel panel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JScrollPane scrollPane_1;
	private JPanel panel_1;
	
	public Dashboard(JPanel pane_main) {
		this.pane_main = pane_main;
		initComponent();
	}
	
	private void initComponent() {
		setSize(900, 600);
		setBackground(Color.decode(Theme.BACKGROUND));
		setLayout(null);
		
		panel_mined = new JPanel();
		panel_mined.setBackground(Color.decode(Theme.BACKGROUND_TWO));
		panel_mined.setBounds(533, 100, 300,300);
		box = new Box[25];
		
	    for (int x = 0; x < box.length; x++) {
	        box[x] = new Box(3);     
	        panel_mined.add(box[x]);
	    }
		add(panel_mined);
		panel_mined.setLayout(new GridLayout(5, 5, 5, 5));
	
		field_bet = new Field(40, 10, 15, "Enter your Bet", 2);
		field_bet.setSize(156, 40);
		field_bet.setLocation(533, 481);
		add(field_bet);		
		
		spinner = new Spinner();
		spinner.setLocation(533, 538);
		
		add(spinner);
		
		btn_bet = new Button(Theme.BTN_COLOR_OK,Theme.BTN_COLOR_OK_HOVER, "Bet", 20);
		btn_bet.setBounds(712, 538, 121, 40);
		btn_bet.addMouseListener(new BetListener());
		
		this.add(btn_bet);
		
		panel_mined_1 = new JPanel();
		panel_mined_1.setBackground(new Color(26, 26, 46));
		panel_mined_1.setBounds(54, 100, 439, 475);
		add(panel_mined_1);
		panel_mined_1.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 40));
		panel.setBackground(Color.decode(Theme.BACKGROUND_TWO));
		panel_mined_1.add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Time");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 11, 104, 18);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Round ID");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(116, 11, 104, 18);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Bets");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(290, 11, 59, 18);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Mines");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(219, 11, 75, 18);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Profit");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(359, 11, 59, 18);
		panel.add(lblNewLabel_7);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		scrollPane_1.setBackground(Color.decode(Theme.BACKGROUND));
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_mined_1.add(scrollPane_1, BorderLayout.CENTER);
		
		
		panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setBackground(Color.decode(Theme.BACKGROUND_TWO));
		panel_1.setSize(420, 500);
		panel_1.setPreferredSize(new Dimension(420, 500));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
						
		MovePane move = new MovePane(panel_1,scrollPane_1);
		panel_1.addMouseMotionListener(move);
		panel_1.addMouseListener(move);
		
		panel_bal = new JPanel();
		panel_bal.setBackground(new Color(26, 26, 46));
		panel_bal.setBounds(535, 26, 189, 40);
		panel_bal.addMouseListener(new MoneyListener(this));
		add(panel_bal);
		panel_bal.setLayout(null);
		
		lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(149, 0, 40, 40);
		panel_bal.add(lblNewLabel);
		
		account_balance = new JLabel("1000");
		account_balance.setForeground(Color.WHITE);
		account_balance.setFont(new Font("Tahoma", Font.BOLD, 20));
		account_balance.setBounds(36, 0, 103, 40);
		panel_bal.add(account_balance);
		
		lblNewLabel_2 = new JLabel("₱");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 0, 40, 40);
		panel_bal.add(lblNewLabel_2);
		
		Button btn_logout = new Button(Theme.BTN_COLOR_CANCEL, Theme.BTN_COLOR_CANCEL_HOVER, "Log Out", 15);
		btn_logout.setBounds(763, 26, 70, 40);
		btn_logout.addMouseListener(new Logout());
		add(btn_logout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(533, 411, 300, 58);
		add(scrollPane);
		
		total_win = new JLabel("0");
		total_win.setForeground(Color.WHITE);
		total_win.setFont(new Font("Tahoma", Font.BOLD, 20));
		total_win.setBounds(712, 481, 156, 40);
		add(total_win);

	}
	
	private LinkedList<Table> table = new LinkedList<Table>();
	
	private void addTransaction(String mines, String bets, String profit) {
		
		int height = 0;
		
		table.add(new Table(getDate(), generateId(), mines, bets, profit));	
		panel_1.removeAll();
		
		for(Table e: table) {
			panel_1.add(e);
			height = height + 5 +e.getHeight();
		}
		System.out.println(height);
		
		panel_1.setPreferredSize(new Dimension(420, height));
		
		panel_1.repaint();
		panel_1.revalidate();
	
	}
	
	public String generateId() {
		return "2003"+String.valueOf((int)(Math.random() * 999999 - 100000 + 1) + 100000);
	}
	
	public void revealBox() {
		for(Box x: box) {
			x.Reveal();
		}
	}
	
	public String getDate() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return  now.format(format);
	}
	private class BetListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		
			Double accountBalance = Double.valueOf(account_balance.getText());
			
			if(btn_bet.getText().equalsIgnoreCase("bet")) {												
				
				if(field_bet.getText().getText().isBlank()) {					
					new MessageBox("Place your bet").setVisible(true);
				}else {

					Double bet = Double.valueOf(field_bet.getText().getText());
					if(bet == 0) {
						new MessageBox("Place your bet").setVisible(true);
					}else {
						
						if(accountBalance == 0) {
							
							new MessageBox("Please Deposit first").setVisible(true);
							
						}else if (accountBalance < bet){
							
							new MessageBox("Not enough balance").setVisible(true);
							
						}else{
							
							String newBalance = String.valueOf(String.format("%.2f", accountBalance - bet));
							
							account_balance.setText(newBalance);
							
							setBomb(Integer.valueOf(spinner.getText().getText()));
							btn_bet.setText("Cash Out");
						}
						
						
					}
					
				}
			}else if(btn_bet.getText().equalsIgnoreCase("cash out")){
				
				Double get_total = Double.valueOf(total_win.getText());
				
				if(get_total != 0) {
					btn_bet.setText("Bet");
					total_hit = 0;
					total_win.setText("0");
					revealBox();
					panel_mined.revalidate();
					panel_mined.repaint();
					account_balance.setText(String.valueOf(String.format("%.2f", get_total + accountBalance)));
					new MessageBox("Congratulations, you win " + get_total).setVisible(true);
					addTransaction(spinner.getText().getText(), field_bet.getText().getText(), String.valueOf("+"+get_total));
				}else {
					new MessageBox("Please pick a box").setVisible(true);
				}
												
			}
			
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
			
		public void setBomb(Integer total_bomb) {
		    panel_mined.setEnabled(true);
		    panel_mined.removeAll();

		    Set<Integer> set = new HashSet<>();
		    Random rand = new Random();

		    while (set.size() < total_bomb) {
		        set.add(rand.nextInt(25));
		    }
		    for (int x = 0; x < box.length; x++) {
		        box[x] = new Box(set.contains(x) ? 1 : 2);
		        box[x].addMouseListener(new BombListener(x, total_bomb));
		        panel_mined.add(box[x]);
		        
		    }
		    panel_mined.revalidate();
		    panel_mined.repaint();
		}	
	
	}
	
	private class Logout implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			login = new Login(pane_main);
			pane_main.removeAll();	
			pane_main.add(login);	
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
	}
	
	private class BombListener implements MouseListener{
		
		private int count;
		private int total_bomb;
		
		BombListener(int count, int total_bomb){
			this.count = count;
			this.total_bomb = total_bomb;

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			Double bet = Double.valueOf(field_bet.getText().getText());
			if(box[count].getType() != 3) {
				if(box[count].getType() == 1) {
					total_win.setText("0");
					field_bet.getText().setEnabled(true);
					total_hit = 0;
					btn_bet.setText("Bet");
					new MessageBox("You Lost").setVisible(true);
					revealBox();
				    panel_mined.revalidate();
				    panel_mined.repaint();
				    addTransaction(spinner.getText().getText(), String.valueOf(bet), "-"+bet);
				    for(int x = 0; x < box.length; x++) {
				    	box[x].setType(3);
				    }
				}else if(box[count].getType() == 2) {
					
					box[count].setType(3);
					Double win = bet * Multiplier.multiply[total_bomb - 1][total_hit];
					total_win.setText(String.format("%.2f", win));
					total_hit++;
				}
			}
			
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
}