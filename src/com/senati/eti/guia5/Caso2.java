package com.senati.eti.guia5;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora2;

public class Caso2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float num1=0,num2=0;
		
		System.out.print("Ingrese el primer número : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese el segundo número : ");
		num2=sc.nextFloat();
		sc.close();
		Calculadora2 calc=new Calculadora2(num1,num2);

		
		System.out.println();
		System.out.println("NÚMEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Número 1 : "+calc.getNumero1());
		System.out.println("Número 2 : "+calc.getNumero2());
		System.out.println("");
		System.out.println("RESULTADO");
		System.out.println("1. Suma..................: "+calc.Operar(1));
		System.out.println("2. Resta.................: "+calc.Operar(2));
		System.out.println("3. Producto..............: "+calc.Operar(3));
		if(calc.getNumero2()==0) {
			System.out.println("4. Division..............: No es posible");
			System.out.println("5. Resto entero..........: No es posible");
		} else {
			System.out.println("4. Division..............: "+calc.Operar(4));
			System.out.println("5. Resto entero..........: "+(int)calc.Operar(5));
		}

		System.out.println("6. Promedo...............: "+calc.Operar(6));
		System.out.println("7. Suma de cuadrados.....: "+calc.Operar(7));
		System.out.println("8. Diferencia porcentual.: "+calc.Operar(8)+"%");
		
	}
}
