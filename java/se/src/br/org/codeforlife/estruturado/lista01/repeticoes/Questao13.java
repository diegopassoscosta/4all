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
public class Questao13 {

    public static void main(String args[]) {

        int numero = 0;
        int resultado_1 = 0;
        int resultado_2 = 0;
        int resultado_3 = 0;


        Scanner leia = new Scanner(System.in);

        System.out.println("informe um numero limite: ");
        numero = leia.nextInt();

        for (int i = 1; i < numero; i++) {
            resultado_1 = resultado_1 + 1 / i;
        }

        for (int i = 1; i < numero; i++) {

            if (i % 2 != 0) {
                resultado_3 = resultado_3 + 1 / i;
            } else {
                resultado_3 = resultado_3 - 1 / i;
            }

        }

        System.out.println("s1 = " + resultado_1);
        System.out.println("s2 = " + resultado_2);
        System.out.println("s3 = " + resultado_3);

    }
}
