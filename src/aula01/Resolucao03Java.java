package aula01;

import java.util.Scanner;

public class Resolucao03Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextInt();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextInt();

		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextInt();
		
		System.out.println("Digite os descontos: ");
		descontos = leia.nextInt();
		
		System.out.println("Salário líquido: " + (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos));

	}

}
