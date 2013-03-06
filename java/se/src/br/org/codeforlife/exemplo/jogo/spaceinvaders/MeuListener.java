/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.jogo.spaceinvaders;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lab01
 */
public class MeuListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ((JButtonNave)e.getSource()).setText("ola");
    }
    
}
