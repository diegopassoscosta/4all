package br.org.codeforlife.prova.tipo1;

public class Cachorro {
	//Atributo que guarda a característica do cachorro.
	private String nome;
	
	/**
	 * Método (ação) que ajusta o nome do cachorro
	 * @param novoNome
	 */
	public void ajustaNome(String novoNome){
		nome = novoNome;
	}
	
	/**
	 * Método (ação) que retorna o nome do cachorro
	 * @return
	 */
	public String retornaNome(){
		return nome;
	}
	
}

