package LISTAS;

public class ListaEncadeada {

    private No inicio;
    private int n;

    public ListaEncadeada(){
        this.inicio = null;
        this.n = 0;
    }

    public int size(){
        return n;
    }

    public void add(int elemento){
        No novo = new No (elemento);
        int i;
       if(inicio == null){
            inicio = novo;
       }else{
        No atual = inicio;
        for(i = 0; i < n-1; i++){
            atual = atual.proximo;
        }
        atual.proximo = novo;
       }
       n++;
    }
    
    public void listar(){
        int i;
        No atual = inicio;

        for(i = 0; i < n; i++){
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
        System.out.println(" ");
    }
}
