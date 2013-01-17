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
public class Questao18 {

    public static void main(String args[]) {
        double tibroncio = 1.20;
        double asdrubal = 1.05;
        int anos = 0;
        while (asdrubal < tibroncio){
            asdrubal += 0.03;
            tibroncio += 0.02;
            ++anos;
        }
        System.out.println("anos para asdrubal ficar maior que tibroncio: " + anos);
    }
}
