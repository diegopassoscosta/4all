/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.jogo.quebracabeca;

import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Diego Passos Costa
 */
public class Game {

    private List<JButton> listaBotoes;
    private JButton jButtonAnterior;
    private boolean clicado = false;
    private String texto;

    public Game(List<JButton> listaBotoes) {
        this.listaBotoes = listaBotoes;
    }

    public void botaoClicado(MouseEvent evt) {
        if (!clicado) {
            texto = ((JButton) evt.getSource()).getText();
            jButtonAnterior = ((JButton) evt.getSource());
            clicado = true;
        } else if (clicado) {
            jButtonAnterior.setText(((JButton) evt.getSource()).getText());
            ((JButton) evt.getSource()).setText(texto);
            System.out.println(((JButton) evt.getSource()).getText());
            System.out.println(((JButton) evt.getSource()).getName());
            clicado = false;
        }
        
    }

    public void randomize() {
        Collections.shuffle(listaBotoes);

        listaBotoes.get(0).setText("" + listaBotoes.indexOf(listaBotoes.get(0)));
        listaBotoes.get(1).setText("" + listaBotoes.indexOf(listaBotoes.get(1)));
        listaBotoes.get(2).setText("" + listaBotoes.indexOf(listaBotoes.get(2)));
        listaBotoes.get(3).setText("" + listaBotoes.indexOf(listaBotoes.get(3)));
        listaBotoes.get(4).setText("" + listaBotoes.indexOf(listaBotoes.get(4)));
        listaBotoes.get(5).setText("" + listaBotoes.indexOf(listaBotoes.get(5)));
        listaBotoes.get(6).setText("" + listaBotoes.indexOf(listaBotoes.get(6)));
        listaBotoes.get(7).setText("" + listaBotoes.indexOf(listaBotoes.get(7)));
        listaBotoes.get(8).setText("" + listaBotoes.indexOf(listaBotoes.get(8)));

    }

    private boolean checkVitoria(MouseEvent evt) {

        return true;
    }
}
