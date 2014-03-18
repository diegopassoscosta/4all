package br.org.codeforlife.prova.tipo2.segchamada;

public class Cachorro {
	
	private int altura;
	private int idade;
	private String raca;
	
	public int retorneAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}
	public void ajusteIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}
