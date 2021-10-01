package main.java.html;

import main.java.data.ListaEstaticaTag;

public interface Handler {

    void onError(String msg);

    void onSuccess(ListaEstaticaTag listaTags);
}
