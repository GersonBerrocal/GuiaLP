package com.senati.Iti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese primer numero......: ");
		float n1 =sc.nextFloat();
		
		System.out.print("Ingrese segundo numero.....: ");
		float n2 =sc.nextFloat();
		
		System.out.print("Ingrese Operacion [1-6] :...........: ");
		int op = sc.nextInt();
		
		String operacion = "";
		String resultado = "";
		
		switch (op) {
		   case 1 :
		      operacion = "Suma";
		      resultado="La suma es....... :"+(n1 + n2);
		      break;
		      
		   case 2 :
			  operacion = "Resta";
			  resultado ="La resta es..... :"+(n1-n2);
			  break;
		   case 3 :
			   operacion = "Producto";
			   resultado="El producto es....:"+(n1*n2);
			   break;
		   case 4 :
			   operacion = "Division";
			   if (n2==0)
				   resultado="No es posible dividir entre cero";
			   else
				   resultado="La divicion es......"+ df.format(n1/n2);
			   break;
		   case 5 :
			   operacion = "Resto";
			   if (n2==0)
				   resultado="No es posible hallar el resto entero";
			   else
				   resultado="El resto entero es........:"+ df.format(n1%n2);
			  break;
		   case 6 :
			   operacion ="Promedio";
			   resultado = "El promedio es..........:"+((n1+n2)/2);
			   break;
			   
		   default:
		       operacion = "Incorrecta ,solo elija una operacion del 1-6";
			   
		
		}
        System.out.println("\n----------------Resultado--------------");
        System.out.println("Numero 1......................: "+n1);
        System.out.println("Numero 2......................: "+n2);
		System.out.println("La operacion elegida es.......: "+operacion);
		System.out.println("" + resultado);
	}

}