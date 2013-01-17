/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.condicionais;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao2 {
    
    public static void main(String args[]){
               
    //declaração de variáveis
    int primeiro_lado;
    int segundo_lado;
    int terceiro_lado;
    Scanner leia = new Scanner(System.in);
    
    //solicitação do pedido
    System.out.println("Informe o primeiro lado: ");    
    primeiro_lado = leia.nextInt();

    System.out.println("Informe o segundo lado: ");    
    segundo_lado = leia.nextInt();
    
    System.out.println("Informe o terceiro lado: ");    
    terceiro_lado = leia.nextInt();

    //calculos
    // | b - c | < a < b + c
    if( ( (Math.abs(segundo_lado - terceiro_lado)) < primeiro_lado) && (primeiro_lado < (segundo_lado + terceiro_lado) ) ){
        System.out.println("E um triangulo: ");
        
        //verifica qual o tipo do triagulo
        //Equilatero 3 lados iguaus
        //Escaleno 3 lados diferentes
        //Isosceles dois lados iguais escolhido por exclusão
        if ( (primeiro_lado == segundo_lado) && (primeiro_lado == terceiro_lado) && (segundo_lado == terceiro_lado) ){
             System.out.println("Equilatero\n");
        }else if ( (primeiro_lado != segundo_lado) && (primeiro_lado != terceiro_lado) && (segundo_lado != terceiro_lado) ){
              System.out.println("Escaleno\n");            
        }else{
              System.out.println("Isosceles\n");
        }
         
    }else{
          System.out.println("Nao e um triangulo\n");
    }          
    
    }  
}
