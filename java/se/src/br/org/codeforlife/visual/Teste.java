package br.org.codeforlife.visual;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TesteJF t = new TesteJF();
				t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				t.setSize(new Dimension(300, 300));
				t.setVisible(true);
			}
		});

	}

}
