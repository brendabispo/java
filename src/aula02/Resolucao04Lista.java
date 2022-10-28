package aula02;

import java.util.Scanner;

public class Resolucao04Lista {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	    //ímpar exiba o número elevado ao quadrado.

		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("É um número par");
			System.out.println("A raiz quadrada de " + numero + " é ->" + Math.sqrt(numero));
		}else if(numero % 2 != 0) {
			System.out.println("É um número ímpar");
			System.out.println(numero + " elevado ao quadrado é -> " + Math.pow(numero, 2));
		
		}
	}

}
