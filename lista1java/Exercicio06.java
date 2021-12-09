package br.com.generation.exercicios.lista1java;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);

        double  x1 ,x2, y1, y2;
        double d;
        double p1 ,p2 ;

        System.out.println("Digite o valor de X no primeiro ponto: ");
        x1 = leia.nextDouble();

        System.out.println("Digite o valor de Y no primeito ponto: ");
        y1 = leia.nextDouble();

        System.out.println("Digite o valor de X no segundo ponto: ");
        x2 = leia.nextDouble();

        System.out.println("Digite o valor de Y no segundo ponto: ");
        y2 = leia.nextDouble();

        p1 = Math.pow((x2 - x1),2);
        p2 = Math.pow((y2 - y1),2);

        d = Math.sqrt(p1 + p2);

        System.out.println("A distancia entre os dois pontos é: " + d);


        leia.close();


	}

}
