/**
 * 
 */
package br.org.codeforlife.visual.one;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Diego
 *
 */
public class TesteJF extends JFrame {


	
	private void init(){
		JMyPanel x = new JMyPanel();
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(x, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
		
		Thread t1 = new Thread(x);
		t1.start();
	}
	/**
	 * @throws HeadlessException
	 */
	public TesteJF() throws HeadlessException {
		init();
	}

	/**
	 * @param arg0
	 */
	public TesteJF(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public TesteJF(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public TesteJF(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	


}
