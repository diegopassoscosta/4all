/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.condicionais;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao6 {

    public static void main(String args[]) {
        float altura = 0.0f;
        char[] sexo = {'X'};
        Scanner leia = new Scanner(System.in);
        String leiac = leia.next();

        System.out.println("Informe a altura: ");
        altura = leia.nextFloat();

        System.out.println("informe o sexo - m ou f: ");
        sexo = leiac.toCharArray();

        if (sexo[0] == 'm') {
            System.out.println("o peso ideal e \n" + ((72.7 * altura) - 58));
        } else if (sexo[0] == 'f') {
            System.out.println("o peso ideal e: \n" + ((62.1 * altura) - 44.7));
        }
    }
}
