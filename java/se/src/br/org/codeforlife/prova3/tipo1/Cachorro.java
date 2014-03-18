package br.org.codeforlife.prova3.tipo1;

public class Cachorro extends Animal {
	private int quantidadeDePelo;

	public int getQuantidadeDePelo() {
		return quantidadeDePelo;
	}

	public void setQuantidadeDePelo(int quantidadeDePelo) {
		this.quantidadeDePelo = quantidadeDePelo;
	}
	
	public void setPeso(int peso){
		super.setPeso(super.getPeso() + peso + 1);
	}
}
