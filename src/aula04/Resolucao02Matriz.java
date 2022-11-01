package aula04;

import java.util.Scanner;

public class Resolucao02Matriz {
	
	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/**
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
			Todos os elementos da Diagonal Principal
			Todos os elementos da Diagonal Secundária
			A Soma de todos os elementos da Diagonal Principal
			A Soma de todos os elementos da Diagonal Secundária

		 */
		
		int diagonalP = 0, diagonalS = 0;
		
		int[][] matriz = new int[3][3]; 
		
		for (int i = 0; i < matriz.length; i++) {//interage com a linha
			for (int j = 0; j < matriz.length; j++) {//interage com a coluna
				System.out.println("\nDigite o numero da posição (" + i + "," + j + "): ");
				matriz[i][j] = leia.nextInt();
			}
			
		}
		
		System.out.println("\nNumeros da Diagonal Principal: \n");
		
		
		for (int i = 0; i < matriz.length; i ++){
			for (int j = 0; j < matriz.length; j ++){
				if(i == j)
					System.out.println("\n" + matriz[i][j]);
			}
		}
		
		System.out.println("\nNumeros da Diagonal Secundária: \n");
		
		for (int i = 0; i < matriz.length; i ++){
			for (int j = 0; j < matriz.length; j ++){
				if(i == j)
					System.out.println("\n" + matriz[i][3 - 1 - j]);
			}
		}
		
		System.out.println("\nSoma dos números da Diagonal Secundária: \n");
		
		for (int i = 0; i < matriz.length; i ++){
			for (int j = 0; j < matriz.length; j ++){
				if(i == j)
					diagonalP += matriz[i][j];
			}
		}
		System.out.println("\n" + diagonalP);
		
		System.out.println("\nSoma dos números da Diagonal Secundária: \n");
		
		for (int i = 0; i < matriz.length; i ++){
			for (int j = 0; j < matriz.length; j ++){
				if(i == j)
					diagonalS += matriz[i][3 - 1 - j];
			}
		}
		System.out.println("\n" + diagonalS);

	}

}
