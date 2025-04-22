package ex002;

import java.util.Scanner;

public class TestaListaDupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaDuplamenteEncadeada L1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada L2 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada L3 = new ListaDuplamenteEncadeada();

        System.out.print("Quantos nomes deseja adicionar na L1? ");
        int n1 = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        for (int i = 0; i < n1; i++) {
            System.out.print("Digite o nome " + (i + 1) + " da L1: ");
            String nome = sc.nextLine();
            L1.inserirDireita(nome);
        }

        System.out.print("\nQuantos nomes deseja adicionar na L2? ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("Digite o nome " + (i + 1) + " da L2: ");
            String nome = sc.nextLine();
            L2.inserirDireita(nome);
        }

        // Encontrar nomes comuns entre as listas
        Nodo atual = L1.getPrimeiro();  // Método diretamente acessível
        while (atual != null) {
            String nome = atual.dado;
            if (L2.contem(nome) && !L3.contem(nome)) {
                L3.inserirDireita(nome);
            }
            atual = atual.proximo;
        }

        System.out.println("\nNomes em L1:");
        L1.listar();

        System.out.println("\nNomes em L2:");
        L2.listar();

        System.out.println("\nNomes comuns entre L1 e L2 (L3):");
        L3.listar();

        sc.close();
    }
}
