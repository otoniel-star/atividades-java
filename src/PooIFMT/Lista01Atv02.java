package PooIFMT;

import java.util.Scanner;

/**
* 2. Crie um programa que solicite ao usuário um número inteiro  ok
 * e um intervalo (início e fim).ok
 *>>>>O programa deve gerar e exibir a tabuada completa
do número fornecido dentro do intervalo especificado, formatando a saída
de forma clara com operações de multiplicação.ok
* */


public class Lista01Atv02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o numero para a operação: ");
        int numeroOperacao = leitura.nextInt();

        System.out.println("digite por qual numero ele deve Começar: ");
        int intervaloInicio = leitura.nextInt();
        System.out.println("digite por qual numero ele deve Terminar: ");
        int intervaloFim = leitura.nextInt();
        System.out.printf("-------------------Tabuada do numero %d :---------------\n",numeroOperacao);
        for (int i = intervaloInicio; i <= intervaloFim; i++) {
            System.out.printf(" %d x %d = %d \n", numeroOperacao, i, numeroOperacao*i);
        }
    }
}
