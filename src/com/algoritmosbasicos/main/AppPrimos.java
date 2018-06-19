package com.algoritmosbasicos.main;
import java.util.Scanner;
public class AppPrimos {

	public static void main(String[] args) {
		int num=0;
		boolean isPrimo=true;
		String cRes = "";
		Scanner sc = new Scanner(System.in);
		do {
			isPrimo = true;
		System.out.println("Dame un numero");
		num= sc.nextInt();
		
		for(int cont=2;cont<num;cont++) {
			
			if(num%cont == 0) {
				isPrimo=false;
			}
		}
		
		System.out.println("El numero introducido es primo?:"+isPrimo);
		
		System.out.println("Desea volver a probar oprima S/N:");
		cRes= sc.next();
		}while(cRes=="s"||cRes=="S"); 
			System.out.println(cRes);
				
		  }
		
	}


