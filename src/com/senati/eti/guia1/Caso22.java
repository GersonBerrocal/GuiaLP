package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String nombre="";
		float nota1=0,nota2=0,nota3=0;
		System.out.print("Ingrese nombre : ");
		nombre=sc.nextLine();
		System.out.print("Ingrese la nota 1 : ");
		nota1=sc.nextFloat();
		System.out.print("Ingrese la nota 2 : ");
		nota2=sc.nextFloat();
		System.out.print("Ingrese la nota 3 : ");
		nota3=sc.nextFloat();
		
		float promedio=(float)( nota1*0.2+nota2*0.3+nota3*0.5);
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Alumno   : "+nombre);
		System.out.println("Promedio : "+promedio);

	}
}
