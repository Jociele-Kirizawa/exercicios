import java.util.Scanner;

public class VetorNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] aluno = new String[10];
        double [] notas1 = new double[10];
        double[] notas2 = new double[10];
        double[] resultado = new double[10];

        for (int i = 0; i < aluno.length; i++){
            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();
            aluno[i] = nome;
            System.out.println("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();
            notas1[i] = nota1;
            System.out.println("Digite a segunda nota: ");
            double nota2 = scan.nextDouble();
            notas2[i] = nota2;
            scan.nextLine();
        }
        for (int i=0; i < aluno.length; i++){
            resultado[i]= (notas1[i]+notas2[i])/2;
            if (resultado[i] >= 7) {
                System.out.println(aluno[i] + " "  + resultado[i] + " Aprovado");
            } else {
                System.out.println(aluno[i] + " "+  resultado [i] + " Reprovado");
            }
        }

    }
}







/*Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado*/
