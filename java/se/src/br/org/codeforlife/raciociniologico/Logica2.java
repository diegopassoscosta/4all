package br.org.codeforlife.raciociniologico;

public class Logica2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int vet[] = {0, 1};
		int vetResp[] = { -1, -1, -1 };
		System.out.println(vet.length);
		for (int i = 0; i < vetResp.length; i++) {
			for (int j = 0; j < vet.length; j++) {

				if ( !(i>=vet.length) && (vetResp[i] == -1)) {
					vetResp[i] = vet[j];
				} else {
					if(i==0)
						vetResp[i] = vetResp[i] & vet[j];
					if(i==1)
						vetResp[i] = vetResp[i] | vet[j];
						
				}
				
			}
		}

		for (int i = 0; i < vetResp.length; i++) {
			System.out.print(vetResp[i]);
		}
	}

}
