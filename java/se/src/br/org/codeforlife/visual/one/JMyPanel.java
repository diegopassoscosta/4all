package br.org.codeforlife.visual.one;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JMyPanel extends JPanel implements Runnable {
	private Graphics g;
	private boolean frist = true;
	private int i = 10;
	public JMyPanel(){
		
		
		setSize(new Dimension(300, 300));
		setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.g = g;
		draw(g,this.i);
		repaint();
	}

	private void draw(Graphics g, int i) {
		for (int j = this.i; j < getSize().width;) {
			g.drawLine(0, j * 100, getSize().width, getSize().height);
			g.drawLine(0, getSize().height, getSize().width, 0);

			g.drawOval((int) Math.pow(2, i), (int) Math.pow(2, i),
					getSize().width, getSize().height);
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
				paintComponent(g);
				draw(g, i + 10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
