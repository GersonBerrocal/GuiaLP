package com.senati.Iti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del empleado.........:");
		String nombre = sc.nextLine();
		
		System.out.print("Ingresar horas trabajadas............:");
		float horas_t = sc.nextFloat();
		
		System.out.print("Ingresar tarifa por hora............:");
		float tarifa_h = sc.nextFloat();
		
		System.out.print("Ingresar numero de minutos de tardanza............:");
		float minutos_t = sc.nextFloat();
		
		
		float importe = horas_t*tarifa_h;
		float bono =0 ;
		float descuento = 0;
		
		
		if (horas_t>60)  
			bono= importe * 0.13f;
		else
		    bono =importe * 0.04f;	
		
		if (minutos_t>15)
			descuento=importe*0.03f;
		
		float alcanzado = horas_t/70 * 100;
		
		System.out.println("\n---------R E S U L T A D O S-----------");
		System.out.println("\nEmpleado......................:" +nombre.toUpperCase());
		System.out.println("Horas trabajadas............:" +horas_t);
		System.out.println("Tarifa por hora.............:" +tarifa_h);
		System.out.println("Importe.....................:" +df.format(importe));	
		System.out.println("Bono........................:" +df.format(bono));
		System.out.println("Descuento...................:" +df.format(descuento));
		System.out.println("Meta alcanzada..............:" +df.format(alcanzado) +"%");

	}

}