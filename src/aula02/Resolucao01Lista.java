package aula02;

import java.util.Scanner;

public class Resolucao01Lista {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3){
        System.out.print("O maior número é: "+ numero1);
       
		}else if (numero2 > numero3 && numero2 > numero1){
        System.out.print("O maior número é: "+ numero2);
        
		}else if (numero3 > numero1 && numero3 > numero2){
         System.out.print("O maior número é: "+numero3);
       
		}
       
		}
	}


