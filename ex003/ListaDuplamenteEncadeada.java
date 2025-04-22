package ex003;

public class ListaDuplamenteEncadeada {
    private Nodo primeiro;
    private Nodo ultimo;

    public void inserirInicio(Aluno aluno) {
        Nodo novo = new Nodo(aluno);
        if (primeiro == null) {
            primeiro = ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            primeiro = novo;
        }
    }

    public void inserirFim(Aluno aluno) {
        Nodo novo = new Nodo(aluno);
        if (ultimo == null) {
            primeiro = ultimo = novo;
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }

    public void listar() {
        Nodo atual = primeiro;
        while (atual != null) {
            Aluno a = atual.getAluno();
            System.out.println("Nome: " + a.nome + ", Idade: " + a.idade);
            atual = atual.getProximo();
        }
    }
}
