package br.org.codeforlife.prova.tipo4;

public class Galo {
	//Caracterist�ca nome
	private String primeiroNome = "Rex";
	
	/**
	 * A��o ajustaNomeDoGalo(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDoGalo(String novoNome){
		primeiroNome = novoNome;
	} 
	
	/**
	 * A��o retornarNomeDoGalo()
	 * @return
	 */
	public String retornarNomeDoGalo(){
		return primeiroNome;
	}
}
