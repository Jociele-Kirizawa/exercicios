package exercicio;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		String[] lista  = new String[5];
		
		int i;
		for(i=0; i< lista.length; i++) {
			System.out.println("Qual Fruta Você Deseja Comprar?");
			String compras = scan.nextLine();
			lista[i] = compras;
			
		}
		for(i=0; i< lista.length; i++) {
			System.out.print(lista[i]);
			
		}
		
	scan.close();	
	}
}
/*Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
da entrada dos 5 itens, exiba a lista completa. Exemplo:
Insira a sua lista de compras:
banana
maçã
abacaxi
melão
mamão
As frutas no seu carrinho são:
banana, maçã, abacaxi, melão, mamão*/

