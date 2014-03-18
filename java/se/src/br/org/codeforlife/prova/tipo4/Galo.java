package br.org.codeforlife.prova.tipo4;

public class Galo {
	//Caracteristíca nome
	private String primeiroNome = "Rex";
	
	/**
	 * Ação ajustaNomeDoGalo(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDoGalo(String novoNome){
		primeiroNome = novoNome;
	} 
	
	/**
	 * Ação retornarNomeDoGalo()
	 * @return
	 */
	public String retornarNomeDoGalo(){
		return primeiroNome;
	}
}
