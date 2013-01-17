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
    float valor_da_conta = 0;
    float valor_da_gorgeta;
    float DEZ_PORCENTO = 0.1f;
    float valor_total;
    
    //solicitação do pedido
    System.out.println("Informe o valor da conta: ");    
    Scanner leia = new Scanner(System.in);
    
    valor_da_conta = leia.nextInt();
    
    //calculos
    valor_da_gorgeta = DEZ_PORCENTO * valor_da_conta;
    valor_total = valor_da_conta + valor_da_gorgeta;
    
    //demonstração do resultado
    System.out.println("valor da conta: %f\n" + valor_da_conta);
    System.out.println("valor da gorgeta: %f\n" + valor_da_gorgeta);
    System.out.println("porcentagem da gorgeta: %f\n" +DEZ_PORCENTO);
    System.out.println("valor do total da gorgeta: %f\n" +valor_total);
    }
}
