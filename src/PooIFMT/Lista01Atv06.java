package PooIFMT;

import java.util.Scanner;

/**
 * 6. Implemente um programa que leia uma sequência de números inteiros ok
 * (quantidade definida pelo usuário) ok
 * e calcule a soma, a média, o maior valor, o menor valor ok
 * e quantos números são pares e quantos são ímpares, ok
 * exibindo um relatório completo ao final. ok
 **/

public class Lista01Atv06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int qtdNumeros = 0;
        int somaNumeros = 0;
        double mediaNumeros = 0;
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("digite a quantidade de numeros que serao lidos:");
        qtdNumeros = leitura.nextInt();

        // Inicializamos com o valor máximo e mínimo possíveis no Java para o if funcionar corretamente
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("digite o numero: ");
            int numeroAtual = leitura.nextInt();

            somaNumeros = somaNumeros + numeroAtual;

            // Verificando maior e menor
            if (numeroAtual > maiorValor) {
                maiorValor = numeroAtual;
            }
            if (numeroAtual < menorValor) {
                menorValor = numeroAtual;
            }

            // Verificando par ou impar
            if (numeroAtual % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        if (qtdNumeros > 0) {
            mediaNumeros = (double) somaNumeros / qtdNumeros;
        }

        System.out.printf("\n--- Relatorio Final ---\n");
        System.out.printf("Soma total: %d \n", somaNumeros);
        System.out.printf("Media: %.2f \n", mediaNumeros);
        System.out.printf("Maior valor: %d \n", maiorValor);
        System.out.printf("Menor valor: %d \n", menorValor);
        System.out.printf("Pares: %d \n", qtdPares);
        System.out.printf("Impares: %d \n", qtdImpares);
    }
}