package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre="";
		String apellido="";
		
		System.out.print("Ingrese nombre : ");
		nombre=sc.nextLine();
		System.out.print("Ingrese apellido : ");
		apellido=sc.nextLine();
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Alumno : "+nombre+" "+apellido);
	}
}
