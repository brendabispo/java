package aula02;

import java.util.Scanner;

public class Resolucao02Lista {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
			
		}else if(numero1 < numero3 && numero3 < numero2) {
			System.out.println("Números em ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
		
		}else if(numero2 < numero1 && numero1 < numero3) {
			System.out.println("Números em ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
		
		}else if(numero2 < numero3 && numero3 < numero1) {
			System.out.println("Números em ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
		
		}else if(numero3 < numero2 && numero2 < numero1) {
			System.out.println("Números em ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
		
		}else if(numero3 < numero1 && numero1 < numero2) {
			System.out.println("Números em ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
		
		}
	}

}
