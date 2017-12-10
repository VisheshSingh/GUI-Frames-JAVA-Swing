import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class helloworldclass {

	private JFrame frame;
	private JLabel lblMessage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloworldclass window = new helloworldclass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public helloworldclass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickMe = new JButton("Click me!");
		btnClickMe.setFont(new Font("Garamond", Font.BOLD, 16));
		btnClickMe.setBackground(Color.LIGHT_GRAY);
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null, "Greetings!");
				lblMessage.setText("Hello World! Greetings from Santa hahahahahaha");
			}
		});
		btnClickMe.setBounds(161, 108, 109, 51);
		frame.getContentPane().add(btnClickMe);
		
		lblMessage = new JLabel("Message:");
		lblMessage.setBounds(72, 40, 309, 34);
		frame.getContentPane().add(lblMessage);
	}
}
