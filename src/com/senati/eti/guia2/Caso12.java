package com.senati.Iti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado::");
		String empleado = sc.nextLine();
		
		System.out.print("Nivel [1-4]:");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo:");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		float inc=0;
		float ns=0;
		float ns1=0;
		
		switch (nivel) {
		    case 1:
		    	incremento = 0.045f;
		    	inc=4.5f;
		    	ns= sueldo * 0.045f;
		    	ns1= sueldo + ns;
		    	break;
		    case 2:
		    	incremento = 0.06f;
		    	inc= 6.0f;
		    	ns= sueldo * 0.06f;
		    	ns1=sueldo + ns;
		    	break;
		    case 3:
		    	incremento = 0.085f;
		    	inc= 8.5f;
		    	ns=sueldo * 0.085f;
		    	ns1=sueldo + ns;
		    	break;
		    case 4:
		    	incremento = 0.011f;
		    	inc= 11.0f;
		    	ns=sueldo * 0.011f;
		    	ns1= sueldo + ns;
		    	break;
		    default:
		    	incremento = 0f;
		    	ns1=sueldo;
		    	
		}
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Empleado:  " + empleado);
		System.out.println("Nivel:  " + nivel);
		System.out.println("Sueldo:  " + sueldo);
		System.out.println("Incremento:  " + inc + "%");
		System.out.println("Nuevo Sueldo:  " + ns1);

	}

}
