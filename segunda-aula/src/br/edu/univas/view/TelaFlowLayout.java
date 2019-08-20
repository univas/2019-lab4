package br.edu.univas.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFlowLayout extends JFrame {

	private JPanel contentPane;
	
	public TelaFlowLayout() {
		setTitle("Flow Layout");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		//FlowLayout is already the default layout from "JPANEL"
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		setContentPane(contentPane);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		contentPane.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(50);
		contentPane.add(nameTextField);
		
	}
	
}
