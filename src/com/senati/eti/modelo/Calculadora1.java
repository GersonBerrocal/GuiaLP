package com.senati.eti.modelo;

public class Calculadora1 {
	float numero1;
	float numero2;
	
	public float getNumero1() {
		return this.numero1;
	}
	public float getNumero2() {
		return this.numero2;
	}
	public void setNumero1(float num) {
		this.numero1=num;
	}
	public void setNumero2(float num) {
		this.numero2=num;
	}
	public Calculadora1() {
		
	}
	public Calculadora1(float num1,float num2) {
		this.numero1=num1;
		this.numero2=num2;
	}
	
	public float Sumar() {
		return this.numero1+this.numero2;
	}
	public float Restar() {
		return this.numero1-this.numero2;
	}
	public float Producto() {
		return this.numero1*this.numero2;
	}
	public float Dividir() {
		float r=0;
		if(this.numero2!=0) {
			r= this.numero1/this.numero2;
		}
		return r;
	}
	public float RestEntero() {
		float r=0;
		if(this.numero2!=0) {
			r= this.numero1%this.numero2;
		}
		return r;
	}
	public float Mayor() {
		if(this.numero1>this.numero2)
			return this.numero1;
		else
			return this.numero2;
	}
	public float Menor() {
		if(this.numero1<this.numero2)
			return this.numero1;
		else
			return this.numero2;
	}
}
