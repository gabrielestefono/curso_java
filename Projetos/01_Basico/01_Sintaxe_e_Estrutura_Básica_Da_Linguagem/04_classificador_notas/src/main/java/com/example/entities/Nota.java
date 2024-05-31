package com.example.entities;

public class Nota {
	private final int notaInteger;

	private final String classificacao;

	public Nota(int notaInteger) {
		this.notaInteger = notaInteger;
		this.classificacao = Nota.verificarClassificacao(notaInteger);
	}

	private static String verificarClassificacao(int notaInteger){
		String nota;
		if(notaInteger > 90){
			nota = "A";
		}else if(notaInteger >= 80){
			nota = "B";
		}else if(notaInteger >= 70){
			nota = "C";
		}else if(notaInteger >= 60){
			nota = "D";
		}else{
			nota = "F";
		}
		return nota;
	}

	public int getNotaInteger() {
		return notaInteger;
	}

	public String getClassificacao() {
		return classificacao;
	}

	@Override
	public String toString() {
		return "Nota: " + this.classificacao;
	}
}
