package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float gasto=0;
		float descuento=0;
		System.out.print("Ingrese la gasto : ");
		gasto=sc.nextFloat();
		descuento= (float)(gasto*0.12);
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Gasto           : "+gasto);
		System.out.println("Descuento (20%) : "+descuento);
		System.out.println("Final           : "+(gasto-descuento));
	}
}
