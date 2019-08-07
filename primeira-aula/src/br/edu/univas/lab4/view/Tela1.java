package br.edu.univas.lab4.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.NumberFormat;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

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
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		getContentPane().add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(63);
		getContentPane().add(nameTextField);
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Senha:");
		getContentPane().add(passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setColumns(63);
		getContentPane().add(passwordField);
		
		JLabel valueLabel = new JLabel();
		valueLabel.setText("Taxa (%):");
		getContentPane().add(valueLabel);
		
		NumberFormat nFormat = NumberFormat.getIntegerInstance();
		nFormat.setMinimumFractionDigits(3);
		
		JFormattedTextField valueFormattedField = new JFormattedTextField(nFormat);
		valueFormattedField.setColumns(63);
		getContentPane().add(valueFormattedField);
		
		JLabel descriptionLabel = new JLabel();
		descriptionLabel.setText("Descrição:");
		getContentPane().add(descriptionLabel);
		
		JTextArea descriptionTextArea = new JTextArea();
		descriptionTextArea.setColumns(63);
		descriptionTextArea.setRows(10);
		getContentPane().add(descriptionTextArea);
		
		JLabel monthsLabel = new JLabel();
		monthsLabel.setText("Meses:");
		getContentPane().add(monthsLabel);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("Janeiro");
		listModel.addElement("Fevereiro");
		listModel.addElement("Março");
		listModel.addElement("Abril");
		listModel.addElement("Maio");
				
		JList<String> monthsList = new JList<String>(listModel);
		monthsList.setPreferredSize(new Dimension(700, 100));
		monthsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		getContentPane().add(monthsList);
		
		JLabel courseLabel = new JLabel();
		courseLabel.setText("Curso:");
		getContentPane().add(courseLabel);
		
		JComboBox<String> courseComboBox = new JComboBox<String>();
		courseComboBox.addItem("Sistemas de Informação");
		courseComboBox.addItem("Matemática");
		courseComboBox.addItem("História");
		courseComboBox.addItem("Pedagogia");
		courseComboBox.setPreferredSize(new Dimension(700, 40));
		getContentPane().add(courseComboBox);
		
	}
	
}
