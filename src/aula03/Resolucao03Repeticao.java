package aula03;

import java.util.Scanner;
public class Resolucao03Repeticao {
    
	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
        
        int cont = 0, num;
        
        do{
            System.out.println("Digite um número inteiro: ");
            num = leia.nextInt(); // usuario digita um número
            
            if(num == 0){ // se o número digitado for MAIOR que zero, executa a conta
            break;
            }
			
        } while(num > 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente // soma o valor digitado AGORA com o digitado ANTES3
        if (num > 0) {
			
		}
        
        System.out.println("A soma é: " + numero); // soma
        
	}
	}


