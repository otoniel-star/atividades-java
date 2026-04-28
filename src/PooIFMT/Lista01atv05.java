package PooIFMT;

import java.util.Scanner;

/**
 * 5. Crie um programa que receba um capital inicial, uma taxa de juros mensal ok
 * e um período em meses. ok
 * O programa deve calcular e exibir mês a mês o saldo ok
 * da aplicação, mostrando o crescimento do investimento com juros ok
 * compostos e o total de juros ganhos. ok
 **/

public class Lista01atv05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String saida;
        do {
            System.out.println("digite o capital inicial (R$): ");
            double capitalInicial = leitura.nextDouble();

            System.out.println("digite a taxa de juros mensal (ex: 1,5 para 1.5%): ");
            double taxaJurosMensal = leitura.nextDouble();

            System.out.println("digite o periodo em meses: ");
            int periodoMeses = leitura.nextInt();

            double saldoAtual = capitalInicial;
            double totalJuros = 0;

            System.out.println("\n------------------- Evolucao do Investimento -------------------");

            for (int i = 1; i <= periodoMeses; i++) {
                // Calculando o rendimento do mês dividindo a taxa por 100
                double rendimentoMes = saldoAtual * (taxaJurosMensal / 100.0);

                // Acumulando os valores
                saldoAtual = saldoAtual + rendimentoMes;
                totalJuros = totalJuros + rendimentoMes;

                System.out.printf("Mes %d: Saldo R$ %.2f (+ R$ %.2f de juros) \n", i, saldoAtual, rendimentoMes);
            }

            System.out.println("\n------------------- Resumo Final -------------------");
            System.out.printf("Total de Juros Ganhos: R$ %.2f \n", totalJuros);
            System.out.printf("Montante Final: R$ %.2f \n", saldoAtual);

            System.out.println("\ndeseja sair do sistema S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

    }
}