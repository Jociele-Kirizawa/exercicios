public class Vetor {
    public static void main(String[] args) {
        int i;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] c = new int  [10];

        for (i = 0; i < a.length; i++) {
           c[i] = b[i]*a[i];
        }
        for (i = 0; i< a.length; i++){
            System.out.println(c[i] + " ");
        }
    }}





/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a multiplicação dos
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i].*/