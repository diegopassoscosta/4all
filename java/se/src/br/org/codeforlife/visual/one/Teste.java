package br.org.codeforlife.visual.one;

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
			}
		});

	}

}
