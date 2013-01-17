/**
 * Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome e
 * bucho (estomago) e pelo menos os métodos comer(), verBucho() e digerir().
 * Faça um programa ou teste interativamente, criando pelo menos dois macacos,
 * alimentando-os com pelo menos 3 alimentos diferentes e verificando o conteúdo
 * do estomago a cada refeição. Experimente fazer com que um macaco coma o
 * outro. É possível criar um macaco canibal?
 */
package br.org.codeforlife.orientado.lista02.exercicio08.macaco;

/**
 *
 * @author Diego Passos Costa
 */
public class Macaco {

    private String nome;
    private String bucho;

    /**
     * 
     * @param nomeAlimento 
     */
    public void comer(String nomeAlimento) {
        bucho = nomeAlimento;
    }

    /**
     * 
     * @return 
     */
    public String verBucho() {
        return this.bucho;
    }

    /**
     * 
     */
    public void digerir() {
        this.bucho = "nada no estomago";
    }
}
