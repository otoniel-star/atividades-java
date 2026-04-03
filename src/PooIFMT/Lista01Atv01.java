package PooIFMT;

import java.util.Scanner;

/**
 01-Desenvolva um programa que leia o nome de um aluno,ok
 a quantidade de notas que ele possui,ok
 e então solicite cada nota com seu respectivo peso.ok
 O programa deve calcular e exibir a média ponderada final, ok
 repetindo o processo para múltiplos alunos até que o usuário escolha sair
 **/



public class Lista01Atv01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);



        String saida ;
        do{
            String nomeAluno;
            int qtdNotas = 0;
            double notasAluno = 0;
            int pesoNota = 0;
            double somaNotas = 0;
            double somaPesoNota = 0;
            double mediaPonderada = 0;


            //lendo nome do aluno
            System.out.println("digite nome do aluno");
            nomeAluno = leitura.next();

            //lendo quantidade de notas do aluno
            System.out.println("Digite quantidade de notas do aluno");
            qtdNotas = leitura.nextInt();

            int i =0;
            while (i < qtdNotas){
                //leitura de notas e peso
                System.out.println("digite nota: ");
                notasAluno = leitura.nextDouble();

                System.out.println("digite peso dessa nota: ");
                pesoNota = leitura.nextInt();

                somaNotas = somaNotas + (notasAluno * pesoNota);
                somaPesoNota = somaPesoNota + pesoNota;

                mediaPonderada = (somaNotas / somaPesoNota);
                i++;
            }
            System.out.printf("\n o aluno %s tem %d de notas, a soma de notas dele é %.2f e a media ponderada é %.2f \n",nomeAluno, qtdNotas, somaNotas, mediaPonderada);

            System.out.println("deseja sair do sistema S/N?");
            saida = leitura.next();

        }while (saida.equalsIgnoreCase("N"));







    }
}
