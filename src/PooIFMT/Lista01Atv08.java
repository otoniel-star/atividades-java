package PooIFMT;

import java.util.Scanner;

/**
 * 8. Crie um programa que leia números inteiros positivos e calcule o fatorial ok
 * de cada um, exibindo o resultado. ok
 * O programa deve validar a entrada (rejeitar negativos e não-inteiros), ok
 * permitir múltiplos cálculos e exibir um histórico dos fatoriais calculados. ok
 **/

public class Lista01Atv08 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String saida;
        String historicoFatorial = ""; // String para ir guardando o texto do histórico

        do {
            System.out.println("digite um numero inteiro positivo para ver o fatorial:");
            int numeroOperacao = leitura.nextInt();

            if (numeroOperacao < 0) {
                System.out.println("numero invalido! digite apenas numeros positivos.");
            } else {
                long resultadoFatorial = 1; // Usando long pois o fatorial cresce muito rapido

                for (int i = 1; i <= numeroOperacao; i++) {
                    resultadoFatorial = resultadoFatorial * i;
                }

                System.out.printf("o fatorial de %d é %d \n", numeroOperacao, resultadoFatorial);

                // Adicionando o resultado atual no nosso texto de histórico
                historicoFatorial = historicoFatorial + "Fatorial de " + numeroOperacao + " = " + resultadoFatorial + "\n";
            }

            System.out.println("deseja sair do sistema S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

        System.out.println("\n--- Historico de Fatoriais Calculados ---");
        System.out.println(historicoFatorial);
    }
}