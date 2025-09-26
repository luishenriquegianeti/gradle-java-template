package application;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

public class Main {
    public static void main(String[] args) {
       
        ListaSimples lista = new ListaSimples();

        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terveiro");

        lista.remover(1);

        System.out.println(lista);

        System.out.println("PILHA");
        PilhaSimples pilha = new PilhaSimples(4);
        pilha.empilhar("primeiro");
        pilha.empilhar("Segundo");
        pilha.empilhar("terceiro");
        pilha.empilhar("quatro");
        
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());

        
        System.out.println(pilha);
    }
}

