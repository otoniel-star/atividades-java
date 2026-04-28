package PooIFMT;

import java.util.Scanner;

/**
 * 4. Desenvolva um programa que solicite senhas do usuário ok
 * e verifique critérios como comprimento mínimo, ok
 * presença de maiúsculas, minúsculas, números e caracteres especiais. ok
 * Para cada senha testada, exiba um relatório detalhado dos critérios ok
 * atendidos e não atendidos, permitindo múltiplas tentativas. ok
 **/

public class Lista01atv4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String saida;
        do {
            System.out.println("digite a senha para analise: ");
            String senha = leitura.next();

            boolean temTamanho = false;
            boolean temMaiuscula = false;
            boolean temMinuscula = false;
            boolean temNumero = false;
            boolean temEspecial = false;

            // Verificando o tamanho
            if (senha.length() >= 8) {
                temTamanho = true;
            }

            // Analisando caractere por caractere da senha
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);

                if (c >= 'A' && c <= 'Z') {
                    temMaiuscula = true;
                } else if (c >= 'a' && c <= 'z') {
                    temMinuscula = true;
                } else if (c >= '0' && c <= '9') {
                    temNumero = true;
                } else {
                    temEspecial = true;
                }
            }

            System.out.println("\n------------------- Relatorio da Senha: -------------------");

            if (temTamanho) {
                System.out.println("Tamanho minimo (8 caracteres): Atendido");
            } else {
                System.out.println("Tamanho minimo (8 caracteres): Nao atendido");
            }

            if (temMaiuscula) {
                System.out.println("Presenca de Maiusculas: Atendido");
            } else {
                System.out.println("Presenca de Maiusculas: Nao atendido");
            }

            if (temMinuscula) {
                System.out.println("Presenca de Minusculas: Atendido");
            } else {
                System.out.println("Presenca de Minusculas: Nao atendido");
            }

            if (temNumero) {
                System.out.println("Presenca de Numeros: Atendido");
            } else {
                System.out.println("Presenca de Numeros: Nao atendido");
            }

            if (temEspecial) {
                System.out.println("Presenca de Caracteres Especiais: Atendido");
            } else {
                System.out.println("Presenca de Caracteres Especiais: Nao atendido");
            }

            if (temTamanho && temMaiuscula && temMinuscula && temNumero && temEspecial) {
                System.out.println("\nResultado final: SENHA FORTE! (Todos os criterios atendidos)");
            } else {
                System.out.println("\nResultado final: SENHA FRACA! (Criterios pendentes)");
            }

            System.out.println("\ndeseja sair do sistema S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

    }
}