package com.senati.eti.guia1;
import java.util.Scanner;
public class Caso5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1,num2;
		System.out.print("Ingrese primer número : ");
		num1=sc.nextFloat();
		System.out.print("Ingrese segundo número : ");
		num2=sc.nextFloat();
		sc.close();
		float promedio=(num1+num2)/2;
		float aumento_num1=(float)(0.2*num1)+num1;
		float restar_num2=num2- (float)(0.3*num2);
		
		System.out.println("---------");
		System.out.println("Resultado");
		System.out.println("---------");
		System.out.println("Resultado 1 : "+promedio);
		System.out.println("Resultado 2 : "+aumento_num1);
		System.out.println("Resultado 3 : "+restar_num2);
		
	}
}
