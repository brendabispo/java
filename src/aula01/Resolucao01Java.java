package aula01;

import java.util.Scanner;

public class Resolucao01Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int salario, abono;
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextInt();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextInt();
		
		System.out.println("Novo salário: " + (salario +  abono));

	}

}
