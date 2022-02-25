package main.java.data;

public class ListaEncadeada<T> {

    private NoLista<T> primeiro, ultimo;

    public NoLista<T> getPrimeiro() {

        return primeiro;
    }

    public NoLista<T> getUltimo() {

        return ultimo;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);

        if (estaVazia()) {
            ultimo = novo;
        }

        primeiro = novo;
    }

    // sem uso
    public void inserirNoFinal(T info) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(null);

        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }

        ultimo = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    // sem uso
    public NoLista<T> buscar(T info) {
        NoLista<T> proximo = primeiro;
        while (proximo != null) {
            if (proximo.getInfo().equals(info)) {
                return proximo;
            }
            proximo = proximo.getProximo();
        }

        return null;
    }

    public void retirar(T info) {
        NoLista<T> anterior = null;
        NoLista<T> proximo = primeiro;

        while (proximo != null && !proximo.getInfo().equals(info)) {
            anterior = proximo;
            proximo = proximo.getProximo();
        }

        if (proximo != null) {
            if (anterior == null) {
                primeiro = proximo.getProximo();
            } else {
                anterior.setProximo(proximo.getProximo());
            }

            if (proximo == ultimo) {
                ultimo = anterior;
            }
        }
    }

    // sem uso
    public int obterComprimento() {
        int size = 0;
        NoLista<T> proximo = primeiro;

        while (proximo != null) {
            size++;
            proximo = proximo.getProximo();
        }

        return size;
    }

    // sem uso
    public NoLista<T> obterNo(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Tried to get a node with a negative index.");
        }
        int pos = 0;
        NoLista<T> proximo = primeiro;

        while (proximo != null) {
            if (pos == index) {
                return proximo;
            }
            pos++;
            proximo = proximo.getProximo();
        }

        throw new IndexOutOfBoundsException("Tried to get a node with an index higher than the actual size of the list.");
    }

    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        NoLista<T> proximo = primeiro;

        while (proximo != null) {
            elements.append(proximo.getInfo().toString()).append(",");
            proximo = proximo.getProximo();
        }

        int index = (elements.lastIndexOf(","));
        if (index > 0) {
            elements.deleteCharAt(index);
        }
        return elements.toString();
    }
}

