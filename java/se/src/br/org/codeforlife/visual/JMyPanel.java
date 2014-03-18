package br.org.codeforlife.visual;

import java.awt.Graphics;

import javax.swing.JPanel;



public class JMyPanel extends JPanel {
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(0, 0, getSize().width, getSize().height);
		g.drawLine(0, getSize().height , getSize().width, 0);
	}

}
