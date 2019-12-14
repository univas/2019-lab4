package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.univas.vo.ClientQueue;

public class ClientQueueDAO {

	private Connection connection;
	
	public ClientQueueDAO() throws SQLException {
		connection = ConnectionUtil.getConnection();
	}
	
	public void save(ClientQueue client) {
		String sql = "insert into client_queue (_password) values (?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int index = 1;
			statement.setInt(index++, client.getPassword());
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ClientQueue> getLastFiveAll() {
		List<ClientQueue> clientQueues = new ArrayList<>();
		
		String sql = "select * from client_queue order by _password desc limit 5";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				ClientQueue clientQueue = new ClientQueue();
				clientQueue.setPassword(result.getInt("_password"));
				clientQueues.add(clientQueue);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clientQueues;
	}
}
