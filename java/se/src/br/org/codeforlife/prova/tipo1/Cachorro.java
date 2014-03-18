package br.org.codeforlife.prova.tipo1;

public class Cachorro {
	//Atributo que guarda a caracter�stica do cachorro.
	private String nome;
	
	/**
	 * M�todo (a��o) que ajusta o nome do cachorro
	 * @param novoNome
	 */
	public void ajustaNome(String novoNome){
		nome = novoNome;
	}
	
	/**
	 * M�todo (a��o) que retorna o nome do cachorro
	 * @return
	 */
	public String retornaNome(){
		return nome;
	}
	
}

