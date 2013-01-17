/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.io;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao05 {

    public static void main(String args[]) {
        //declaração de variáveis
        int valor_a_retirar = 0;
        int resto_de_50 = 0;
        int resto_de_10 = 0;
        int resto_de_5 = 0;
        int resto_de_1 = 0;

        int quantidade_de_notas_de_50;
        int quantidade_de_notas_de_10;
        int quantidade_de_notas_de_5;
        int quantidade_de_notas_de_1;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o valor a ser retirado do caixa eletronico: ");
        valor_a_retirar = leia.nextInt();

        //calculos
        quantidade_de_notas_de_50 = valor_a_retirar / 50;
        resto_de_50 = valor_a_retirar % 50;

        quantidade_de_notas_de_10 = resto_de_50 / 10;
        resto_de_10 = valor_a_retirar % 10;

        quantidade_de_notas_de_5 = resto_de_10 / 5;
        resto_de_5 = valor_a_retirar % 5;

        quantidade_de_notas_de_1 = resto_de_5 / 1;

        //demonstração do resultado
        System.out.println("Numero de cedulas de 50 %d\n" + quantidade_de_notas_de_50);
        System.out.println("Numero de cedulas de 10 %d\n" +  quantidade_de_notas_de_10);
        System.out.println("Numero de cedulas de 5 %d\n"  + quantidade_de_notas_de_5);
        System.out.println("Numero de cedulas de 1 %d\n"  + quantidade_de_notas_de_1);

    }
}
