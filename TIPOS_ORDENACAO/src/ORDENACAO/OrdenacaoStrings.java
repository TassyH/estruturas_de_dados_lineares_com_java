package ORDENACAO;

import java.util.Scanner;

public class OrdenacaoStrings {
	
	private int[] vetor;
	private String palavras[];
	private int n;

	public OrdenacaoStrings(int n, int vetor[]) {
		this.n = n;
		this.vetor = vetor;
	}
	public OrdenacaoStrings(int n, String palavras[]) {
		this.n = n;
		this.palavras = palavras;
	}
	public void selecaoInt() {
		int i, j, pos_atual, pos_menor, menor, aux;
	}
	
	public void selecaoString() {
		int i, j, pos_atual, pos_menor;
		String menor, aux;
		
		for(i =0; i<n-1; i++) {
			pos_atual = i;
			menor = palavras[i];
			pos_menor = i;
			
			for (j = i; j <n; j++) {
				if(palavras[j].compareTo(menor) < 0) {
					menor = palavras[j];
					pos_menor = j;
				}
			}
			
			aux = palavras[pos_atual];
			palavras[pos_atual] = palavras[pos_menor];
			palavras[pos_menor] = aux;
		}
	
	}
	public void imprimeString() {
		int i, j, pos_atual, pos_menor, menor, aux;

		for(i = 0; i <n; i++) {
			System.out.print(palavras[i] + " ");
		}
	}
	

public static void main (String args[]) {
	
	int vetori[];
	String palavras[];
	int n, i;

	
	Scanner entrada = new Scanner(System.in);
	System.out.println("entre com o numero de elementos");
	n = Integer.parseInt(entrada.nextLine());
	
	palavras = new String[n];
	
	System.out.println("entre com os elementos");
	for(i = 0; i <n; i++) {
		palavras[i] = entrada.nextLine();
	}
	OrdenacaoStrings selecao = new OrdenacaoStrings(n, palavras);
	selecao.selecaoString();
	selecao.imprimeString();
	
	
	
}
}