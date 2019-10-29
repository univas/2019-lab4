package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.dao.StudentDAO;
import br.edu.univas.vo.Student;

public class StudentList extends JPanel {

	private JTable studentTable;
	private StudentDAO studentDAO;
	
	public StudentList() throws SQLException {
		studentDAO = new StudentDAO();
		initialize();
	}
	
	private void initialize() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("Alunos Cadastrados:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		this.add(emailLabel, gbc);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("Nome");
		columnNames.add("CPF");
		columnNames.add("E-mail");
		//Vector<Student> vector = new Vector<Student>();
		Vector<? extends Vector> vector = new Vector();
		studentTable = new JTable(vector, columnNames);
		JScrollPane studentTableScroll = new JScrollPane(studentTable);
		studentTableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		studentTableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		studentTableScroll.setMinimumSize(new Dimension(750, 300));
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(studentTableScroll, gbc);
	}
	
	public void updateTable() {
		DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
		tableModel.setRowCount(0);
		
		for (Student student : studentDAO.getAll()) {
			Object[] data = {
					student.getName(),
					student.getCpf(),
					student.getEmail()
			};
			
			tableModel.addRow(data);
		}
	}
	
}
