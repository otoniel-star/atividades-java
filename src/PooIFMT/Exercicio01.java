package PooIFMT;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int qtdHomens = 0, qtdMulheres = 0;
        int idadeTotal = 0;

        double maiorSalarioMulher = 0, menorSalarioHomen = Double.MAX_VALUE;

        String homemMenorSalario = " ", mulherMaiorsalario = " ";

        for (int i = 0; i < 5; i++) {
            System.out.println("\n -- Cadastro da pessoa " + (i + 1) + "--");
            System.out.println("Digite o nome: ");
            String nome = leitura.next();

            System.out.println("digite sexo H para home e M para mulher:" );
            String sexo = leitura.next();

            System.out.println("digite Idade: ");
            int idade = leitura.nextInt();

            System.out.println("Digite salario: ");
            double salario = leitura.nextInt();

            idadeTotal += idade;

            if (sexo.equalsIgnoreCase("m")){
                qtdMulheres++;
                if (salario > maiorSalarioMulher){
                    maiorSalarioMulher = salario;
                    mulherMaiorsalario = nome;
                }
            } else if (sexo.equalsIgnoreCase("h")) {
             qtdHomens++;
                 if (salario < menorSalarioHomen){
                     homemMenorSalario = nome;
                     menorSalarioHomen = salario;
                 }
            }

        }


        System.out.println("homem com menor salario: " + homemMenorSalario + " com o salario de R$ " + menorSalarioHomen);
        System.out.println("mulher com maior salario: " + mulherMaiorsalario + " com salario de R$ " + maiorSalarioMulher);
        System.out.println("Quantidade de homens é " +qtdHomens+" e quantidade de mulheres é "+ qtdMulheres );
        System.out.println("media de idades é " + idadeTotal/5);
    }
}
