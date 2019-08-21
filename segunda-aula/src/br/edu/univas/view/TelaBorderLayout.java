package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaBorderLayout extends JFrame {

	private JPanel contentPane;
	
	public TelaBorderLayout() {
		setTitle("Border Layout");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.setPreferredSize(new Dimension(0, 40));
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.YELLOW);
		westPanel.setPreferredSize(new Dimension(100, 500));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.GREEN);
		centerPanel.setPreferredSize(new Dimension(350, 500));
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.PINK);
		eastPanel.setPreferredSize(new Dimension(150, 500));
		contentPane.add(eastPanel, BorderLayout.EAST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.RED);
		southPanel.setPreferredSize(new Dimension(0, 100));
		contentPane.add(southPanel, BorderLayout.SOUTH);
	}
	
}
