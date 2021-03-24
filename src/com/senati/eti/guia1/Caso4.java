package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1=0,num2=0;
		
		System.out.print("Ingrese el primer número : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese el segundo número : ");
		num2=sc.nextFloat();
		
		
		System.out.println("---------------");
		System.out.println("RESULTADOS");
		System.out.println("---------------");
		System.out.println("Suma : "+(num1+num2));
		System.out.println("Resta : "+(num1-num2));
		System.out.println("Producto : "+(num1*num2));
		System.out.println("Division : "+(num1/num2));
		System.out.println("Resto : "+(num1%num2));
	}
}
