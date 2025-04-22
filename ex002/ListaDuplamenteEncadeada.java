package ex002;

public class ListaDuplamenteEncadeada {
    private Nodo primeiro = null;
    private Nodo ultimo = null;
    private int tamanho = 0;  // O campo tamanho já está aqui.

    // Inserir na esquerda
    public void inserirEsquerda(String valor) {
        Nodo novo = new Nodo(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        tamanho++;  // Atualiza o tamanho
    }

    // Inserir na direita
    public void inserirDireita(String valor) {
        Nodo novo = new Nodo(valor);
        if (ultimo == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }
        tamanho++;  // Atualiza o tamanho
    }

    // Remover da esquerda
    public String removerEsquerda() {
        if (primeiro == null) return null;
        String valor = primeiro.dado;
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
        }
        tamanho--;  // Atualiza o tamanho
        return valor;
    }

    // Remover da direita
    public String removerDireita() {
        if (ultimo == null) return null;
        String valor = ultimo.dado;
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        tamanho--;  // Atualiza o tamanho
        return valor;
    }

    // Verifica se a lista contém um valor
    public boolean contem(String valor) {
        Nodo atual = primeiro;
        while (atual != null) {
            if (atual.dado.equalsIgnoreCase(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // Lista os elementos da lista
    public void listar() {
        Nodo atual = primeiro;
        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }
        while (atual != null) {
            System.out.println("- " + atual.dado);
            atual = atual.proximo;
        }
    }

    // Método para obter o primeiro nodo
    public Nodo getPrimeiro() {
        return primeiro;
    }

    // Método para obter o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }
}
