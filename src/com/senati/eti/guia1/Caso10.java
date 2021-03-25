package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radio=0;
		final float PI=3.1416f;
		System.out.print("Ingrese el radio : ");
		radio=sc.nextInt();
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Área del circulo : "+(PI*(radio*radio)));
		System.out.println("Perímetro : "+radio*PI*2);
	}
}