/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.thread.jlabel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Diego Passos Costa
 */
public class JLabelMudante extends JLabel implements Runnable {

    private LinkedList<String> l = new LinkedList();
    private Iterator i;

    public JLabelMudante() {
        super();
        this.setText("JLabelMudante");
        l.add("oi");
        l.add("tchau");
        i = l.iterator();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (i.hasNext()) {
                    this.setText(i.next().toString());
                } else {
                    i = l.iterator();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(JLabelMudante.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
