package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class StudentFrame extends JFrame {

	private JPanel contentPane;
	
	public StudentFrame() {
		setTitle("Cadastro de Alunos");
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
		nameLabel.setText("Nome");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(nameLabel, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.gridwidth = 3;
		contentPane.add(nameTextField, gbc);
		
		JLabel registryLabel = new JLabel();
		registryLabel.setText("Matricula");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.0;
		contentPane.add(registryLabel, gbc);
		
		JTextField registryTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		contentPane.add(registryTextField, gbc);
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF");
		gbc.gridx = 2;
		gbc.weightx = 0.0;
		contentPane.add(cpfLabel, gbc);
		
		JTextField cpfTextField = new JTextField();
		gbc.gridx = 3;
		gbc.weightx = 1.0;
		contentPane.add(cpfTextField, gbc);

		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		contentPane.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.gridwidth = 3;
		contentPane.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0.0;
		gbc.gridwidth = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(saveButton, gbc);
		
		Vector<String> columns = new Vector<>();
		columns.add("Nome");
		columns.add("Matricula");
		columns.add("CPF");
		columns.add("E-mail");
		
		JTable studentTable = new JTable(null, columns);
		
		JScrollPane studentTableScroll = new JScrollPane(studentTable);
		studentTableScroll.setMinimumSize(new Dimension(100, 350));
		studentTableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		studentTableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 1.0;
		gbc.gridwidth = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(studentTableScroll, gbc);
	}
}
