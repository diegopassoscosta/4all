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
    int primeiroLado;
    int segundoLado;
    int terceiroLado;
    Scanner leia = new Scanner(System.in);
    
    //solicitação do pedido
    System.out.println("Informe o primeiro lado: ");    
    primeiroLado = leia.nextInt();

    System.out.println("Informe o segundo lado: ");    
    segundoLado = leia.nextInt();
    
    System.out.println("Informe o terceiro lado: ");    
    terceiroLado = leia.nextInt();

    //calculos
    // | b - c | < a < b + c
    if( ( (Math.abs(segundoLado - terceiroLado)) < primeiroLado) && (primeiroLado < (segundoLado + terceiroLado) ) ){
        System.out.println("E um triangulo: ");
        
        //verifica qual o tipo do triagulo
        //Equilatero 3 lados iguaus
        //Escaleno 3 lados diferentes
        //Isosceles dois lados iguais escolhido por exclusão
        if ( (primeiroLado == segundoLado) && (primeiroLado == terceiroLado) && (segundoLado == terceiroLado) ){
             System.out.println("Equilatero\n");
        }else if ( (primeiroLado != segundoLado) && (primeiroLado != terceiroLado) && (segundoLado != terceiroLado) ){
              System.out.println("Escaleno\n");            
        }else{
              System.out.println("Isosceles\n");
        }
         
    }else{
          System.out.println("Nao e um triangulo\n");
    }          
    
    }  
}
