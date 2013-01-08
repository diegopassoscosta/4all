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
public class Questao3 {
    
    public static void main(String args[]){
      //declaração de variáveis
    int primeiro_numero = 0;
    int segundo_numero = 0;
    Scanner leia = new Scanner(System.in);
    
    //solicitação do pedido
    System.out.println("Informe o primeiro numero: ");    
    primeiro_numero = leia.nextInt();

    System.out.println("Informe o segundo numero: ");    
    segundo_numero = leia.nextInt();
    
    //calculos
    for (; primeiro_numero <= segundo_numero; primeiro_numero++){
       System.out.println("\n" + primeiro_numero);    
   }
          
   }  
}
