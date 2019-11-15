package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Time;

public class TimeDAO {

	private Connection connection;
	
	public TimeDAO() throws SQLException {
		connection = ConnectionUtil.getConnection();
	}
	
	public void save(Time time) throws SQLException {
		
		String sql = "insert into campeonato_brasileiro(time, pontuacao)"
				+ " values (?, ?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, time.getName());
		statement.setInt(2, time.getPontuation());
		
		statement.execute();
	}
	
	public List<Time> getAll() throws SQLException {
		List<Time> time = new ArrayList<>();
		
		String sql = "select * from campeonato_brasileiro";
		
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		while (result.next()) {
			Time t = new Time();
			t.setName(result.getString("time"));
			t.setPontuation(result.getInt("pontuacao"));
			time.add(t);
		}
		
		return time;
	}
	
}
