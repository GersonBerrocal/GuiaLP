package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1=0,num2=0;
		
		System.out.print("Ingrese el primer número : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese el segundo número : ");
		num2=sc.nextFloat();
		sc.close();
		System.out.println("------------------");
		System.out.println("Números ingresados");
		System.out.println("------------------");
		System.out.println("Primer número : "+num1);
		System.out.println("Segundo número : "+num2);
	}
}
