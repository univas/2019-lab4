package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HelpDeskFrame extends JFrame {

	private JPanel contentPane;
	
	public HelpDeskFrame() {
		setTitle("Chamado");
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
		
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Help Desk");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15);
		contentPane.add(titleLabel, gbc);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.LINE_END;
		contentPane.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		contentPane.add(nameTextField, gbc);
		
		JLabel departmentLabel = new JLabel();
		departmentLabel.setText("Setor:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		contentPane.add(departmentLabel, gbc);
		
		JTextField departmentTextField = new JTextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		contentPane.add(departmentTextField, gbc);
		
		JLabel reasonLabel = new JLabel();
		reasonLabel.setText("Motivo:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		contentPane.add(reasonLabel, gbc);
		
		JTextField reasonTextField = new JTextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		contentPane.add(reasonTextField, gbc);
		
		JLabel priorityLabel = new JLabel();
		priorityLabel.setText("Prioridade:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0.0;
		contentPane.add(priorityLabel, gbc);
		
		JRadioButton lowPriorityRadioButton = new JRadioButton();
		lowPriorityRadioButton.setText("Baixa");
		
		JRadioButton mediumRadioButton = new JRadioButton();
		mediumRadioButton.setText("Média");
		
		JRadioButton highRadioButton = new JRadioButton();
		highRadioButton.setText("Urgente");
		
		ButtonGroup group = new ButtonGroup();
		group.add(lowPriorityRadioButton);
		group.add(mediumRadioButton);
		group.add(highRadioButton);
		
		JPanel optionPanel = new JPanel();
		optionPanel.add(lowPriorityRadioButton);
		optionPanel.add(mediumRadioButton);
		optionPanel.add(highRadioButton);
		
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridwidth = 2;
		contentPane.add(optionPanel, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Abrir Chamado");
		gbc.gridy = 6;
		contentPane.add(saveButton, gbc);
	}
	
}
