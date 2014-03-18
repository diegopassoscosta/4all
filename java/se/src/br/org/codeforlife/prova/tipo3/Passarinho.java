package br.org.codeforlife.prova.tipo3;

public class Passarinho{
	//Atributo que guarda a caracter�stica do Passarinho.
	private int quantidadeDeAsas;
	
	/**
	 * M�todo (a��o) que ajusta a quantidade de asas do Passarinho
	 * @param novaIdade
	 */
	public void ajustaQuantidadeDeAsas(int novaQuantidadeDeAsas){
		quantidadeDeAsas = novaQuantidadeDeAsas;
	}
	
	/**
	 * M�todo (a��o) que retorna a quantidade de asas do Passarinho
	 * @return
	 */
	public int retornaQuantidadeDeAsas(){
		return quantidadeDeAsas;
	}
	
}


