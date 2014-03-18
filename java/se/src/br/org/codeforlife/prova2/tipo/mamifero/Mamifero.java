package br.org.codeforlife.prova2.tipo.mamifero;

public class Mamifero {
	private int quantidadeDeOlhos;
	private String sexo;
	private int peso;
	
	public int retornaQuantidadeDeOlhos() {
		return quantidadeDeOlhos;
	}
	public void ajustaQuantidadeDeOlhos(int quantidadeDeOlhos) {
		this.quantidadeDeOlhos = quantidadeDeOlhos;
	}
	public String retornaSexo() {
		return sexo;
	}
	public void ajustaSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}

