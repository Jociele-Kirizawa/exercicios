package exercicio;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual temperatura você quer convertar para Fahrenheit?");
		int temperatura = scan.nextInt();
		double resultado =  (temperatura*1.8+32);
		System.out.println("A temperatura em Fahrenheit é: " + resultado);
		
		
		
	 scan.close();	
	}

}
/*Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
9/5) + 32 = 32 °F. Exemplo:
Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:
22
O equivalente a 22 C é 71,6 F*/