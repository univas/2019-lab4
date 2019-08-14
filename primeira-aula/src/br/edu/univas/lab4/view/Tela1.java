package br.edu.univas.lab4.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

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
		courseComboBox.setPreferredSize(new Dimension(720, 40));
		getContentPane().add(courseComboBox);
		
		JCheckBox mondayCheckBox = new JCheckBox();
		mondayCheckBox.setText("Segunda-feira");
		mondayCheckBox.setSelected(true);
		getContentPane().add(mondayCheckBox);
		
		JCheckBox tuesdayCheckBox = new JCheckBox();
		tuesdayCheckBox.setText("Terça-feira");
		tuesdayCheckBox.setSelected(false);
		getContentPane().add(tuesdayCheckBox);
		
		JCheckBox wednesdayCheckBox = new JCheckBox();
		wednesdayCheckBox.setText("Quarta-feira");
		wednesdayCheckBox.setSelected(false);
		getContentPane().add(wednesdayCheckBox);
		
		JLabel periodLabel = new JLabel();
		periodLabel.setText("Período:");
		getContentPane().add(periodLabel);
		
		JRadioButton morningRadioButton = new JRadioButton();
		morningRadioButton.setText("Manhã");
		getContentPane().add(morningRadioButton);
		
		JRadioButton afternoonRadioButton = new JRadioButton();
		afternoonRadioButton.setText("Tarde");
		getContentPane().add(afternoonRadioButton);
		
		JRadioButton eveningRadioButton = new JRadioButton();
		eveningRadioButton.setText("Noite");
		getContentPane().add(eveningRadioButton);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(morningRadioButton);
		radioGroup.add(afternoonRadioButton);
		radioGroup.add(eveningRadioButton);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		getContentPane().add(saveButton);
		
		String[] columns = {"Nome", "E-mail", "Celular"};
		
		Object[][] data = {
				{"Rodrigo", "rodrigolfsi@gmail.com", "98273-4717"},
				{"João", "joao@gmail.com", "93123-5577"},
				{"Maria", "maria@gmail.com", "92273-4811"}
		};
		
		JTable studentTable = new JTable(data, columns);
		
		JScrollPane scrollStudentTable = new JScrollPane(studentTable);
		scrollStudentTable.setPreferredSize(new Dimension(720, 150));
		scrollStudentTable.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollStudentTable.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollStudentTable);
		
		
		
		
	}
	
}
