package com.senati.eti.guia2;
import java.util.Scanner;

public class Caso14 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		
		
		
		String alumno,carrera,turno;
		System.out.print("Alumno : ");
		alumno=sc.nextLine();
		System.out.print("Carrera [DS,RC,DG]: ");
		carrera=sc.next();
		System.out.print("Turno [M,T,N]: ");
		turno=sc.next();
		
		sc.close();
		
		float monto=0;
		float descuento=0;
		switch (carrera){
			case "DS":
				carrera="Desarrollo de software";
				monto=1500;
				break;
			case "RC":
				carrera="Redes y conectividad";
				monto=1400;
				break;
			case "DG":
				carrera="Diseño grafico";
				monto=1300;
				break;
			default:
				carrera="---";
				break;
		}
		switch (turno) {
			case "M":
				turno="Mañana";
				descuento=(float)(monto*0.1);
				break;
			case "T":
				turno="Tarde";
				descuento=(float)(monto*0.2);
				break;
			case "N":
				turno="Noche";
				descuento=(float)(monto*0.15);
				break;
		}
		
		float total= monto-descuento;
		float total_dolar=(float)(total*3.33);
		
		System.out.println();
		System.out.println("=============");
		System.out.println("RESULTADOS");
		System.out.println("=============");
		System.out.println("Alumno       : "+alumno);
		System.out.println("Carrera      : "+carrera);
		System.out.println("Monto        : "+monto);
		System.out.println("Descuento    : "+descuento);
		System.out.println("Total(Soles) : "+total);
		System.out.println("Total(Dolar) : "+total_dolar);
	}
	
}
