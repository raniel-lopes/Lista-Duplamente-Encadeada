package ex001;

import java.util.Scanner;

public class TestaListaDuplamenteEncadeada {
	public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Scanner sc = new Scanner(System.in);
        int opcao, valor;

        do {
            System.out.println("==== MENU DA LISTA DUPLAMENTE ENCADEADA ====");
            System.out.println("1 - Inserir à esquerda");
            System.out.println("2 - Inserir à direita");
            System.out.println("3 - Remover da esquerda");
            System.out.println("4 - Remover da direita");
            System.out.println("5 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor para inserir à esquerda: ");
                    valor = sc.nextInt();
                    lista.inserirEsquerda(valor);
                    break;

                case 2:
                    System.out.print("Digite um valor para inserir à direita: ");
                    valor = sc.nextInt();
                    lista.inserirDireita(valor);
                    break;

                case 3:
                    valor = lista.removerListaEsquerda();
                    if (valor == 0) {
                        System.out.println("Lista vazia. Nada a remover.");
                    } else {
                        System.out.println("Removido da esquerda: " + valor);
                    }
                    break;

                case 4:
                    valor = lista.removerListaDireita();
                    if (valor == 0) {
                        System.out.println("Lista vazia. Nada a remover.");
                    } else {
                        System.out.println("Removido da direita: " + valor);
                    }
                    break;

                case 5:
                    lista.listarListaImprimir();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }
}
