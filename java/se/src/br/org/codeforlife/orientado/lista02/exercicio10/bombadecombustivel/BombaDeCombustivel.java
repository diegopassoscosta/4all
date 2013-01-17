/*
 * Classe Bomba de Combustível: Faça um programa completo utilizando classes e métodos que:
 *
 *Possua uma classe chamada bombaCombustível, com no mínimo esses atributos:
 *tipoCombustivel.
 *valorLitro
 *quantidadeCombustivel
 *Possua no mínimo esses métodos:
 *abastecerPorValor( ) – método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo --> valor pago dividido pelo valor por litro

 *abastecerPorLitro( ) – método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
 *alterarValor( ) – altera o valor do litro do combustível.
 *alterarCombustivel( ) – altera o tipo do combustível.
 *alterarQuantidadeCombustivel( ) – altera a quantidade de combustível restante na bomba.
 *OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.
 */
package br.org.codeforlife.orientado.lista02.exercicio10.bombadecombustivel;

/**
 *
 * @author Diego Passos Costa
 */
public class BombaDeCombustivel {

    private String tipoCombustivel;
    private double valorPorLitro;
    private int quantidadeCombustivel;

    public double abstecerPorValor(double valorPago) {
        // explicar por que em geral pode ser aconselhavelnao usar o system.out.prinln
        double litrosAbastecidos = valorPago / valorPorLitro;
        alterarQuantidaDeCombustivel(litrosAbastecidos);
        return litrosAbastecidos;
    }

    public double abastecerPorLitros(double litrosDesejados) {
        alterarQuantidaDeCombustivel(litrosDesejados);
        return litrosDesejados / valorPorLitro;

    }

    public void alterarValor(double novoValor) {
        valorPorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
    }

    private void alterarQuantidaDeCombustivel(double litrosVendidos) {
        quantidadeCombustivel -= litrosVendidos;
    }
}
