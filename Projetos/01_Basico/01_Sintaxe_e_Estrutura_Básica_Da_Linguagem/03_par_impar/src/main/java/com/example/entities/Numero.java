package com.example.entities;

public class Numero {
	private final int numeroInteiro;

	private final boolean isItEven;

	private final boolean isItOdd;

	public Numero(int numero) {
		numeroInteiro = numero;
		this.isItEven = numero % 2 == 0;
		this.isItOdd = numero % 2 == 1;
	}

	public int getNumero() {
		return numeroInteiro;
	}

	public boolean isItEven() {
		return isItEven;
	}

	public boolean isItOdd() {
		return isItOdd;
	}

	@Override
	public String toString() {
		if(this.isItEven){
			return "Este número é par!";
		}
		return "Este número é ímpar!";
	}
}
