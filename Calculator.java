import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		num1 = new JTextField();
		num1.setBounds(51, 11, 140, 20);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(261, 11, 140, 20);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Num1:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNum = new JLabel("Num2:");
		lblNum.setBounds(216, 14, 46, 14);
		frame.getContentPane().add(lblNum);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1, number2, res;
				try {
					number1 = Integer.parseInt(num1.getText());
					number2 = Integer.parseInt(num2.getText());
					res = number1 + number2;
					result.setText(Integer.toString(res));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter a valid number!");
				}
			}
		});
		add.setBounds(86, 54, 57, 30);
		frame.getContentPane().add(add);
		
		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1, number2, res;
				try {
					number1 = Integer.parseInt(num1.getText());
					number2 = Integer.parseInt(num2.getText());
					res = number1 - number2;
					result.setText(Integer.toString(res));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter a valid number!");
				}
			}
		});
		subtract.setBounds(148, 54, 57, 30);
		frame.getContentPane().add(subtract);
		
		JButton multiply = new JButton("*");
		multiply.setBounds(215, 54, 57, 30);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.setBounds(274, 54, 57, 30);
		frame.getContentPane().add(divide);
		
		result = new JTextField();
		result.setBounds(166, 195, 96, 37);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResult.setBounds(99, 193, 57, 37);
		frame.getContentPane().add(lblResult);
	}

}
