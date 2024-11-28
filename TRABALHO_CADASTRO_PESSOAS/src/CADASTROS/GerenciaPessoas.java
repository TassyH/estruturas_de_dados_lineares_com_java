package CADASTROS;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaPessoas extends Pessoa {
	
	private ArrayList<Pessoa> pessoas;
    private int id;
    
    public GerenciaPessoas() {
        id = 1;
        pessoas = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    
    public void cadastra(Pessoa pessoa) {
        
        pessoa.setId(id);
        id++;
        pessoas.add(pessoa); 
    }
    
    public void imprime() {
        
        for (Pessoa pessoaAtual: pessoas) {
            System.out.println();
            System.out.println("Id: " + pessoaAtual.getId());
            System.out.println("Nome: " + pessoaAtual.getNome());
            System.out.println("CPF: " + pessoaAtual.getCpf());
            System.out.println("Idade: " + pessoaAtual.getIdade());
        }
        
        System.out.println();
    } 
    
    public void pesquisa(String nome) {
        boolean encontrou = false;
        
        for (Pessoa pessoaAtual: pessoas) {
            if (pessoaAtual.getNome().equals(nome)) {
                System.out.println();
                System.out.println("Id: " + pessoaAtual.getId());
                System.out.println("Nome: " + pessoaAtual.getNome());
                System.out.println("CPF: " + pessoaAtual.getCpf());
                System.out.println("Idade: " + pessoaAtual.getIdade());
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Pessoa nao encontrada");
        }
    }

    public void ordenarPorNomeInsertionSort() {
       int n = pessoas.size();
       for (int i = 1; i < n; i++) { //nicia o laço que percorre a lista de pessoas a partir do segundo elemento (i = 1), já que o primeiro elemento está "ordenado" sozinho.
           Pessoa copia = pessoas.get(i); //Faz uma cópia temporária do objeto Pessoa que está na posição atual i (o elemento que queremos posicionar corretamente).
           int j = i - 1; //nicializa o índice j para apontar para o elemento imediatamente anterior ao atual (i).
           //j é usado para comparar o elemento em copia com os elementos anteriores na lista.

        // Move elementos maiores que 'copia' para frente
           while (j >= 0 && copia.getNome().compareToIgnoreCase(pessoas.get(j).getNome()) < 0) {
               pessoas.set(j + 1, pessoas.get(j)); //Desloca o elemento na posição j uma posição para a direita (j + 1).
                                                  // Isso cria espaço para o elemento copia ser inserido na posição correta.
               j--;
            }
        pessoas.set(j + 1, copia); //Quando o laço while termina, j + 1 será a posição correta para inserir o elemento copia e insere copia no local apropriado na lista.
    }
    System.out.println("Lista ordenada por Insertion Sort!");
 }

    public void ordenarPorNomeBubbleSort() {
        int i;
        boolean troca;
    
        do {
            troca = false; // Começamos assumindo que não haverá trocas
            for (i = 0; i < pessoas.size() - 1; i++) {
                // Compara o nome da pessoa atual (pos i) com o proximo (pos i + i)
                if (pessoas.get(i).getNome().compareToIgnoreCase(pessoas.get(i + 1).getNome()) > 0) {
                    // Troca as posições das pessoas na lista se estiver fora de ordem
                    Pessoa aux = pessoas.get(i); //guarda pessoa atual na variavel axiloar para comprar depois com o proximo
                    pessoas.set(i, pessoas.get(i + 1)); // Colocamos a próxima pessoa na posição atual
                    pessoas.set(i + 1, aux); // Colocamos a pessoa atual na próxima posição
                    troca = true; //  Dizemos que houve troca, então precisaremos repetir o processo
                }
            }
        } while (troca); // Repete enquanto houver trocas
        System.out.println("Lista ordenada por Bubble Sort");
    }

    public void ordenaQuickSort(int inicio, int fim) {
        int i = inicio;
        int j = fim;
    
        // Escolhe o pivô: aqui usamos o nome da pessoa no meio da lista
        String pivo = pessoas.get((inicio + fim) / 2).getNome();
    
        // Particiona os elementos da lista
        while (i <= j) {
            // Avança até encontrar um nome maior ou igual ao pivô
            while (pessoas.get(i).getNome().compareToIgnoreCase(pivo) < 0) i++;
            // Recuar até encontrar um nome menor ou igual ao pivô
            while (pessoas.get(j).getNome().compareToIgnoreCase(pivo) > 0) j--;
    
            if (i <= j) {
                // Troca as posições dos objetos
                Pessoa aux = pessoas.get(i);
                pessoas.set(i, pessoas.get(j));
                pessoas.set(j, aux);
    
                i++;
                j--;
            }
        }
    
        // Recursivamente ordena as duas metades
        if (inicio < j) {
            ordenaQuickSort(inicio, j);
        }
        if (i < fim) {
            ordenaQuickSort(i, fim);
        }
    }
    
    public void quickSort() {
        if (pessoas.size() > 1) {
            ordenaQuickSort(0, pessoas.size() - 1);
        }
    }
}