package ex003;

import java.util.Scanner;

public class TestaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Cadastro de 5 alunos:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nome do aluno " + i + ": ");
            String nome = sc.nextLine();
            System.out.print("Idade do aluno " + i + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpar buffer
            lista.inserirFim(new Aluno(nome, idade));
        }

        System.out.println("\nCadastro do aluno para o início da lista:");
        System.out.print("Nome: ");
        String nomeInicio = sc.nextLine();
        System.out.print("Idade: ");
        int idadeInicio = sc.nextInt();
        sc.nextLine();
        lista.inserirInicio(new Aluno(nomeInicio, idadeInicio));

        System.out.println("\nCadastro do aluno para o final da lista:");
        System.out.print("Nome: ");
        String nomeFim = sc.nextLine();
        System.out.print("Idade: ");
        int idadeFim = sc.nextInt();
        lista.inserirFim(new Aluno(nomeFim, idadeFim));

        System.out.println("\nLista final com 7 alunos:");
        lista.listar();

        sc.close();
    }
}
