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
public class Questao07 {

    public static void main(String args[]) {
        //declaração de variáveis
    float valorDaConta = 0;
    float valorDaGorgeta;
    float DEZ_PORCENTO = 0.1f;
    float valorTotal;
    
    //solicitação do pedido
    System.out.println("Informe o valor da conta: ");    
    Scanner leia = new Scanner(System.in);
    
    valorDaConta = leia.nextInt();
    
    //calculos
    valorDaGorgeta = DEZ_PORCENTO * valorDaConta;
    valorTotal = valorDaConta + valorDaGorgeta;
    
    //demonstração do resultado
    System.out.println("valor da conta: %f\n" + valorDaConta);
    System.out.println("valor da gorgeta: %f\n" + valorDaGorgeta);
    System.out.println("porcentagem da gorgeta: %f\n" +DEZ_PORCENTO);
    System.out.println("valor do total da gorgeta: %f\n" +valorTotal);
    }
}
