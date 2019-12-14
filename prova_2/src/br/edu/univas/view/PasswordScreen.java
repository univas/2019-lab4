package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import br.com.univas.vo.ClientQueue;
import br.edu.univas.dao.ClientQueueDAO;

public class PasswordScreen extends JFrame {

	private ClientQueueDAO dao;
	private List<ClientQueue> clients;
	private DefaultListModel<String> defaultList;
	private JLabel currentPasswordLabel;
	
	public PasswordScreen() throws SQLException {
		dao = new ClientQueueDAO();
		setTitle("Senhas");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		initialize();
	}

	private void initialize() {
		Font btnFont = new Font("ARIAL", Font.BOLD, 25);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 20, 20, 20);
		gbc.anchor = GridBagConstraints.CENTER;
		
		currentPasswordLabel = new JLabel();
		currentPasswordLabel.setFont(btnFont);
		gbc.gridy = 0;
		getContentPane().add(currentPasswordLabel, gbc);
		
		JButton nextPasswordButton = new JButton();
		nextPasswordButton.setFont(btnFont);
		nextPasswordButton.setText("Próxima Senha");
		nextPasswordButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				callNextPassword();
			}
		});
		gbc.gridy = 1;
		getContentPane().add(nextPasswordButton, gbc);
		
		JLabel lastPasswordLabel = new JLabel();
		lastPasswordLabel.setFont(btnFont);
		lastPasswordLabel.setText("Últimas Senhas:");
		gbc.gridy = 2;
		gbc.insets = new Insets(2, 2, 2, 2);
		getContentPane().add(lastPasswordLabel, gbc);
		
		defaultList = new DefaultListModel<>();
		
		JList<String> lastPasswordList = new JList<>();
		lastPasswordList.setFont(btnFont);
		lastPasswordList.setModel(defaultList);
		lastPasswordList.setPreferredSize(new Dimension(400, 200));
		
		gbc.gridy = 3;
		getContentPane().add(lastPasswordList, gbc);
		
		updateScreen();
	}
	
	private void callNextPassword() {
		int nextPassword = clients.get(0).getPassword();
		ClientQueue c = new ClientQueue();
		c.setPassword(++nextPassword);
		
		dao.save(c);
		updateScreen();
	}
	
	private void updateScreen() {
		clients = dao.getLastFiveAll();
		
		currentPasswordLabel.setText("Senha Atual: " + clients.get(0).getPassword());
		
		defaultList.clear();
		for (int i = 1; i < clients.size(); i++) {
			defaultList.addElement(String.valueOf(clients.get(i).getPassword()));
		}
	}
	
}
