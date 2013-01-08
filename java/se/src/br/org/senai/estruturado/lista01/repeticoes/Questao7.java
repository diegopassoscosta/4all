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
public class Questao7{
    
    public static void main(String args[]){
    int numero = 0;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("informe o numero: ");
    numero = leia.nextInt();
    
    for (int i = 1; i <= numero; i++){
        if (numero % i == 0){
           System.out.println(i);           
        }  
    }
    }  
}
