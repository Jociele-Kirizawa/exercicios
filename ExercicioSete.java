package exercicio;

import java.util.Scanner;

public class ExercicioSete {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean iguais = true;
		do {
			System.out.println("Digite nome de usuário: ");
			String nome = scan.nextLine();
			System.out.println("Digite senha: ");
			String senha = scan.nextLine();
			

			if (senha.equalsIgnoreCase(nome)) {
				iguais = true;
				System.out.println("Senha não pode ser o nome, escolha outra.");
			} else {
				iguais = false;
				System.out.println("usuário e senha cadastrado com sucesso");
			}

		} while (iguais == true);
		scan.close();
	}

}

/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
 * pedir as informações.
 */