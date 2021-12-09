package br.com.generation.exercicios.lista1java;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dia, mes, diasDoMes = 30, ano = 0, diasDoAno = 365;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite o dia do seu aniversário: ");
		dia = leia.nextInt();
		
		System.out.println("Digite o mês do seu aniversário: ");
		mes = leia.nextInt();
		
		System.out.println("Digite o ano do seu aniversário: ");
		ano = leia.nextInt();
		
		System.out.println("Sua idade é: " + idade + " anos");
		
		System.out.println("Sua idade em meses é: " + mes * diasDoMes);
		
		System.out.println("Sua idade em dias é: " + idade * diasDoAno);
		
		leia.close();

	}

}
