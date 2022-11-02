package exercicio;

import java.util.Scanner;

public class ExercicioOito {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		boolean valido = true;
		
		if(nome.length()<= 3) {
			valido = false;
			System.out.println("O nome precisa de 3 caractere, digite novamente: ");
		}
		
		System.out.println("Digite sua idade ");
		int idade = scan.nextInt();
		if (idade >= 1 && idade<= 150) {
			valido = true;
			System.out.println("Idade adequada");		
			
		}
		System.out.println();
		
			
		}while();

}

}



/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd*/