/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao15 {

    public static void main(String args[]) {
        int numero = 0;
        int resultado_par = 0;
        int resultado_impar = 0;
        int contador_par = 0;
        int contador_impar = 0;

        Scanner leia = new Scanner(System.in);
        while (contador_par < 10) {
            System.out.println("informe um numero a ser somado: ");
            numero = leia.nextInt();
            if (numero % 2 == 0) {
                resultado_par = resultado_par + numero;
                ++contador_par;
            } else {
                resultado_impar = resultado_impar + numero;
                ++contador_impar;
            }
        }

        System.out.println("resultado par " + resultado_par);
        System.out.println("resultado impar " + resultado_impar / contador_impar);
    }
}
