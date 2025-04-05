package ex001;

public class ListaDuplamenteEncadeada {
	private Nodo primeiro = null;
	private int n = 0;
	private Nodo ultimo = null;

	public void inserirEsquerda(int valor) {
		Nodo aux = new Nodo();
		aux.dado = valor;

		if (n == 0) {
			primeiro = aux;
			ultimo = aux;
			aux.anterior = null;
		} else {
			aux.proximo = primeiro;
			aux.anterior = null;
			primeiro = aux;
		}
		n++;
	}

	public void inserirDireita(int valor) {
		Nodo aux = new Nodo();
		aux.dado = valor;

		if (n == 0) {
			primeiro = aux;
			ultimo = aux;
			aux.anterior = null;
			aux.anterior = null;
		} else {
			aux.proximo = null;
			aux.anterior = ultimo;
			ultimo.proximo = aux;
			ultimo = aux;
		}
		n++;
	}

	public int removerListaDireita() {
		Nodo antes, aux = ultimo;
		int dado;

		if (n == 0) {
			return 0;
		} else {
			dado = aux.dado;
			n--;

			if (n == 0) {
				primeiro = null;
				ultimo = null;
			} else {
				antes = aux.anterior;
				ultimo = antes;
				antes.proximo = null;
			}
			return (dado);
		}
	}
	
	public int removerListaEsquerda() {
		Nodo depois, aux = primeiro;
		int dado;
		
		if(n == 0) {
			return 0;
		} else {
			dado = aux.dado;
			n--;
			
			if (n == 0) {
				primeiro = null;
				ultimo = null;
			} else {
				
				depois = aux.proximo;
				primeiro = depois;
				primeiro.anterior = null;
			}
			return dado;
		}
		
	}
	
	public void listarListaImprimir() {
		Nodo aux = primeiro;
		
		System.out.println("Será que vai funcionar?? Vamos lá");
		if(aux != null) {
			while (aux != null) {
				System.out.println(aux.dado + "");
				aux = aux.proximo;
			}
		} else {
			System.out.println("Moral a lista ta vaziaaa....");
		}
		
		System.out.println();
	}
}
