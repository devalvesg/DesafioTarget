package Desafios;

import java.util.ArrayList;
import java.util.List;

public class SequenciaDeFibonacci {
	public static void main(String[] args) {
		long num1 = 1, num2 = 0;
	        
	    System.out.print(num2);
	    System.out.print(", ");
	    System.out.print(num1);
	    List<Long> list = new ArrayList<>();
	    
	    for(int i = 0; i < 30; i++){
	    num1 = num1 + num2;
	    num2 = num1 - num2;
	    System.out.print(", ");
	    System.out.print(num1);
	    list.add(num1);
	    }  
	    System.out.println();
	   
	    if(list.contains(55L)) {
	    	System.out.println("O numero digitado está na lista");
	    }
	    System.out.println("O numero digitado não está na lista");

	}
}


