package PooIFMT;

import java.util.Scanner;

/**
 * 3. Implemente um programa que leia um valor em reais e converta para ok
 * dólar, euro e libra esterlina usando taxas de câmbio pré-definidas. ok
 * O programa deve permitir múltiplas conversões consecutivas, armazenando e ok
 * exibindo um resumo de todas as conversões realizadas ao final. ok
 **/

public class Lista01atv03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String saida;
        String historicoConversoes = ""; // Guardando o histórico em uma String vazia

        // Taxas de câmbio pré-definidas
        double taxaDolar = 5.05;
        double taxaEuro = 5.45;
        double taxaLibra = 6.30;

        do {
            double valorReais = 0;
            double valorDolar = 0;
            double valorEuro = 0;
            double valorLibra = 0;

            // lendo o valor em reais
            System.out.println("digite o valor em reais para conversao: ");
            valorReais = leitura.nextDouble();

            // calculando as conversoes
            valorDolar = valorReais / taxaDolar;
            valorEuro = valorReais / taxaEuro;
            valorLibra = valorReais / taxaLibra;

            System.out.printf("\n R$ %.2f equivalem a: USD %.2f (Dolares), EUR %.2f (Euros) e GBP %.2f (Libras) \n\n", valorReais, valorDolar, valorEuro, valorLibra);

            // acumulando o texto no histórico
            historicoConversoes = historicoConversoes + String.format("Valor R$ %.2f -> Dolar: %.2f | Euro: %.2f | Libra: %.2f \n", valorReais, valorDolar, valorEuro, valorLibra);

            System.out.println("deseja sair do sistema S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

        System.out.println("\n------------------- Resumo de Conversoes: -------------------");
        System.out.println(historicoConversoes);

    }
}