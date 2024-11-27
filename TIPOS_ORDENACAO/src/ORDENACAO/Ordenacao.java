package ORDENACAO;

import java.util.Scanner;

public class Ordenacao {

	private int vetor[];
	private int n;
	
	public Ordenacao(int n, int vetor[]) {
		this.n = n;
		this.vetor = vetor;
	}
	
	public void selecao() {
		int i, j, pos_atual, pos_menor, menor, aux;
		
		for(i =0; i<n-1; i++) {
			pos_atual = i;
			menor = vetor[i];
			pos_menor = i;
			
			for (j = i; j <n; j++) {
				if(vetor[j] < menor) {
					menor = vetor[j];
					pos_menor = j;
				}
			}
			
			aux = vetor[pos_atual];
			vetor[pos_atual] = vetor[pos_menor];
			vetor[pos_menor] = aux;
		}
	}
	
	public void insersao() {
		int i, j, copia;
		// i = posição atual
		// j = posição anterior, indice que eu vou usar para percorrer os anteriores
		
		for(i = 1; i<n;i++) {
			copia = vetor[i];
			j = i-1; //inicializa o j com ele pegando a posição atual -1 (ou seja, a anterior)
			
			while(j>=0 && copia < vetor[j]) { //esse while é quem vai empurrar os numeros para frente, fazer a cópia
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = copia;
		}
	}
	
	public void bubbleSort() {
		int i, j, posterior,pos_atual, maior;
		boolean trocar;
	
		do{
			
			trocar = false;
			
			for(i=0; i <n-1; i++) {
				if(vetor[i] > vetor[i+1]) {
					maior = vetor[i];
					vetor[i] = vetor[i+1];;//linha que faz a troca
					vetor[i+1] = maior;//
					trocar = true;
				}
			}
			
		}while(trocar);
	}
	
	public void imprime() {
		int i;
		for(i = 0; i <n; i++) {
			System.out.println(vetor[i] + " ");
		}
}


	
		
		
		
		
	

}
