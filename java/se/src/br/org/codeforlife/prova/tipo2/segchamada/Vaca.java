package br.org.codeforlife.prova.tipo2.segchamada;

public class Vaca {
	
	private int peso = 40;
	private String nome = "Vaconilda";
	private int altura = 10;
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String retornaNome() {
		return nome;
	}
	public void ajustaNome(String nome) {
		this.nome = nome;
	}
	public int retornaAltura() {
		return altura;
	}
	public void ajustaAltura(int altura) {
		this.altura = altura;
	}
}
