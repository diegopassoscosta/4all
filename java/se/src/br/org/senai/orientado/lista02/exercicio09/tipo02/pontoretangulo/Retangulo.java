/**
 * Classe Ponto e Retangulo: Faça um programa completo utilizando classes que:
 * Possua uma classe chamada Ponto, com os atributos x e y. Possua uma classe
 * chamada Retangulo, com os atributos largura e altura. Possua um método para
 * imprimir o valor de X da classe Ponto Possua um método para retornar o valor
 * de Y da classe Ponto Possua um método para encontrar o centro de um
 * Retângulo.
 */
package br.org.senai.orientado.lista02.exercicio09.tipo02.pontoretangulo;

/**
 *
 * @author Diego Passos Costa
 */
public class Retangulo {

    private double largura;
    private double altura;

    /**
     *
     * @return
     */
    public String centroDoRetangulo() {
        return "X: " + largura / 2 + " Y: " + altura / 2 + "";
    }
}
