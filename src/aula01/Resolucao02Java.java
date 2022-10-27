package aula01;

import java.util.Scanner;

public class Resolucao02Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextInt();

		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextInt();
		
		System.out.println("Digite a nota 4: ");
		nota4 = leia.nextInt();
		
		System.out.println("Média final: " + (nota1 + nota2 + nota3 + nota4)/4);
	}

}
