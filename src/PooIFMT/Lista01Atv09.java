package PooIFMT;

import java.util.Scanner;

/**
 * 9. Implemente um programa que simule um caixa de supermercado onde o ok
 * usuário insere produtos com seus preços e quantidades. ok
 * O programa deve calcular subtotais por produto, ok
 * aplicar descontos progressivos se o total ultrapassar valores específicos, ok
 * calcular impostos e exibir o recibo final com todos os detalhes. ok
 **/

public class Lista01Atv09 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String saida;
        do {
            String recibo = "";
            double valorTotalCompra = 0;
            String maisProdutos;

            System.out.println("\n------------------- CAIXA LIVRE -------------------");

            // Laço interno para ler vários produtos do mesmo cliente
            do {
                System.out.println("digite o nome do produto: ");
                String nomeProduto = leitura.next();

                System.out.println("digite a quantidade: ");
                int quantidade = leitura.nextInt();

                System.out.println("digite o preco unitario (R$): ");
                double precoUnitario = leitura.nextDouble();

                // Calculando o subtotal deste produto específico
                double subtotalProduto = quantidade * precoUnitario;
                valorTotalCompra = valorTotalCompra + subtotalProduto;

                // Adicionando a linha do produto no nosso recibo de texto
                recibo = recibo + String.format("%s -> %d x R$ %.2f = R$ %.2f \n", nomeProduto, quantidade, precoUnitario, subtotalProduto);

                System.out.println("passar mais produtos neste caixa? S/N?");
                maisProdutos = leitura.next();

            } while (maisProdutos.equalsIgnoreCase("S"));

            // --- Lógica de Descontos Progressivos ---
            double desconto = 0;
            if (valorTotalCompra > 500.0) {
                desconto = valorTotalCompra * 0.10; // 10% de desconto para compras acima de R$ 500
            } else if (valorTotalCompra > 200.0) {
                desconto = valorTotalCompra * 0.05; // 5% de desconto para compras acima de R$ 200
            }

            // --- Lógica de Impostos ---
            // Imposto fictício de 9% aplicado sobre o valor após o desconto
            double valorComDesconto = valorTotalCompra - desconto;
            double imposto = valorComDesconto * 0.09;

            // Total a ser pago pelo cliente
            double valorFinalAPagar = valorComDesconto + imposto;

            // --- Exibição do Recibo ---
            System.out.println("\n================= CUPOM FISCAL =================");
            System.out.print(recibo); // Imprime a lista de produtos acumulada
            System.out.println("------------------------------------------------");
            System.out.printf("Total Bruto:     R$ %.2f \n", valorTotalCompra);
            System.out.printf("Desconto:      - R$ %.2f \n", desconto);
            System.out.printf("Impostos (9%%): + R$ %.2f \n", imposto);
            System.out.println("------------------------------------------------");
            System.out.printf("TOTAL A PAGAR:   R$ %.2f \n", valorFinalAPagar);
            System.out.println("================================================");

            System.out.println("\ndeseja sair do sistema do caixa S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

    }
}