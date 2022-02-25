package main.java.data;

public interface Pilha<T> {

    void push(T valor);

    T pop();

    T peek();

    boolean estaVazia();

    void liberar();
}
