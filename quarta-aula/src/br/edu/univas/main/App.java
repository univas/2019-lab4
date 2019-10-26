package br.edu.univas.main;

import java.sql.SQLException;

import br.edu.univas.dao.ConnectionUtil;
import br.edu.univas.view.StudentFrame;

public class App {

	public static void main(String[] args) {
		
		try {
			ConnectionUtil.getConnection();
			System.out.println("SUCESSO!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		StudentFrame frame = new StudentFrame();
		frame.setVisible(true);
	}
	
}
