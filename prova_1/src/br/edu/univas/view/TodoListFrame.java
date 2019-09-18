package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TodoListFrame extends JFrame {

	private JPanel contentPane;
	
	public TodoListFrame() {
		setTitle("TODO List");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}

	private void initialize() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		Font titleFont = new Font("ARIAL", Font.BOLD, 30);
		JLabel titleLabel = new JLabel();
		titleLabel.setText("TODO LIST");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(titleFont);
		titleLabel.setPreferredSize(new Dimension(780, 50));
		contentPane.add(titleLabel);
		
		JLabel taskLabel = new JLabel();
		taskLabel.setText("New Task:");
		contentPane.add(taskLabel);
		
		JTextField taskTextField = new JTextField();
		taskTextField.setColumns(50);
		contentPane.add(taskTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Add");
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addNewTask(taskTextField.getText());
				taskTextField.setText(null);
			}
		});
		contentPane.add(saveButton);
	}
	
	private void addNewTask(String content) {
		JLabel taskLabel = new JLabel();
		taskLabel.setText(content);
		taskLabel.setPreferredSize(new Dimension(750, 50));
		contentPane.add(taskLabel);
		contentPane.validate();
	}
}
