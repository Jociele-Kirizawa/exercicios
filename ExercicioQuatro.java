package exercicio;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		//String [] lista = new String [5];
		int i;
		String[] lista = { "banana", "maça", "Abacaxi", "melão", "mamão" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual fruta você deseja?");
		String fruta = scan.nextLine();
		
		for (i = 0; i < lista.length; i++) {
			
			if (fruta.equals(lista[i]) ) {
				System.out.println("Ótima escolha, fruta na promoção!");
			}
			scan.close();
		}

	}

}
/*
 * Um supermercado anuncia diariamente uma lista com 5 frutas em promoção.
 * Escreva um programa que recebe o nome de uma fruta que você deseja comprar e
 * informa se a fruta pertence à lista de promoções. Exemplo: A lista de frutas
 * em promoção é: [banana, maçã, abacaxi, melão, mamão]. Qual fruta você deseja
 * comprar hoje? banana Ótima escolha! Essa fruta está em promoção hoje.
 */
