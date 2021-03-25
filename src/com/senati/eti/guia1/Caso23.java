package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String producto="";
		float precio=0;
		int cantidad=0;
		System.out.print("Producto : ");
		producto=sc.nextLine();
		System.out.print("Precio : ");
		precio=sc.nextFloat();
		System.out.print("Cantidad : ");
		cantidad=sc.nextInt();

		float importe=cantidad*precio;
		float igv=(float)(importe*0.18);
		float descuento=(float)(importe*0.3);
		sc.close();
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Producto  : "+producto);
		System.out.println("Precio : "+precio);
		System.out.println("Cantidad : "+cantidad);
		System.out.println("Importe : "+importe);
		System.out.println("IGV : "+igv);
		System.out.println("Descuento : "+descuento);
		System.out.println("Total : "+(importe+igv-descuento));

	}
}
