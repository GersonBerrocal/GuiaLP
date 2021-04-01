package com.senati.Iti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Numero 1:");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese Numero 2:");
		int n2 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1==n2)
			mensaje = "Los numero son iguales";
		else if (n1 > n2)
			mensaje = "El primer Numero: "  + n1 + " Es mayor";
		else 
			mensaje = "El Segundo Numero: " + n2 + " Es mayor";
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Estado:" + mensaje);

	}

}
