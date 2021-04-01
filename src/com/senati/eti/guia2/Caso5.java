package com.senati.Iti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Precio:");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese Cantidad:");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad;
		float dscto = 0;
		
		if (cantidad > 8) dscto = (float) 0.1 * total;
		
		float neto = total - dscto;
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Total....:" + total);
		System.out.println("Descuento:" + dscto);
		System.out.println("Neto.....:" + neto);
		
		

	}

}
