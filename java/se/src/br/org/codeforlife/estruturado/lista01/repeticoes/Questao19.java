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
public class Questao19 {
    
    public static void main(String args[]){
     //declaração das variáveis
        int numero = 0;
        int i = 1;
        int j = 0;
        int t = 0;
        int k = 0;

        Scanner leia = new Scanner(System.in);

        //solicitação das informações
        System.out.println("informe o numero: ");
        numero = leia.nextInt();

        //calculos 
        for (k = 0; k <= numero; k++) {
            t = i + j;
            i = j;
            j = t;
            if (j == numero) {
                System.out.println("pertence a sequencia de fibonacci\n");
            }
        }
    
    }  
}
