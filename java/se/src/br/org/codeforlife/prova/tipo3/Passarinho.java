package br.org.codeforlife.prova.tipo3;

public class Passarinho{
	//Atributo que guarda a característica do Passarinho.
	private int quantidadeDeAsas;
	
	/**
	 * Método (ação) que ajusta a quantidade de asas do Passarinho
	 * @param novaIdade
	 */
	public void ajustaQuantidadeDeAsas(int novaQuantidadeDeAsas){
		quantidadeDeAsas = novaQuantidadeDeAsas;
	}
	
	/**
	 * Método (ação) que retorna a quantidade de asas do Passarinho
	 * @return
	 */
	public int retornaQuantidadeDeAsas(){
		return quantidadeDeAsas;
	}
	
}


