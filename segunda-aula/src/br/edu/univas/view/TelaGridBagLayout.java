package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaGridBagLayout extends JFrame {

	private JPanel contentPane;
	
	public TelaGridBagLayout() {
		setTitle("Grid Bag Layout");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
				
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(15, 15, 15, 15);
		contentPane.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		contentPane.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		contentPane.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		contentPane.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		contentPane.add(saveButton, gbc);
	}
	
}
