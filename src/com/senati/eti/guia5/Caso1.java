package com.senati.eti.guia5;
import java.util.Scanner;

import com.senati.eti.modelo.Calculadora1;
public class Caso1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculadora1 calc=new Calculadora1();
		float num1=0,num2=0;
		
		System.out.print("Ingrese el primer número : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese el segundo número : ");
		num2=sc.nextFloat();
		sc.close();
		
		calc.setNumero1(num1);
		calc.setNumero2(num2);
		
		System.out.println();
		System.out.println("NÚMEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Número 1 : "+calc.getNumero1());
		System.out.println("Número 2 : "+calc.getNumero2());
		System.out.println("");
		System.out.println("RESULTADO");
		System.out.println("1. Suma         : "+calc.Sumar());
		System.out.println("2. Resta        : "+calc.Restar());
		System.out.println("3. Producto     : "+calc.Producto());
		if(calc.getNumero2()==0) {
			System.out.println("4. Division: No es posible");
			System.out.println("5. Resto entero : No es posible");
		} else {
			System.out.println("4. Division     : "+calc.Dividir());
			System.out.println("5. Resto entero : "+(int)calc.RestEntero());
		}

		System.out.println("6. Número mayor : "+calc.Mayor());
		System.out.println("6. Número menor : "+calc.Menor());
		
	}
}
