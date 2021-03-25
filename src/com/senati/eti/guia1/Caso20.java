package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float venta=0;
		float aumento=0;
		System.out.print("Ingrese la venta : ");
		venta=sc.nextFloat();
		aumento= (float)(venta*0.2);
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Venta         : "+venta);
		System.out.println("Aumento (20%) : "+aumento);
		System.out.println("Final         : "+(venta+aumento));
	}
}
