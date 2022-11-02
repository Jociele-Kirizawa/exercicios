package exercicio;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual tabuada você deseja? 1 a 10 ");
		int tabuada = scan.nextInt();
		int i;
		
		for(i=1; i <= 10; i++) {
			System.out.println(tabuada + "X "+ i + " = " + tabuada*i);
		}
		
		scan.close();
		
	}
}



/* Escreva um programa que informa a tabuada de multiplicação de um
número informado pelo usuário (entre 1-10). Exemplo:
Entre com um número de 1 a 10:
1
A tabuada de 1 é:
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3 */
