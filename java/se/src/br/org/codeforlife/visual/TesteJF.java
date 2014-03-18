/**
 * 
 */
package br.org.codeforlife.visual;

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
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new JMyPanel(), BorderLayout.CENTER);
		pack();
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
