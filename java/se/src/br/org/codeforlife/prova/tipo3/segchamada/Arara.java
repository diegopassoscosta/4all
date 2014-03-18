package br.org.codeforlife.prova.tipo3.segchamada;

public class Arara {
		
	private int quantidadeDePena;
	private int idade;
	private String raca;
	
	public int retornaQuantidadeDePena() {
		return quantidadeDePena;
	}
	public void ajustaQuantidadeDePena(int quantidadeDePena) {
		this.quantidadeDePena = quantidadeDePena;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String retornaRaca() {
		return raca;
	}
	public void ajustaRaca(String raca) {
		this.raca = raca;
	}
}
