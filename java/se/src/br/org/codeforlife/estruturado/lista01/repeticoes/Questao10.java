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
public class Questao10 {
    
    public static void main(String args[]){
    
    int numero = 0;
    int resultado = 0;
    
    Scanner leia = new Scanner(System.in);
     
    for (int i = 0; i < 300; i++){      
        System.out.println("informe um numero a ser somado: ");
        numero = leia.nextInt();
        resultado = resultado + numero;    
    }
       
    System.out.println("soma total: " + resultado);
    }  
}
