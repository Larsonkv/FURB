package main.java.data;

import main.java.TagCount;

public class ListaEstaticaTag {

    private TagCount[] info = new TagCount[10];
    private int tamanho = 0;

    private void redimensionar() {
        TagCount[] oldArr = info;
        info = new TagCount[oldArr.length + 10];
        for (int i = 0; i < oldArr.length; i++) {
            info[i] = oldArr[i];
        }
    }

    public void inserir(TagCount item) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = item;
        tamanho++;
    }

    // sem uso
    public void exibir() {

        System.out.println(this.toString());
    }

    public int buscar(TagCount item) {
        for (int i = 0; i < getTamanho() - 1; i++) {
            if (obterElemento(i).equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public int buscarIndexTag(String tag) {
        for (int i = 0; i < getTamanho(); i++) {
            if (obterElemento(i).getTag().equals(tag)) {
                return i;
            }
        }

        return -1;
    }

    public void inserirEm(int index, TagCount tagCount) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[index] = tagCount;
    }

    // sem uso
    public void retirar(TagCount item) {
        int index = buscar(item);

        if (index != -1) {
            for (int i = index; i < getTamanho() - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = new TagCount[10];
        tamanho = 0;
    }

    public TagCount obterElemento(int position) {
        //Zero-indexed
        if (position > getTamanho() - 1 || position < 0) {
            throw new IndexOutOfBoundsException("Trying to access an index out the bounds of the current items on the list! Requested index was " + position + " while the size is " + getTamanho());
        }
        return info[position];
    }

    //sem uso
    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    //sem uso
    public void inverter() {
        for (int i = 0; i < getTamanho() / 2; i++) {
            TagCount temp = info[i];
            int farIndex = getTamanho() - 1 - i; //Zero-indexed
            info[i] = info[farIndex];
            info[farIndex] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        for (int i = 0; i < getTamanho(); i++) {
            elements.append(obterElemento(i).toString());
            if (i < getTamanho() - 1) {
                elements.append(",");
            }
        }

        return elements.toString();
    }
}
