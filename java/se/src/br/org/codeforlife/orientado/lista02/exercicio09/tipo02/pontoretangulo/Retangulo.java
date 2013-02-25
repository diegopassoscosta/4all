/**
 * Classe Ponto e Retangulo: Faça um programa completo utilizando classes que:
 * Possua uma classe chamada Ponto, com os atributos x e y. Possua uma classe
 * chamada Retangulo, com os atributos largura e altura. Possua um método para
 * imprimir o valor de X da classe Ponto Possua um método para retornar o valor
 * de Y da classe Ponto Possua um método para encontrar o centro de um
 * Retângulo.
 */
package br.org.codeforlife.orientado.lista02.exercicio09.tipo02.pontoretangulo;

/**
 *
 * @author Diego Passos Costa
 */
public class Retangulo {

    private double largura;
    private double altura;
    Ponto p1 = new Ponto();
    Ponto p2 = new Ponto();
    Ponto p3 = new Ponto();
    Ponto p4 = new Ponto();

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
    
    
    
    }
    /**
     *
     * @return
     */
    public String centroDoRetangulo() {
        return "X: " + largura / 2 + " Y: " + altura / 2 + "";
    }
}
