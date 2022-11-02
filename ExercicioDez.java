package exercicio;

import java.util.Scanner;

public class ExercicioDez {
	public static void main(String[] args) {
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO");
		int a = scan.nextInt();
		System.out.println("Digite outo numero");
		int b = scan.nextInt();
		
		for(int i = a; i <= b; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		System.out.println("   ");
		System.out.println("A soma dos numeros é: " + soma);
			
		
	scan.close();	
	}

}


/* Faça um programa que receba
 *  2 numeros e imprima o intervalo 
 * 
 * entre eles. Depois mostra a soma no final*/
