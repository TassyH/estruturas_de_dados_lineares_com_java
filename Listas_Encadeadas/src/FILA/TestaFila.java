package FILA;

public class TestaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		
		int elemento;
		
		elemento = fila.desenfileirar();
		System.out.println("saiu da fila: "+elemento);
		fila.enfileirar(22);
		fila.enfileirar(23);

		elemento = fila.desenfileirar();
		System.out.println("saiu da fila: "+elemento);
		fila.imprimeFila();

	}

}
