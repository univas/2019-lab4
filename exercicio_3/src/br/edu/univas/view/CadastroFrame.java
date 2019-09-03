package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class CadastroFrame extends JFrame {

	private JPanel contentPane;
	
	public CadastroFrame() {
		setTitle("Prova");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setPreferredSize(new Dimension(150, 0));
		addLeftContent(leftPanel);
		contentPane.add(leftPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridBagLayout());
		addCenterContent(centerPanel);
		contentPane.add(centerPanel, BorderLayout.CENTER);
	}	

	private void addLeftContent(JPanel panel) {
		for (int i = 1; i < 11; i++) {
			JButton button = new JButton();
			button.setText("Botão " + i);
			panel.add(button);
		}
	}
	
	private void addCenterContent(JPanel centerPanel) {
		GridBagConstraints gbc = new GridBagConstraints();

		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(15, 15, 15, 15);
		centerPanel.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		centerPanel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(saveButton, gbc);
		
		String[] columnName = {
				"Nome", "CPF", "E-mail"
		};
		
		Object[][] tableData = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
		};
		
		JTable userTable = new JTable(tableData, columnName);
		userTable.setFillsViewportHeight(true);
		
		JScrollPane tableScroll = new JScrollPane(userTable);
		tableScroll.setMinimumSize(new Dimension(100, 100));
		tableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		centerPanel.add(tableScroll, gbc);
	}
}
