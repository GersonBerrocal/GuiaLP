package com.senati.eti.guia1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad : ");
		float cantidad=sc.nextFloat();
		System.out.print("Ingrese precio :");
		float precio=sc.nextFloat();
		sc.close();
		float importe=cantidad*precio;
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Importe   : "+df.format(importe));
		System.out.println("En dólares   : "+df.format(importe*3.24));
		System.out.println("En euros   : "+df.format(importe*3.75));

	}
}
