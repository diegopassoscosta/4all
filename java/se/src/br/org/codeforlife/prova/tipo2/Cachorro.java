package br.org.codeforlife.prova.tipo2;

public class Cachorro {
	//Caracterist�ca nome
	private String nome = "Rex";
	
	/**
	 * A��o ajustaNomeDoCachorro(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDoCachorro(String novoNome){
		nome = novoNome;
	} 
	
	/**
	 * A��o retornarNomeDoCachorro()
	 * @return
	 */
	public String retornaNomeDoCachorro(){
		return nome;
	}
}
