package com.senati.eti.guia1;
import java.text.DecimalFormat;
public class Caso7 {
	public static void main(String[] args) {
		float res =(float) ((float)(17*2+Math.pow(3,2)-6)/5-(float)2*(4.7-1.2*2));
		//float res=(float) (17*2+Math.pow(3, 2));
		DecimalFormat formateador=new DecimalFormat("#.##");
		System.out.println("---------");
		System.out.println("Resultado");
		System.out.println("---------");
		System.out.println("Respuesta : "+formateador.format(res));
		
		
	}
}
