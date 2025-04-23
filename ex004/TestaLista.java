package ex004;

import java.util.Scanner;

public class TestaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Armazenando 15 números ímpares:");
        int count = 0;
        int numero = 1;

        while (count < 15) {
            if (numero % 2 != 0) {
                lista.inserirFim(numero);
                count++;
            }
            numero++;
        }

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Inserir no início");
            System.out.println("2. Inserir no fim");
            System.out.println("3. Remover do início");
            System.out.println("4. Remover do fim");
            System.out.println("5. Listar elementos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número ímpar para inserir no início: ");
                    int valorInicio = sc.nextInt();
                    if (valorInicio % 2 != 0) {
                        lista.inserirInicio(valorInicio);
                    } else {
                        System.out.println("Apenas números ímpares são permitidos.");
                    }
                    break;

                case 2:
                    System.out.print("Digite um número ímpar para inserir no fim: ");
                    int valorFim = sc.nextInt();
                    if (valorFim % 2 != 0) {
                        lista.inserirFim(valorFim);
                    } else {
                        System.out.println("Apenas números ímpares são permitidos.");
                    }
                    break;

                case 3:
                    lista.removerInicio();
                    break;

                case 4:
                    lista.removerFim();
                    break;

                case 5:
                    lista.listar();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
