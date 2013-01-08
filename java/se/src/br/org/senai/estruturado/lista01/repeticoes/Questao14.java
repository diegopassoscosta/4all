/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao14 {

    public static void main(String args[]) {
        int numero = 0;
        int resultado = 0;

        Scanner leia = new Scanner(System.in);

        while (numero != -1) {
            System.out.println("informe um numero a ser somado: ");
            numero = leia.nextInt();
            if (numero != -1) {
                resultado = resultado + numero;
            }
        }

        System.out.println("soma total: " + resultado);
    }
}
