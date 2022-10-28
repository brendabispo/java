package aula02;

import java.util.Scanner;

public class Resolucao03Lista {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra: 10-14 infantil; 15-17 juvenil; 18-25 adulto.

		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria: Adulto");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		}else if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria: Infantil");
		}
	}

}
