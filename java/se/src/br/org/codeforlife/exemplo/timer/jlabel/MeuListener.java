/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.timer.jlabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JLabel;

/**
 *
 * @author lab01
 */
public class MeuListener implements ActionListener {

    private LinkedList<String> l = new LinkedList();
    private Iterator i;
    JLabel jLabelTexoMudante;

    public MeuListener(JLabel jLabelTexoMudante) {
        this.jLabelTexoMudante = jLabelTexoMudante;
        l.add("oi");
        l.add("tchau");
        i = l.iterator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (i.hasNext()) {
                jLabelTexoMudante.setText(i.next().toString());
            } else {
                i = l.iterator();    
            }
    }
}
