package br.org.codeforlife.prova2.tipo.reptil;

public class Reptil {
	private int temperatura;
	private int peso;
	private int altura;
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int retornaAltura() {
		return altura;
	}
	public void ajustaAltura(int altura) {
		this.altura = altura;
	}
}

