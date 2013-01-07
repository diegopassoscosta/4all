/**
 * Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho
 * Eletrônico): Atributos: Nome, Fome, Saúde e Idade b. Métodos: Alterar Nome,
 * Fome, Saúde e Idade; Retornar Nome, Fome, Saúde e Idade Obs: Existe mais uma
 * informação que devemos levar em consideração, o Humor do nosso tamagushi,
 * este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um
 * campo calculado, então não devemos criar um atributo para armazenar esta
 * informação por que ela pode ser calculada a qualquer momento.
 */
package br.org.senai.orientado.lista02.exercicio07.bichinhovirtual;

/**
 *
 * @author Diego Passos Costa
 */
public class BichinhoVirtual {

    private String nome;
    private boolean fome;
    private boolean saude;
    private int Idade;

    public String humor() {

        String humor = null;
        if (!fome && saude) {
            humor = "Esta com bom humor";
        } else if (fome) {
            humor = "Zangado não tem comida";
        } else if (!saude) {
            humor = "Desmaiando esta sem saude";
        } else if (fome && !saude) {
            humor = "Ele não esta bem";
        }

        return humor;

    }
}
