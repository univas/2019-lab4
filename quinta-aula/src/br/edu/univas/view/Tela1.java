package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.dao.TimeDAO;
import br.edu.univas.vo.Time;

public class Tela1 extends JFrame {

	private TimeDAO dao;
	private JTextField nameTextField;
	private JTextField pontuationTextField;
	private JTable timeTable;
	
	public Tela1() {
		setTitle("Campeonato Brasileiro");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		try {
			dao = new TimeDAO();
			initialize();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void initialize() throws SQLException {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Time:");
		getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(64);
		getContentPane().add(nameTextField);
		
		JLabel pontuationLabel = new JLabel();
		pontuationLabel.setText("Pontuação:");
		getContentPane().add(pontuationLabel);
		
		pontuationTextField = new JTextField();
		pontuationTextField.setColumns(64);
		getContentPane().add(pontuationTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveTime();
			}
		});
		
		getContentPane().add(saveButton);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("Nome");
		columnNames.add("Pontuação");
		Vector<? extends Vector> vector = new Vector();
		
		timeTable = new JTable(vector, columnNames);
		JScrollPane timeTableScroll = new JScrollPane(timeTable);
		timeTableScroll.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		timeTableScroll.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		timeTableScroll.setPreferredSize(new Dimension(750, 450));
		getContentPane().add(timeTableScroll);
		updateTable();
	}
	
	private void saveTime() {
		Time time = new Time();
		time.setName(nameTextField.getText());
		Integer pontuation = Integer.parseInt(pontuationTextField.getText());
		time.setPontuation(pontuation);
		
		try {
			dao.save(time);
			updateTable();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void updateTable() throws SQLException {
		DefaultTableModel tableModel = (DefaultTableModel) timeTable.getModel();
		tableModel.setRowCount(0);
		
		for (Time time : dao.getAll()) {
			Object[] data = {
					time.getName(),
					time.getPontuation()
			};
			
			tableModel.addRow(data);
		}
	}
	
}
