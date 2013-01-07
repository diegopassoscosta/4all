/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista02.exercicio03.retangulo;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Principal {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        
        System.out.print("Informe a base");
        ret.mudarValorDaBase(leia.nextInt());
        
        System.out.print("Informe a altura");
        ret.mudarValorDaAltura(leia.nextInt());
        
        System.out.println("O valor da area é: " + ret.calcularAreaDoRetangulo());
        System.out.println("O valor do perimetro é: " + ret.calcularPerimetroDoRetangulo());
    }
}
