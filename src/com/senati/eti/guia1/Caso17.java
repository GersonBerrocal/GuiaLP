package com.senati.eti.guia1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		int aprobados=0,retirados=0,desaprobados=0;
		
		System.out.print("Número de aprobados : ");
		aprobados=sc.nextInt();
		System.out.print("Número de desaprobados : ");
		desaprobados=sc.nextInt();
		System.out.print("Número de retirados : ");
		retirados=sc.nextInt();
		sc.close();
		float total=aprobados+retirados+desaprobados;
		System.out.println("---------");
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("Aprobados    : "+df.format(aprobados*100/total)+"%");
		System.out.println("Desaprobados : "+df.format(desaprobados*100/total)+"%");
		System.out.println("Retirados    : "+df.format(retirados*100/total)+"%");
	}
}
