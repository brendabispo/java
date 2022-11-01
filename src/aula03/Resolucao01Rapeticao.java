/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares.
 */


package aula03;

import java.util.Iterator;
import java.util.Scanner;

public class Resolucao01Rapeticao {
	
	private static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		int numero = 0, numPar = 0, numImpar = 0;

		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "º número: ");
			numero = Leia.nextInt();
			
			if (numero % 2 == 0) {
				numPar++;
				
			}else if (numero % 2 != 0) {
				numImpar++;
				
				}
			}
		
		
			System.out.println("\nTotal de números pares: " + numPar);
		
			System.out.println("\nTotal de números ímpares:" + numImpar);
			
		}
	}
		
		
			
			
		
		
