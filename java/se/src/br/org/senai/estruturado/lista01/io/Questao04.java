/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.io;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao04 {

    public static void main(String args[]) {
        int valor_compra;
        int valor_pago;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o valor da compra: ");
        valor_compra = leia.nextInt();
        System.out.println("informe o valor pago: ");
        valor_pago = leia.nextInt();
        System.out.println("o troco e de: \n" + (valor_pago - valor_compra));

    }
}
