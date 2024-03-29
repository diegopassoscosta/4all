/*
 * Classe Conta
 * de Investimento: Faça uma classe contaInvestimento que seja semelhante a classe contaBancaria,
 * com a diferença de que se adicione um atributo taxaJuros. 
 * Forneça um construtor que configure tanto o saldo inicial como a taxa de juros.
 * Forneça um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta.
 * Escreva um programa que construa uma poupança com um saldo inicial de R$1000,00 e uma taxa de juros de 10%. 
 * Depois aplique o método adicioneJuros() cinco vezes e imprime o saldo resultante.
 */
package br.org.codeforlife.orientado.lista02.exercicio12.containvestimento;

/**
 *
 * @author Diego Passos Costa
 */
public class ContaInvestimento {
    private double saldoInicial;
    private double taxaDeJuros;
    
    public ContaInvestimento(double saldoInicial, double taxaDeJuros){
        this.saldoInicial = saldoInicial;
        this.taxaDeJuros = taxaDeJuros; 
    }
    
    public void adicioneJuros(){
        this.saldoInicial = this.saldoInicial + this.saldoInicial * this.taxaDeJuros;
    }
    
    public double saldoDaConta(){
        return this.saldoInicial;
    }
    
}
