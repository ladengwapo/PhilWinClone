package util;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

public class MessageBox extends JFrame implements MouseListener, WindowFocusListener {

	private JPanel contentPane;
	private Button btn_close;
	private String str;
	
	private Timer timer;


	public MessageBox(String str) {
		this.str = str;
		initComponent();		
	}
	
	private void initComponent() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		setUndecorated(true);
		setLocationRelativeTo(null);
		addWindowFocusListener(this);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode(Theme.BACKGROUND));
		contentPane.setBorder(new LineBorder(Color.decode(Theme.BACKGROUND_TWO), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 430, 106);
		contentPane.add(lblNewLabel);
		
		btn_close = new Button(Theme.BTN_COLOR_CANCEL, Theme.BTN_COLOR_CANCEL_HOVER, "Close", 15);
		btn_close.setBounds(175, 149, 100, 40);
		btn_close.addMouseListener(this);
		getContentPane().add(btn_close);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.dispose();
		
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

	@Override
	public void windowGainedFocus(WindowEvent e) {
		StopTimer();
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("hello");
		StartTimer();
		System.out.println("vlose");
		
	}
	
	private void StartTimer() {
		timer = new Timer(2000, e -> {
			this.dispose();
			StopTimer();
		});
		timer.setRepeats(false);
		timer.start();
	}
	
	private void StopTimer() {
		if(timer != null) {
			timer.stop();
			timer = null;
		}
	}

}
