package br.edu.univas.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nameTextField;
	
	public Tela1() {
		setTitle("Tela 1");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}

	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		setContentPane(contentPane);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		contentPane.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(50);
		contentPane.add(nameTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.addActionListener(this);
		contentPane.add(saveButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Olá: " + nameTextField.getText());
	}
	
}
