package PooIFMT;

import java.util.Scanner;

/**
 * 10. Desenvolva um programa que leia dados de múltiplos alunos (nome, ok
 * matrícula e notas em várias disciplinas). ok
 * Para cada aluno, calcule a média geral, ok
 * identifique a disciplina com melhor e pior desempenho, e ao final ok
 * exiba um ranking dos alunos por desempenho geral com estatísticas ok
 * consolidadas da turma. ok
 **/

public class Lista01Atv10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String saida;

        // --- Variáveis de Estado da Turma ---
        int totalAlunos = 0;
        double somaMediaTurma = 0;

        // Inicializados com extremos para a lógica de maior/menor funcionar
        double maiorMediaTurma = -1;
        double menorMediaTurma = 101; // Assumindo notas até 100

        String nomeMelhorAluno = "";
        String nomePiorAluno = "";
        String relatorioTurma = ""; // Vai guardar o histórico de todos os alunos

        System.out.println("================= SISTEMA ESCOLAR =================");

        do {
            System.out.println("\n------------------- Cadastro de Aluno -------------------");
            System.out.println("digite o nome do aluno: ");
            String nomeAluno = leitura.next();

            System.out.println("digite a matricula do aluno: ");
            String matricula = leitura.next();

            System.out.println("quantas disciplinas o aluno cursou? ");
            int qtdDisciplinas = leitura.nextInt();

            // --- Variáveis de Estado do Aluno ---
            double somaNotasAluno = 0;
            double maiorNotaAluno = -1;
            double menorNotaAluno = 101;
            String melhorDisciplina = "";
            String piorDisciplina = "";

            // Laço para ler as notas de cada disciplina do aluno atual
            for (int i = 1; i <= qtdDisciplinas; i++) {
                System.out.println("digite o nome da disciplina " + i + ": ");
                String disciplina = leitura.next();

                System.out.println("digite a nota em " + disciplina + ": ");
                double nota = leitura.nextDouble();

                somaNotasAluno = somaNotasAluno + nota;

                // Verificando melhor e pior disciplina do aluno
                if (nota > maiorNotaAluno) {
                    maiorNotaAluno = nota;
                    melhorDisciplina = disciplina;
                }
                if (nota < menorNotaAluno) {
                    menorNotaAluno = nota;
                    piorDisciplina = disciplina;
                }
            }

            // Calculando a média do aluno
            double mediaAluno = 0;
            if (qtdDisciplinas > 0) {
                mediaAluno = somaNotasAluno / qtdDisciplinas;
            }

            // Exibindo resumo individual na tela
            System.out.printf("\n--- Resumo Individual: %s ---\n", nomeAluno);
            System.out.printf("Media Geral: %.2f \n", mediaAluno);
            System.out.println("Melhor Desempenho: " + melhorDisciplina + " (Nota: " + maiorNotaAluno + ")");
            System.out.println("Pior Desempenho: " + piorDisciplina + " (Nota: " + menorNotaAluno + ")");

            // --- Atualizando as Estatísticas da Turma ---
            totalAlunos++;
            somaMediaTurma = somaMediaTurma + mediaAluno;

            // Verificando se é o melhor ou pior aluno da turma
            if (mediaAluno > maiorMediaTurma) {
                maiorMediaTurma = mediaAluno;
                nomeMelhorAluno = nomeAluno;
            }
            if (mediaAluno < menorMediaTurma) {
                menorMediaTurma = mediaAluno;
                nomePiorAluno = nomeAluno;
            }

            // Adicionando o aluno no relatório final
            relatorioTurma = relatorioTurma + String.format("Aluno: %s | Matricula: %s | Media: %.2f \n", nomeAluno, matricula, mediaAluno);

            System.out.println("\ndeseja sair do sistema S/N?");
            saida = leitura.next();

        } while (saida.equalsIgnoreCase("N"));

        // --- Exibição do Ranking e Estatísticas Consolidadas ---
        double mediaGeralTurma = 0;
        if (totalAlunos > 0) {
            mediaGeralTurma = somaMediaTurma / totalAlunos;
        }

        System.out.println("\n================= ESTATISTICAS CONSOLIDADAS =================");
        System.out.println("------------------- Lista da Turma -------------------");
        System.out.print(relatorioTurma);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total de Alunos Analisados: %d \n", totalAlunos);
        System.out.printf("Media Geral da Turma: %.2f \n", mediaGeralTurma);
        System.out.println("------------------- Ranking de Destaques -------------------");
        System.out.printf("Melhor Aluno da Turma: %s (Media: %.2f) \n", nomeMelhorAluno, maiorMediaTurma);
        System.out.printf("Aluno com Menor Rendimento: %s (Media: %.2f) \n", nomePiorAluno, menorMediaTurma);
        System.out.println("=============================================================");
    }
}