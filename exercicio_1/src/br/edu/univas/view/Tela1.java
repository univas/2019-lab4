package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Tela1 extends JFrame {

	public Tela1() {
		setTitle("Aprendendo Swing");
		setSize(635, 620);
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
		nameTextField.setColumns(23);
		getContentPane().add(nameTextField);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		getContentPane().add(emailLabel);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setColumns(23);
		getContentPane().add(emailTextField);
		
		JLabel addressLabel = new JLabel();
		addressLabel.setText("Endereço:");
		getContentPane().add(addressLabel);
		
		JTextField addressTextField = new JTextField();
		addressTextField.setColumns(38);
		getContentPane().add(addressTextField);
		
		JLabel numberLabel = new JLabel();
		numberLabel.setText("Nº:");
		getContentPane().add(numberLabel);
		
		JTextField numberTextField = new JTextField();
		numberTextField.setColumns(8);
		getContentPane().add(numberTextField);
		
		JLabel neighborhoodLabel = new JLabel();
		neighborhoodLabel.setText("Bairro:");
		getContentPane().add(neighborhoodLabel);
		
		JTextField neighborhoodTextField = new JTextField();
		neighborhoodTextField.setColumns(50);
		getContentPane().add(neighborhoodTextField);
		
		JLabel sexLabel = new JLabel();
		sexLabel.setText("Sexo:");
		getContentPane().add(sexLabel);
		
		JRadioButton maleRadioButton = new JRadioButton();
		maleRadioButton.setSelected(true);
		maleRadioButton.setText("Masculino");
		getContentPane().add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton();
		femaleRadioButton.setText("Feminino");
		getContentPane().add(femaleRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleRadioButton);
		group.add(femaleRadioButton);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.setPreferredSize(new Dimension(450, 25));
		getContentPane().add(saveButton);
		
		String[] columnName = {
				"Nome", "E-mail", "Sexo"
		};
		
		Object[][] tableData = {
				{"Maria", "maria@gmail.com", "Feminino"},
				{"Lívia", "livia@gmail.com", "Feminino"},
				{"Luiza", "luiza@gmail.com", "Feminino"},
				{"João", "joao@gmail.com", "Masculino"},
				{"Juliana", "juliana@gmail.com", "Feminino"},
				{"José", "jose@gmail.com", "Masculino"}
		};
		
		JTable userTable = new JTable(tableData, columnName);
		userTable.setFillsViewportHeight(true);
		
		JScrollPane tableScroll = new JScrollPane(userTable);
		tableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(tableScroll);
		
		
		
	}
	
}
