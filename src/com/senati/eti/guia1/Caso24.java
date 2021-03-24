package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1;
		float num2;
		float num3;
		System.out.print("Ingrese el primer monto : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese el segundo monto : ");
		num2=sc.nextFloat();
		System.out.print("Ingrese el tercer monto : ");
		num3=sc.nextFloat();
		
		//ejercicios
		float ej1=(float) (num1/5 + 0.2*num2);
		float ej2=(float)((0.6*num3+num3)/2);
		float suma_total=num1+num2+num3;
		float ej3=(float)(suma_total-suma_total*0.08);
		System.out.println();
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		System.out.println("La quinta parte del 1º monto más el 20% del 2º monto : "+ej1);
		System.out.println("La mitad del aumento en 60% del tercer monto : "+ej2);
		System.out.println("Disminuya en 8% la suma de los tres montos : "+ej3);
		
		
		
	}
}
