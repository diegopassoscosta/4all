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
public class Questão9 {
     public static void main(String args[]){
    int numero = 0;
    int contador = 0;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("informe o numero: ");
    numero = leia.nextInt();
    
    int i = 1;
    while( i <= numero ){      
        
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
               ++contador;           
            }  
        }
    
        if (contador == 2){
           System.out.println("e primo "+ i);             
        }
        contador = 0;
        ++i;
    }
    }
}
