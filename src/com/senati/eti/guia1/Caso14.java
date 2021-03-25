package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sumatoria=0;
		System.out.print("Ingrese número : ");
		num=sc.nextInt();
		sc.close();
		
		int index=1;
		while (index<=num) {
			sumatoria+=index;
			index++;
		}
		
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Sumatoria : "+sumatoria);

	}
}
