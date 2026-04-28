package PooIFMT;

import java.util.Scanner;

/**
 * 7. Desenvolva um programa que solicite um número inteiro e um padrão ok
 * (crescente ou decrescente). ok
 * O programa deve gerar e exibir uma pirâmide numérica onde cada linha ok
 * contém números sequenciais, com altura definida pelo número fornecido. ok
 **/

public class Lista01Atv07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite a altura da piramide:");
        int altura = leitura.nextInt();

        System.out.println("digite o padrao (C para crescente ou D para decrescente):");
        String padrao = leitura.next();

        System.out.println("\n--- Piramide ---");

        if (padrao.equalsIgnoreCase("C")) {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(); // Pula para a próxima linha da pirâmide
            }
        } else if (padrao.equalsIgnoreCase("D")) {
            for (int i = altura; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Padrao invalido digitado!");
        }
    }
}