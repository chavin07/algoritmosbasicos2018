package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFibonacci {

	public static void main(String[] args) {
		
		int num = 0;
		int cont1 = 1;
		int fib = 0;
		int fib2 = 1;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Serei de Fibonacci");
		System.out.println("Dame un Numero:");
		num = sc.nextInt();
		System.out.println(fib2 + "");
		  for(int cont = 2;cont <=num;cont ++ ) {    	
		    cont1=fib;
		    fib=fib2;
		    fib2= cont1 + fib;
		    
		System.out.println(fib2+ "");
		
		}
		 

	}

}
