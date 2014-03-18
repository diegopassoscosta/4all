package br.org.codeforlife.prova3.tipo3;

public class Gato extends Animal {
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setLargura(int largura){
		super.setLargura(super.getLargura() + largura + 3);
	}
}

