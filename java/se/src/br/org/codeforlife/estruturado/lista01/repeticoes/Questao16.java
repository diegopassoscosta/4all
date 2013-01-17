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
public class Questao16 {

    public static void main(String[] args) {
        int limite;
        int s;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o limite do laço: ");
        limite = leia.nextInt();
        
        System.out.println("Informe o valor de S: ");
        s = leia.nextInt();
        
        for (int i=0; i < limite; ++i){
            s -= limite;
        }
        
        System.out.println("Valor de S: " + s);
        
    }
}
