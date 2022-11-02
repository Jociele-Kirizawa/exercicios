package exercicio;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		
		boolean Invalido = false;
		
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Digite uma nota ");
			double nota = scan.nextDouble();
		
				if(nota>=1 && nota <=10) {
					Invalido = false;
					System.out.println(nota +" é vádida!");	
				
				}else {
					Invalido = true;
					System.out.println("Nota invalida, digite uma nota:");
			}
			 		
		} while( Invalido != false);
		scan.close();
		}
	}
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o 
usuário informe um valor válido*/
