import java.util.Scanner;

public class VetorSoma {
    public static void main(String[] args) {

        int soma = 0;
        int quantidade=0;
        int somaTotal=0;
        int numero=0;

        Scanner scan = new Scanner(System.in);
        int [] inteiros = new int[10];

        for (int i = 0; i < inteiros.length; i ++) {
            System.out.println("Digite um numero inteiro: ");
             numero = scan.nextInt();
            inteiros[i] = numero;
            System.out.println(inteiros[i]);
        }

        for (int i = 0; i < inteiros.length; i ++){
            if (inteiros[i] < 15){
                soma += inteiros[i];
            }else{
                System.out.println("Não se aplica. não tem numeros menores que 15");
            }
            if (inteiros[i]==15){
                quantidade ++;
            }
            somaTotal += inteiros[i];

        }
        System.out.println("A qtdade de numeros iguais a 15 é: " + quantidade);
        System.out.println("A soma dos numeros menosres que 15 é: " + soma);
        System.out.println(" a soma total é: " + somaTotal);
    }
}









/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15*/