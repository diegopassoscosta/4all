package br.org.codeforlife.prova.tipo2;

public class Cachorro {
	//Caracteristíca nome
	private String nome = "Rex";
	
	/**
	 * Ação ajustaNomeDoCachorro(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDoCachorro(String novoNome){
		nome = novoNome;
	} 
	
	/**
	 * Ação retornarNomeDoCachorro()
	 * @return
	 */
	public String retornaNomeDoCachorro(){
		return nome;
	}
}
