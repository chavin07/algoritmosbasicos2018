	package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMostrarNombres {

	public static void main(String[] args) {
		String sNombre="";
		int cont2 = 0;
		Scanner sc = new Scanner(System.in);
		
		//Ciclo for____________
		
		System.out.println("Dame un nombre");
		sNombre = sc.nextLine();
		
		for(int cont=0;cont<10;cont ++) {
			
			System.out.println("Hola " +sNombre);
			
	}
		//Ciclo while
		System.out.println("Dame tu nombre");
		sNombre = sc.nextLine();
		while(cont2<10) {
			System.out.println("Hola"+sNombre);
			cont2++;
		}

			
		
		//ciclo _________do while
		cont2=0;
		System.out.println("Dame tu nombre:");
		sNombre =sc.nextLine();
		do
		{
			System.out.println("HOla"+sNombre);
			cont2++;
			
		}while(cont2<10);
   }
} 

