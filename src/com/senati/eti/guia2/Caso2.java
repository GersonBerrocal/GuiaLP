package com.senati.Iti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero:");
		int n = sc.nextInt();
		
		String estado = "Numero es impar";
		
		if ( n % 2 == 0)
			estado = "Numero es par";
		System.out.println("----- RESULTADOS-----");
		System.out.println("Estado:" + estado );
		
	}

}
