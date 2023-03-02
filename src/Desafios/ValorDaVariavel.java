package Desafios;

public class ValorDaVariavel {
	public static void main(String[] args) {
		int Indice = 13;
		int Soma = 0;
		int K = 0;
		
		while(K < Indice) {
			K = K + 1;
			Soma = Soma + K;
		}
		
		System.out.println(Soma);
		
		//RESPOSTA: O valor da variavel soma é 91.
	}
}
