import java.util.Random;

public class Matriz4x4 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int coluna = 0;
        int linha = 0;

        int [][]matriz4x4 = new int[4][4];
        Random numerosAleatorios = new Random();

        for ( int i = 0; i < matriz4x4.length; i++){
            for (int j =0; j < matriz4x4[i].length; j++){
                matriz4x4[i][j] = numerosAleatorios.nextInt(100);
            }
        }
        for (int i =0; i < matriz4x4.length; i ++){
            for (int j=0; j< matriz4x4[i].length; j++){
                if (matriz4x4[i][j]> maior){
                    maior=matriz4x4[i][j];
                    linha=i;
                    coluna=j;
                }
            }
        }
        for (int i = 0; i < matriz4x4.length; i++){
            for (int j = 0; j < matriz4x4[i].length; j ++){
                System.out.print(matriz4x4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior Valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println( "coluna = " + coluna);
    }
}
/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
        9. Após isso determine o maior número da matriz e a sua posição
        (linha, coluna*/