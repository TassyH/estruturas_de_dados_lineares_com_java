package CADASTROS;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceUsuario {

    private int[] vetor;
	private String palavras[];
	private int n;
	private GerenciaPessoas gerenciador;
    private Scanner teclado;
    
    public InterfaceUsuario() {
        gerenciador = new GerenciaPessoas();
        teclado = new Scanner(System.in);
    }
    
    public void cadastraPessoa() {
        Pessoa pessoa = new Pessoa();
        
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(teclado.nextLine());
        
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        
        gerenciador.cadastra(pessoa);
        System.out.println();
    }
    
    public void listarOrdenadaBolha() {
        System.out.println("Lista ordenada por nome (Bubble Sort):");
        gerenciador.ordenarPorNomeBubbleSort();; // Chama o método de ordenação
        gerenciador.imprime(); // Imprime a lista ordenada
    }

    public void listarOrdenadaSelectionSort() {
    ArrayList<Pessoa> pessoas = gerenciador.getPessoas();
    
    if (pessoas.isEmpty()) {
        System.out.println("Nenhuma pessoa cadastrada para listar.");
        return;
    }

    // Selection Sort para ordenar por nome
    for (int i = 0; i < pessoas.size() - 1; i++) {
        int menorIndice = i;
        for (int j = i + 1; j < pessoas.size(); j++) {
            if (pessoas.get(j).getNome().compareToIgnoreCase(pessoas.get(menorIndice).getNome()) < 0) {
                menorIndice = j;
            }
        }

        // Trocar os objetos de posição na lista
        if (menorIndice != i) {
            Pessoa temp = pessoas.get(i);
            pessoas.set(i, pessoas.get(menorIndice));
            pessoas.set(menorIndice, temp);
        }
    }
    // Imprimir pessoas ordenadas
    System.out.println("\n--- Lista de Pessoas Ordenada por Nome ---");
    for (Pessoa pessoaAtual : pessoas) {
        System.out.println("Id: " + pessoaAtual.getId());
        System.out.println("Nome: " + pessoaAtual.getNome());
        System.out.println("CPF: " + pessoaAtual.getCpf());
        System.out.println("Idade: " + pessoaAtual.getIdade());
        System.out.println();
    }
}

    public void listarOrdenadaQuick() {
       System.out.println("Lista ordenada por nome:");
       gerenciador.quickSort();
       gerenciador.imprime(); // Método já existente para imprimir as pessoas
    }

    public void pesquisaPessoa() {
        
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
       
        gerenciador.pesquisa(nome);
        
        System.out.println();
    }
    
    public static void imprimeMenu() {
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Listar Ordenado selection sort");
        System.out.println("5 - Listar Ordenado insertion sort");
        System.out.println("6 - Listar Ordenado bubble sort");
        System.out.println("7 - Listar Ordenado quick sort");
        System.out.println("8 - Sair");
    }

    public void executa() {
        GerenciaPessoas gp = new GerenciaPessoas();
        int op;
        
        do {
            imprimeMenu();
            System.out.print("Digite a opcao: ");
            op = Integer.parseInt(teclado.nextLine());
            
            switch (op) {
                case 1: cadastraPessoa();
                        break;
                case 2: gerenciador.imprime();
                        break;
                case 3: pesquisaPessoa();
                        break;
                case 4: listarOrdenadaSelectionSort();
                        break;
                case 5: gp.ordenarPorNomeInsertionSort();
                        break;
                case 6: listarOrdenadaBolha();
                        break;
                case 7: listarOrdenadaQuick();
                        break;
                case 8: break;
                default: System.out.println("Opcao invalida");
                
             }
        } while (op != 8);  
    }  
}
