package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	private static int soma;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("digite o primeiro valor:");
		int a = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		int b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float  divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtracao);
		System.out.println("div " + divisao);
		System.out.println("mult " + multiplicacao);
	
		
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}

