package FILA;

import PILHAS.No;
//primeiro a entrar, primeiro a sair

public class Fila {
	
	public No inicio;
	public No fim;

	public int n;
	
	public Fila() {
		inicio = null;
		fim = null;
		n = 0;
	}
	
	public int size() {
		return n;
	}
	
	public void enfileirar(int elemento) {
		No novo = new No(elemento);
		
		if(inicio == null && fim==null) {
			inicio = novo;
			fim = novo;
		}else {
			fim.proximo = novo;// essa linha está lincando o novo ao que ja existe
			fim = novo;
		}
		
		n++;
	}
	
	public int desenfileirar() {
		int elemento = inicio.elemento;
		inicio = inicio.proximo;
		n--;
		return elemento;
	}
	
	public void imprimeFila() {
		
		No ini = inicio;
		
		for(int i = 0; i < n; i++) {
			System.out.println("numFila: "+ini.elemento);
			ini = inicio.proximo;
			inicio = inicio.proximo;

		}
	}

}
