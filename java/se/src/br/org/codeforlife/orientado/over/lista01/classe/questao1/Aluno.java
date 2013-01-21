/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao1;

/**
 *
 * @author Diego Passos Costa
 */
public class Aluno {

    private int matricula;
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;
    private int trabalho;
    private final double PESOPROVA = 2.5;
    private final double PESOTRABALHO = 2;
    private final double MEDIAFINAL = 7;

    /**
     * 
     * @return 
     */
    public double mediaFinal() {
        return (nota1 * PESOPROVA + nota2 * PESOPROVA + nota3 * PESOPROVA)
                / (trabalho * PESOTRABALHO);
    }

    /**
     * 
     * @return 
     */
    public double valorParaProvaFinal() {
        double resultado = 0;
        if (mediaFinal() < MEDIAFINAL) {
            resultado = MEDIAFINAL - mediaFinal();
        }
        return resultado;

    }
}
