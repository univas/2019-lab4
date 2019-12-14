package br.edu.univas.main;

import java.sql.SQLException;

import br.edu.univas.view.PasswordScreen;

public class App {

	public static void main(String[] args) {
		try {
			PasswordScreen screen = new PasswordScreen();
			screen.setVisible(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
