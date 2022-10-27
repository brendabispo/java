package aula01;

import java.util.Scanner;

public class Resolucao04Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3, numero4;
		
		System.out.println("Digite o número 1: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o número 2: ");
		numero2 = leia.nextInt();

		System.out.println("Digite o número 3: ");
		numero3 = leia.nextInt();
		
		System.out.println("Digite o número 4: ");
		numero4 = leia.nextInt();
		
		System.out.println("Diferença: " + ((numero1 * numero2) - (numero3 * numero4)));

	}

}
