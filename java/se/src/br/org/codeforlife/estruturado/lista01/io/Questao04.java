/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.io;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao04 {

    public static void main(String args[]) {
        int valorCompra;
        int valorPago;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o valor da compra: ");
        valorCompra = leia.nextInt();
        System.out.println("informe o valor pago: ");
        valorPago = leia.nextInt();
        System.out.println("o troco e de: \n" + (valorPago - valorCompra));

    }
}
