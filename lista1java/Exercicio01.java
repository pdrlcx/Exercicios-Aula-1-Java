package br.com.generation.exercicios.lista1java;

import java.util.Scanner;

public class Exercicio01 {

	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int meses = 12, diasDoAno = 365, dia, anoDoNasc, idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite o dia do seu aniversário: ");
		dia = leia.nextInt();
		
		System.out.println("Digite o mês do seu aniversário: ");
		meses = leia.nextInt();
		
		System.out.println("Digite o ano do seu nascimento: ");
		anoDoNasc = leia.nextInt();
		
		
		System.out.println("Sua idade em dias é: " + idade * diasDoAno);
		
		leia.close();
	}

}


