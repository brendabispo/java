package aula04;

import java.util.Scanner;
import java.util.SortedMap;

import javax.print.attribute.standard.Media;

public class Resolucao01Vetor {
	
	//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
	//Todos os elementos dos índices ímpares do vetor 
	//Todos os elementos do vetor que são números pares
	//A Soma de todos os elementos do vetor
	//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

	
	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Integer[ ] vetor = new Integer[10];
		int soma = 0;
		float media = 0.0f;
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("\nDigite um número: "); 
			vetor[i] = leia.nextInt();
		}

		System.out.println("\nElementos nos indices ímpares: \n");
		
		for(int i = 1; i < vetor.length; i ++) {
			if(i % 2 == 1) 
				System.out.println("\n" + vetor[i]);
		}

		System.out.println("\nElementos pares: \n");
		
		for(int i = 0; i < vetor.length; i ++) {
			if(vetor[i] % 2 == 0) 
				System.out.println("\n" + vetor[i]);
		}

		System.out.println("\nSoma: \n");
		
		for(int i = 0; i < vetor.length; i ++) {
			soma += vetor[i];
		}
		System.out.println("\n" + soma);
		
		
		System.out.println("\nMédia: \n");
		
		for(int i = 0; i < vetor.length; i ++) {
			media = soma/vetor.length;
		}
		System.out.println("\n" + media);
		
		
	}

}
