package CADASTROS;

import java.util.Scanner;

public class PrincipalCadastrosPessoas {
	
	
	public static void cadastraPessoa(Scanner teclado, GerenciaPessoas gerenciador) {
        teclado = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Entre com o nome");
		String nome = teclado.nextLine();
		pessoa.setNome(nome);
		
		System.out.println("Entra com o cpf");
		String cpf = teclado.nextLine();
		pessoa.setCpf(cpf);
		
		System.out.println("Entre com idade");
        int idade = Integer.parseInt(teclado.nextLine());
        pessoa.setIdade(idade);
        
        System.out.println("Entre com o sexo");
        String sexo = teclado.nextLine();
        pessoa.setSexo(sexo);
        
        pessoa.getNome();
        pessoa.getCpf();
        pessoa.getIdade();
        pessoa.getSexo();
        
        gerenciador.cadastra(pessoa);
	}

	

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		GerenciaPessoas gerenciador = new GerenciaPessoas();
		boolean on = false;

		do {
			    on = true;
			    System.out.println("Escolha uma das opções abaixo: ");
		        System.out.println("1 - CADASTRAR");
		        System.out.println("2 - LISTAR");
		        System.out.println("3 - PESQUISAR");
		        System.out.println("4 - REMOVER");
		        int opcao = teclado.nextInt();
		        
		        switch(opcao) {
		        	case 1:
		        		cadastraPessoa(teclado, gerenciador);
		        		break;
		        	case 2:
		        		gerenciador.listarInformacao();
		        		break;
		        	case 3:
		        		gerenciador.pesquisaPessoa(teclado, gerenciador);
		        		break;
					case 4:
		        		gerenciador.removerPessoa(teclado, gerenciador);
		        		break;
		        	case 5:
		        		System.out.println("its over baby");
		        		on = false;
		        }		
		}while (on);
       
		
	}

}
