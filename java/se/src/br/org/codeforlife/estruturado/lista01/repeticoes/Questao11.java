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
public class Questao11 {
    
    public static void main(String args[]){
    int primeiro_numero = 0;
    int segundo_numero = 0;
    int contador = 0;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("informe o primero numero: ");
    primeiro_numero = leia.nextInt();
    
    System.out.println("informe o segundo numero: ");
    segundo_numero = leia.nextInt();
    
    for (int i = primeiro_numero; i <= segundo_numero; i++){      
        
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
               ++contador;           
            }  
        }
    
        if (contador == 2){
           System.out.println("e primo" + i);             
        }
        contador = 0;
      
    }
    }  
}
