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
        int valorARetirar = 0;
        int restoDe50 = 0;
        int restoDe10 = 0;
        int restoDe5 = 0;
        int restoDe1 = 0;

        int quantidadeDeNotasDe50;
        int quantidadeDeNotasDe10;
        int quantidadeDeNotasDe5;
        int quantidadeDeNotasDe1;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o valor a ser retirado do caixa eletronico: ");
        valorARetirar = leia.nextInt();

        //calculos
        quantidadeDeNotasDe50 = valorARetirar / 50;
        restoDe50 = valorARetirar % 50;

        quantidadeDeNotasDe10 = restoDe50 / 10;
        restoDe10 = valorARetirar % 10;

        quantidadeDeNotasDe5 = restoDe10 / 5;
        restoDe5 = valorARetirar % 5;

        quantidadeDeNotasDe1 = restoDe5 / 1;

        //demonstração do resultado
        System.out.println("Numero de cedulas de 50 %d\n" + quantidadeDeNotasDe50);
        System.out.println("Numero de cedulas de 10 %d\n" +  quantidadeDeNotasDe10);
        System.out.println("Numero de cedulas de 5 %d\n"  + quantidadeDeNotasDe5);
        System.out.println("Numero de cedulas de 1 %d\n"  + quantidadeDeNotasDe1);

    }
}
