package exercicio;

import java.util.Scanner;
 class ExercicioOnze {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o enésimo termo da fibonacci");
		int n = scan.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int proximo;
			
		for (int i=3; i<=n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print( proximo + " ");
			
		}
		
	}
}


/*faça um programa que imprima a sequencia  a´t o enesimo numero.abstract
*/