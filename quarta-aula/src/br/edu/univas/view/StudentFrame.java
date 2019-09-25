package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.vo.Student;

public class StudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField cpfTextField; 
	private JTextField emailTextField;
	private JTable studentTable;
	
	public StudentFrame() {
		setSize(800, 640);
		setTitle("Cadastro de Aluno");
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
		
		nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(nameTextField, gbc);
		
		JLabel cpfLabel = new JLabel();
		cpfLabel.setText("CPF:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(cpfLabel, gbc);
		
		cpfTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(cpfTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(emailLabel, gbc);
		
		emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveNewStudent();
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(saveButton, gbc);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("Nome");
		columnNames.add("CPF");
		columnNames.add("E-mail");
		Vector<Student> vector = new Vector<Student>();
		studentTable = new JTable(vector, columnNames);
		JScrollPane studentTableScroll = new JScrollPane(studentTable);
		studentTableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		studentTableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		studentTableScroll.setMinimumSize(new Dimension(750, 300));
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(studentTableScroll, gbc);
	}
	
	private void saveNewStudent() {
		DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
		
		Object[] student = {
				nameTextField.getText(), 
				cpfTextField.getText(),
				emailTextField.getText()
		};
		
		tableModel.addRow(student);
	}
	
}
