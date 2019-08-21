package br.edu.univas.main;

import javax.swing.JFrame;

import br.edu.univas.view.TelaGridBagLayout;

public class App {

	public static void main(String[] args) {
		JFrame tela = null;
//		tela = new TelaFlowLayout();
//		tela = new TelaBorderLayout();
		tela = new TelaGridBagLayout();
		tela.setVisible(true);
	}
	
}
