package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame {

	private JPanel content;
	
	public CalculatorFrame() {
		this.setTitle("Calculadora");
		this.setSize(300, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		initialize();
	}
		
	private void initialize() {
		content = new JPanel();
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 0, 0);
		content.setLayout(layout);
		this.setContentPane(content);
		
		Font btnFont = new Font("ARIAL", Font.BOLD, 20);
		JTextField valueTextField = new JTextField();
		valueTextField.setPreferredSize(new Dimension(292, 70));
		content.add(valueTextField);
		
		String[] buttonsContent = {"1", "2", "3", "4",
				"5", "6", "7", "8", "9", " + ", "0", " - "};
		
		for (String btnContent : buttonsContent) {
			JButton button = new JButton();
			button.setText(btnContent);
			button.setPreferredSize(new Dimension(97, 97));
			button.setFont(btnFont);
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String oldValue = valueTextField.getText();
					if (oldValue == null) {
						oldValue = btnContent;
					} else {
						oldValue += btnContent;
					}
					
					valueTextField.setText(oldValue);
				}
			});
			
			content.add(button);
		}
		
		JButton equalsButton = new JButton();
		equalsButton.setText("=");
		equalsButton.setPreferredSize(new Dimension(293, 112));
		equalsButton.setFont(btnFont);
		equalsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = valueTextField.getText();
				String[] pieces = text.split(" ");
				int result = 0;
				int a = Integer.parseInt(pieces[0]);
				int b = Integer.parseInt(pieces[2]);
				if (pieces[1].equals("+")) {
					result = a + b;
				} else {
					result = a - b;
				}
				
				valueTextField.setText(text + " = " + result);
			}
		});
		content.add(equalsButton);
	}
}
