package com.senati.eti.guia2;
import java.util.Scanner;
public class Caso6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float sueldo=0;
		float impuesto=0;
		System.out.print("Ingrese el sueldo : ");
		sueldo=sc.nextFloat();
		
		if (sueldo>2800) {
			impuesto=(float) (0.05*sueldo);
		} else {
			impuesto=(float) (0.02*sueldo);
		}
		
		System.out.println("Impuesto calculado : "+impuesto);
	}
	
}
