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
public class Questao1 {

    public static void main(String args[]) {
        //declaração de variáveis
        int numero = 0;

        Scanner leia = new Scanner(System.in);
        
        //solicitação do pedido
        System.out.println("Informe um numero: ");
        numero = leia.nextInt();

        //calculos
        if (numero % 2 == 0) {
            System.out.println("E par\n");
        } else {
            System.out.println("E impar\n");
        }


    }
}
