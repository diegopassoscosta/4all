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
public class Questao08 {

    public static void main(String args[]) {

        //declaração de variáveis
        float valorDaConta;
        float valorDaGorgeta;
        float DEZ_PORCENTO = 0.1f;
        float valorTotal;

        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o valor da conta: ");
        valorDaConta = leia.nextInt();

        //calculos
        valorDaGorgeta = (DEZ_PORCENTO) * valorDaConta;
        valorTotal = valorDaConta + valorDaGorgeta;

        //demonstração do resultado
        System.out.println("valor da conta: \n" + valorDaConta);
        System.out.println("valor da gorgeta: \n" + valorDaGorgeta);
        System.out.println("porcentagem da gorgeta: \n" + DEZ_PORCENTO);
        System.out.println("valor do total da gorgeta: \n" + valorTotal);


    }
}
