package com.senati.eti.guia1;

public class Caso6 {
	public static void main(String[] args) {
		int rpta1=(int) Math.pow(5,3);
		float rpta2=(float)Math.pow(81,1/2.0);
		float rpta3=(float)Math.pow(125,1/3.0);
		float rpta4=(float)Math.pow(256,1/4.0)+(float)Math.pow(25, 1/2.0);
		System.out.println("---------");
		System.out.println("Resultado");
		System.out.println("---------");
		System.out.println("Resultado 1 (5^3): "+rpta1);
		System.out.println("Resultado 2 (raiz de 81): "+rpta2);
		System.out.println("Resutado 3 (raiz cubica de 125): "+rpta3);
		System.out.println("Resultado 4 : "+rpta4);
	}
}
