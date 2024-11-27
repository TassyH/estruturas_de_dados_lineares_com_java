package ORDENACAO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vetor[];
		int i, n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com o numero de elementos");
		n = entrada.nextInt();
		
		vetor = new int[n];
		
		System.out.println("entre com os elementos");
		for(i = 0; i <n; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		Ordenacao selecao = new Ordenacao(n, vetor);
		//selecao.selecao();
		//selecao.imprime();
		selecao.bubbleSort();
		selecao.imprime();
	}

}
