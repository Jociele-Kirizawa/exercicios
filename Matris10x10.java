import java.util.Random;

public class Matris10x10 {
    public static void main(String[] args) {
        int[][] matriz10x10 = new int[10][10];
        Random numerosAleatórios = new Random();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int maior2 = Integer.MIN_VALUE;
        int menor2 = Integer.MAX_VALUE;


        for (int i = 0; i < matriz10x10.length; i++) {
            for (int j = 0; j < matriz10x10[i].length; j++) {
                matriz10x10[i][j] = numerosAleatórios.nextInt(100);
            }
        }
        for (int i = 0; i < matriz10x10.length; i++) {
           if (matriz10x10[4][i]>maior){
               maior=matriz10x10[4][i];
           }
           if (matriz10x10[4][i]<menor){
               menor=matriz10x10[4][i];
           }
           if (matriz10x10[i][6]>maior2){
               maior2=matriz10x10[i][6];
           }
           if (matriz10x10[i][6]<menor2){
               menor2=matriz10x10[i][6];
           }
        }

                for (int i = 0; i < matriz10x10.length; i++) {
                    for (int j = 0; j < matriz10x10[i].length; j++) {
                        System.out.print(matriz10x10[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Maior valor na linha 5 " + maior);
                System.out.println("Menor valor na linha 5 " + menor);
                System.out.println("Maior valor coluna 7 " + maior2);
                System.out.println("Menor valor coluna 7 " + menor2);

        }
    }
  /* Gere e imprima uma matriz M 10x10 com valores aleatórios entre
        0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
        qual é o maior e o menor valor da coluna 7*/