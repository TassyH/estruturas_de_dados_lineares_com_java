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
	public void cadastra(Pessoa pessoa) {
		pessoa.setId(id);
		id++;
		pessoas.add(pessoa);
	}
	public void listarInformacao() {
		for(Pessoa pessoaAtual: pessoas) {
			System.out.println("...........................");
			System.out.println("ID: "+pessoaAtual.getId());
			System.out.println("NOME: "+pessoaAtual.getNome());
			System.out.println("CPF: "+pessoaAtual.getCpf());
			System.out.println("IDADE: "+pessoaAtual.getIdade());
			System.out.println("SEXO: "+pessoaAtual.getSexo());
			System.out.println("...........................");

		}

	}
	
	public void pesquisaPessoa(Scanner teclado, GerenciaPessoas gerenciador) {
		
		System.out.println("Entre com o nome da pessoa que deseja procurar");
		String nomeSearch = teclado.next();
		
		for(Pessoa pessoaAtual: pessoas) {
			if(pessoaAtual.getNome().equals(nomeSearch)) {
				gerenciador.listarInformacao();
				System.out.println("...........................");
			}
		}
		
	}

	public void removerPessoa(Scanner teclado, GerenciaPessoas gerenciador) {
		
		System.out.println("Entre com o nome da pessoa de pessoa que deseja remover");
		String nome; 
		nome = teclado.next();
		
		for(Pessoa pessoaatual: pessoas) {
			if(pessoaatual.getNome().equals(nome)) {
				pessoas.remove(pessoaatual);
				System.out.println("pessoa removida com sucesso");
			}
		}
	}

	public void atualizarPessoa(Scanner teclado, GerenciaPessoas gp){
		System.out.println("Entre com o id da pessoa que deseja atualizar");
		int id = teclado.nextInt();

	   
		

	}
}

