/**
 * Possua uma classe chamada Ponto, com os atributos x e y. 
 * Possua uma classe chamada Retangulo, com os atributos largura e altura. 
 * Possua uma função para imprimir os valores da classe Ponto Possua uma função para encontrar o centro
 * de um Retângulo. 
 * Você deve criar alguns objetos da classe Retangulo.
 * Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior
 * esquerdo do retângulo, que deve ser um objeto da classe Ponto.
 * A função para encontrar o centro do retângulo deve retornar o valor para um objeto do tipo
 * ponto que indique os valores de x e y para o centro do objeto. 
 * O valor do centro do objeto deve ser mostrado na tela 
 * Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo.
 */
package br.org.codeforlife.orientado.lista02.exercicio09.tipo02.pontoretangulo;


/**
 *
 * @author Diego Passos Costa
 */
public class Ponto {

    private int x;
    private int y;

    /**
     *
     * @return X
     */
    public int retornaX() {
        return getX();
    }

    /**
     *
     * @return Y
     */
    public int retornaY() {
        return getY();
    }

    /**
     *
     * @return A impressão de X e Y
     */
    public String imprimir() {
        return "valor de x: " + getX() + " valor de Y: " + getY();
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
