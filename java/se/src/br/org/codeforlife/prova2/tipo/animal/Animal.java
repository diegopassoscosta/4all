package br.org.codeforlife.prova2.tipo.animal;

public class Animal {
	
	private int id;
	private int idade;
	private int peso;
	
	public int retornaId() {
		return id;
	}
	public void ajustaId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int retornaPeso() {
		return peso;
	}
	public void ajustaPeso(int peso) {
		this.peso = peso;
	}

}
