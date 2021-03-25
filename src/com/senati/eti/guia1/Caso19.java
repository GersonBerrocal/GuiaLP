package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lado1=0;
		int lado2=0;
		int lado3=0;
		
		System.out.print("Ingrese lado 1: ");
		lado1=sc.nextInt();
		System.out.print("Ingrese lado 2: ");
		lado2=sc.nextInt();
		System.out.print("Ingrese lado 3: ");
		lado3=sc.nextInt();
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Perimetro del triangulo : "+(lado1+lado2+lado3));

	}
}
