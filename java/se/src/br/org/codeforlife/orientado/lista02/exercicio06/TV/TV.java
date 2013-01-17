/*
 * Classe TV: Faça um programa que simule um televisor criando-o como um objeto.
 * O usuário *deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.
 * Certifique-se *de que o número do canal e o nível do volume permanecem dentro de faixas válidas.
 */
package br.org.codeforlife.orientado.lista02.exercicio06.TV;

/**
 *
 * @author Diego Passos Csta
 */
public class TV {

    private final int CANALMINIMO = 0;
    private final int CANALMAXIMO = 15;
    private int canalCorrente = 0;
    private final int VOLUMEMINIMO = 0;
    private final int VOLUMEMAXIMO = 10;
    private int volumeCorrente = 0;

    /**
     *
     * @param novoCanal
     */
    public void ajustaCanal(int novoCanal) {

        if (novoCanal <= CANALMAXIMO || novoCanal >= CANALMINIMO) {
            canalCorrente = novoCanal;
        }


    }

    /**
     *
     * @param novoVolume
     */
    public void ajustaVolume(int novoVolume) {

        if (novoVolume <= VOLUMEMAXIMO || novoVolume >= VOLUMEMINIMO) {
            volumeCorrente = novoVolume;
        }



    }
}