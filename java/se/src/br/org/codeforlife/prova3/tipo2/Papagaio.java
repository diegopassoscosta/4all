package br.org.codeforlife.prova3.tipo2;

public class Papagaio extends Animal {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAltura(int altura){
		super.setAltura(super.getAltura() + altura + 2);
	}
}
