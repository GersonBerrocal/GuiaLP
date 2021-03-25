package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre="";
		
		System.out.print("Ingrese Nombre : ");
		nombre=sc.nextLine();
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Número de caracteres : "+nombre.length());

	}
}