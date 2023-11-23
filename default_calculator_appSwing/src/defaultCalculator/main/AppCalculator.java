package defaultCalculator.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppCalculator {

	private JFrame CalcWindow;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCalculator window = new AppCalculator();
					window.CalcWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CalcWindow = new JFrame();
		CalcWindow.setTitle("Calculator");
		CalcWindow.setResizable(false);
		CalcWindow.setBounds(100, 100, 300, 421);
		CalcWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcWindow.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 30));
		textField.setText("0");
		textField.setBounds(10, 13, 266, 84);
		CalcWindow.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 8));
		btnNewButton.setBounds(19, 108, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.setBounds(85, 108, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("x");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(217, 110, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_2.setBounds(151, 108, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_1_1.setBounds(217, 165, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_2_1.setBounds(151, 162, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_3.setBounds(19, 162, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(85, 162, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_4.setBounds(19, 216, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(85, 216, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_2_2.setBounds(151, 216, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_1_1_2 = new JButton("+");
		btnNewButton_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_1_2.setBounds(217, 220, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_3_1 = new JButton("1");
		btnNewButton_3_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_3_1.setBounds(19, 270, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("2");
		btnNewButton_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(85, 270, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("3");
		btnNewButton_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_2_1_1.setBounds(151, 270, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_4_1 = new JButton("0");
		btnNewButton_4_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_4_1.setBounds(19, 324, 113, 42);
		CalcWindow.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_1_3_1 = new JButton(".");
		btnNewButton_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_1_3_1.setBounds(151, 324, 47, 42);
		CalcWindow.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("=");
		btnNewButton_2_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnNewButton_2_1_1_1.setBounds(217, 275, 47, 91);
		CalcWindow.getContentPane().add(btnNewButton_2_1_1_1);
	}
}
