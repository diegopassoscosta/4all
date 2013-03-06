/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.jogo.spaceinvaders;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author lab01
 */
public class JButtonNave extends JButton implements Runnable {

    private int x = 0;
    private int y = 0;
    private JPanel jp;

    public void addPanel(JPanel jp) {
        this.jp = jp;
        this.jp.add(this);
        this.jp.repaint();
    }

    @Override
    public void run() {
        boolean volta = false;
        while (true) {
            try {
                
                Thread.sleep(20);
                if (!volta) {
                    if (this.getX() <= jp.getWidth() - this.getWidth()) {
                        this.setLocation(++x, y);
                        this.setText("indo");
                        volta = false;
                    } else {
                        volta = true;
                    } 
                }

                if (volta){
                    
                   volta = false;
                   x = 0; y = 0;
                   this.setLocation(x, y);
                   this.setText("voltando");
                  
                   
                }
                
                jp.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(JButtonNave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }




    }
}
