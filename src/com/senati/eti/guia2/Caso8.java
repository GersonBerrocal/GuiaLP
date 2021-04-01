package com.senati.Iti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la nota.............:");
		float nota = sc.nextFloat();
		
		
		String resultado="";
		
		if (0 <= nota && nota<=7)
		  resultado = ("Sin palabras");	
		
		else if (8 <= nota && nota<=10)
		 resultado = ("Malo");	
		
		else if (11 <= nota && nota<=14)
	     resultado = ("Regular");
		
		else if (15 <= nota && nota<=17)
		 resultado = ("Notable");
		
		else if (18 <= nota && nota<=20)
		 resultado = ("Excelente");	
		
		else
		 resultado ="Solo ingresar numeros del 0 al 20 ";
		
		System.out.println("Estado obtenido.......: "+resultado);
		

	}

}