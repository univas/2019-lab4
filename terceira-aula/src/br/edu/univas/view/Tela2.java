package br.edu.univas.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.listener.ButtonListener;

public class Tela2 extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	
	public Tela2() {
		setTitle("Tela 2");
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
		//ButtonListener bListener = new ButtonListener();
		//saveButton.addActionListener(bListener);
		saveButton.addActionListener(new ButtonListener());
		contentPane.add(saveButton);
	}
	
}
