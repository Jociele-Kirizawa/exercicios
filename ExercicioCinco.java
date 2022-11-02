package exercicio;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		int i,j;
		int desconto =0;
		i=0;
		Scanner scan = new Scanner(System.in);		
		String[] lista  = new String[5];
		String [] listaFrutas = {"banana", "maça", "abacaxi", "melão", "mamâo"};
		String[] frutasIguais = new String[i];
		
		for(i=0; i< lista.length; i++) {
			System.out.println("Qual Fruta Você Deseja Comprar?");
			String compras = scan.nextLine();
			lista[i] = compras;
				for(j=0; j < listaFrutas.length; j++) {
					if(listaFrutas[j].equals(lista[i])) {
						desconto = desconto + 5; 
				}}}
		for(j=0; j < listaFrutas.length; j++) {
			if(listaFrutas[j].equals(lista[i])) {
				System.out.println();; 
				}}		
		 
		System.out.print(desconto);
		
	scan.close();	
	}

}


/*Altere o programa anterior para, ao invés de receber apenas o nome de uma fruta para compra,
receber uma lista de frutas. Compare a lista de compras com a lista da promoção e calcule o
desconto cumulativo de 5% para cada fruta correspondente. Ao final, informe qual será o
desconto total (por exemplo, 3 itens correspondentes, resulta num desconto de 15%). Exemplo:
A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
Qual a sua lista de compras para hoje?
mamão
uva
abacate
melancia
Você tem direito a um desconto de 5%. O mamão está em promoção!*/
