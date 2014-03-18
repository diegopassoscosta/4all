package br.org.codeforlife.prova2.tipo.ave;

public class Ave {
	
	private String cor;
	private int idade;
	private String saude;
	
	public String retornaCor() {
		return cor;
	}
	public void ajustaCor(String cor) {
		this.cor = cor;
	}
	public int retornaIdade() {
		return idade;
	}
	public void ajustaIdade(int idade) {
		this.idade = idade;
	}
	public String getSaude() {
		return saude;
	}
	public void setSaude(String saude) {
		this.saude = saude;
	}
}

