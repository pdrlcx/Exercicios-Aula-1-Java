package br.com.generation.exercicios.lista1java;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dia, mes, diasDoMes = 30, ano = 0, diasDoAno = 365;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite o dia do seu anivers�rio: ");
		dia = leia.nextInt();
		
		System.out.println("Digite o m�s do seu anivers�rio: ");
		mes = leia.nextInt();
		
		System.out.println("Digite o ano do seu anivers�rio: ");
		ano = leia.nextInt();
		
		System.out.println("Sua idade �: " + idade + " anos");
		
		System.out.println("Sua idade em meses �: " + mes * diasDoMes);
		
		System.out.println("Sua idade em dias �: " + idade * diasDoAno);
		
		leia.close();

	}

}
