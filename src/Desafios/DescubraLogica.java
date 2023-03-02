package Desafios;

public class DescubraLogica {

	public static void main(String[] args) {
		
		//PRIMEIRA LÓGICA
		int a = 1;
		for(int i = 0; i <= 4; i++) {
			System.out.print(a);
			System.out.print(", ");
			a = a + 2;
		}
		//RESPOSTA É 9, pois a sequência segue a base dos numeros impares
		
		System.out.println();
		
		//SEGUNDA LÓGICA
		int b = 2;
		for(int i = 0; i <= 6; i++) {
			System.out.print(b);
			System.out.print(", ");
			b = b * 2;
		}
		//RESPOSTA É 128, pois é a base da potência de 2
		
		System.out.println();
		
		//TERCEIRA LÓGICA
		int c = 0;
		int n = 1;
		for(int i = 0; i <= 6; i++) {
			c = c + n;
			n = n + 2;
			System.out.print(c);
			System.out.print(", ");
		}
		//RESPOSTA É 49, pois ele tem um adicional de um numero impar crescente a cada numero da sequência
		
		System.out.println();
		
		//QUARTA LÓGICA
		
		int d = 4;
		int pa = 12;
		for(int i = 0; i <= 4; i++) {
			System.out.print(d);
			System.out.print(", ");
			d = pa + d;
			pa = pa + 8;
		}
		//REPOSTA É 100, pois nesse caso ocorre a Progressão Aritmética de 8
		
		System.out.println();
		
		//QUINTA LÓGICA
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 0; i < 7; i++){
		    num1 = num1 + num2;
		    num2 = num1 - num2;
		    System.out.print(num1);
		    System.out.print(", ");
		}
		/* RESPOSTA É 13, pois nesse caso é a sequencia de Fibonacci, no qual se pega os dois ultimos numeros e 
		soma para obter o resultado do proximo */
		
		System.out.println();
		
		//SEXTA LÓGICA
		//A RESPOSTA É 200, pois todos os numeros descritos começam com a Letra D
	}
}
