package ex004;

public class ListaDuplamenteEncadeada {
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho;

    public void inserirInicio(int valor) {
        Nodo novo = new Nodo(valor);
        if (primeiro == null) {
            primeiro = ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        tamanho++;
    }

    public void inserirFim(int valor) {
        Nodo novo = new Nodo(valor);
        if (ultimo == null) {
            primeiro = ultimo = novo;
        } else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }
        tamanho++;
    }

    public void removerInicio() {
        if (primeiro == null) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.println("Removido do início: " + primeiro.valor);
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
        }
        tamanho--;
    }

    public void removerFim() {
        if (ultimo == null) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.println("Removido do fim: " + ultimo.valor);
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        tamanho--;
    }

    public void listar() {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("Elementos da lista:");
        Nodo atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public int getTamanho() {
        return tamanho;
    }
}
