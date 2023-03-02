package Desafios;

import java.util.Scanner;

public class InvertandoString {

	public static void main(String[] args) {           
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Escreva uma palavra para ser invertida: ");
	    String x = entrada.next();
	    String invertido="";

	    for(int i=0;i<x.length();i++) {
	        invertido= x.charAt(i)+invertido;
	    }

	    System.out.println(invertido);
	    entrada.close();
	}
}
