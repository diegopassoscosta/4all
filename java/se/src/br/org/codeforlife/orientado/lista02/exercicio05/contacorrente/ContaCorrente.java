/*
 * Classe Conta Corrente: Crie uma classe para implementar uma conta corrente.
 * A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo.
 * Os métodos são os seguintes: alterarNome, depósito e saque; 
 * No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package br.org.codeforlife.orientado.lista02.exercicio05.contacorrente;

/**
 *
 * @author Diego Passos Costa
 */
public class ContaCorrente {

    private int numeroDaConta;
    private String nomeDoCorrentista;
    private double saldo;

    /**
     * 
     * @param numeroDaConta
     * @param nomeDoCorrentista 
     */
    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    /**
     * 
     * @param numeroDaConta
     * @param nomeDoCorrentista
     * @param saldo 
     */
    public void ContaCorrente(int numeroDaConta, String nomeDoCorrentista, int saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    /**
     * 
     * @param nome 
     */
    public void alteraNome(String nome) {
        nomeDoCorrentista = nome;
    }

    /**
     * 
     * @param saldo 
     */
    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    /**
     * 
     * @param saque 
     */
    public void saque(double saque) {
        this.saldo -= saque;
    }
}
