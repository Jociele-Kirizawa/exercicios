import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matrix3x3 = new int[3][3];
        int somaPares =0;
        int somaImpar=0;

        for (int i=0; i< matrix3x3.length;i++){
            for (int j=0; j<matrix3x3[i].length;j++){
                System.out.println("Digite um numero:");
                int numero = scan.nextInt();
                matrix3x3[i][j] = numero;
            }
        }
        for (int i = 0; i<matrix3x3.length; i++){
            for (int j =0; j< matrix3x3[i].length;j++){
                if (matrix3x3[i][j]%2==0){
                    somaPares+=1;
                }else{
                    somaImpar+=1;
                }
                System.out.print(matrix3x3[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Quantiade de pares " + somaPares);
        System.out.println("Quantidade de impares " + somaImpar);
    }
}
