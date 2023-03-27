import java.awt.EventQueue;

import javax.swing.JOptionPane;
import view.MainFrame;


public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {			
			try {
				new MainFrame().setVisible(true);				
			}catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error while starting the application");
			}
		});
		
	}

}
