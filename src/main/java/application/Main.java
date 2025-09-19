package application;

import application.lista.ListaSimples;

public class Main {
    public static void main(String[] args) {
       
        ListaSimples lista = new ListaSimples();

        Lista.adicionar("Primeiro");
        Lista.adicionar("Segundo");
        Lista.adicionar("Terveiro");

        lista.remover(1);

        System.out.println(lista);
    }
}

