package br.edu.univas.lab4.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela1 extends JFrame {

	public Tela1() {
		setSize(800, 640);
		setTitle("Olá Mundo!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		initialize();
	}
	
	private void initialize() {
		JLabel welcomeLabel = new JLabel();
		welcomeLabel.setText("Univás 2019");
		getContentPane().add(welcomeLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(70);
		getContentPane().add(nameTextField);
	}
	
}
