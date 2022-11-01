package aula03;

import java.util.Scanner;

public class Resolucao02Repeticao {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		
		int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, fullstack = 0, outros;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo = leia.nextInt();
				
				if(sexo < 1 || sexo > 3)
					System.out.println("Digite um número entre 1 e 3");
				
			}while(sexo < 1 || sexo > 3);
			
			do {
				System.out.println("Digite a sua categoria (1-Fron/2-Back/3-Mob/4-Full): ");
				categoria = leia.nextInt();
				
				if(categoria < 1 || categoria > 4)
					System.out.println("Digite um número entre 1 e 4");
				
			}while(categoria < 1 || categoria > 4);
			
			if (categoria == 2)
				backend++;

			if (categoria == 1 && sexo == 2)
				frontend++;

			if (categoria == 3 && idade > 40 && sexo == 1)
				mobile++;

			if (categoria == 4 && idade < 30 && sexo == 2)
				fullstack++;

			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			
		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores que 40 anos: " + mobile);
		System.out.println("\nTotal de mulheres desenvolvedoras Fullstack menores que 30 anos: " + fullstack);
	}

}