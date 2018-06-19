package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFactorial {

	public static void main(String[] args) {

		int num = 0;
		int cont1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("El factorial de un Numero");
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		
		  for(int cont = 1;cont <= num; cont++) {
			 cont1 = cont * cont1;
			
			 System.out.println("Factorial:"+cont+"Es igual a:"+cont1);
			 //holalala
			
		}
		
		
		

	}

}
