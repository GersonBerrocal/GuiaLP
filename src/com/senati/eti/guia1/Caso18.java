package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int base=0,altura=0;
		
		System.out.print("Ingrese la base: ");
		base=sc.nextInt();
		System.out.print("Ingrese la altura: ");
		altura=sc.nextInt();
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Área del triangulo : "+base*altura/2);

	}
}
