package com.senati.eti.guia2;
import java.util.Scanner;
public class Caso4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Ingrese primer número : ");
		num1=sc.nextInt();
		System.out.print("Ingrese segundo número : ");
		num2=sc.nextInt();
		
		String res;
		
		if (num1==num2)
			res="Los números son  iguales";
		else if (num1>num2)
			res="El primer número es mayor";
		else
			res="El segundo número es mayor";
		
		System.out.println();
		System.out.println(res);
	}
}

