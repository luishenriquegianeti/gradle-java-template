package application.pilha;

public class PilhaSimples {
    private String[] itens;
    private int tamanho;
    private int topo;

     public PilhaSimples(int tamanho){
        this.tamanho = tamanho;
        this.itens = new String[this.tamanho];
        this.topo = -1;
     }
     public void empilhar (String valor){
        if(topo == (tamanho - 1)){
            System.out.println("pilha cheia!!");
        }else {
            itens[++topo] = valor;
        }

     }
public String desempilhar(){
    String resultado = "";
    if(topo == -1){
        System.out.println("pilha Vazia");
    }else{
        resultado = itens[topo--];
    }
    
    return resultado;
}

     @Override
     public String toString(){
        String resultado = "";
        if(topo >= 0){
            for(int cont = 0; cont <= topo; cont++){
                resultado += itens [cont] + "";

            }
        }
        return resultado;
     }
}