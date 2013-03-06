/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao3;

import br.org.codeforlife.orientado.over.lista01.classe.questao2.Data;

/**
 *
 * @author Diego Passos Costa
 */
public class Voo {

    protected boolean[] cadeiras = new boolean[100];
    protected int cadeirasLivres = 100;
    private int numeroDoVoo;
    private Data data;

    public Voo(int numeroDoVoo, Data data) {
        this.numeroDoVoo = numeroDoVoo;
        this.data = data;

    }

    public int proximoLivre() {
        int i = 0;
        while (cadeiras[i] == true) {
            ++i;
        }
        return i + 1;
    }

    public boolean ocupa(int cadeira) {
        boolean retorno = false;
        if (cadeira > 0 && cadeira < 100) {
            if (cadeiras[cadeira - 1] == false) {
                cadeiras[cadeira - 1] = true;
                retorno = true;
                --cadeirasLivres;
            }
        }
        return retorno;
    }

    /**
     * @return o numeroDoVoo
     */
    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }

    /**
     * @return a data do voo
     */
    public Data getData() {
        return data;
    }

    @Override
    public Voo clone() {
        Voo clone = new Voo(this.numeroDoVoo, this.data);
        clone.cadeiras = this.cadeiras;
        clone.cadeirasLivres = this.cadeirasLivres;
        return clone;
    }
}
