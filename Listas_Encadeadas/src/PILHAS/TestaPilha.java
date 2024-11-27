package PILHAS;

import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		Scanner teclado = new Scanner(System.in);
		
		int op = 0;
		int elemento;
		
		do {
			
			System.out.println("1 - POP");
			System.out.println("2 - PUSH");
			System.out.println("3 - SIZE");
			System.out.println("1 - SAIR");
			System.out.println("ESCOLHA UMA OPÇAO");
			op = teclado.nextInt();
			
		    if(op ==1) {
		    	System.out.println("ADICIONE O ELEMENTO NUMERICO: ");
		    	
		    	elemento = teclado.nextInt();
		    	p.push(elemento);
		    }else if(op==2) {
		    	System.out.println("ADICIONE O ELEMENTO NUMERICO RENOVAR: ");
		    	if(elemento) {
		    		elemento = teclado.nextInt();
			    	elemento = p.pop();
		    	}
		    	
		    }else if(op==3) {
		    	System.out.println(p.size());
		    }else {
		    	System.out.println("bye");
		    }

			
		}while(op < 4);
		
		
		p.push(10);
		p.push(2);
		p.push(9);
		
		elemento = p.pop();
		
		System.out.println(elemento);
        elemento = p.pop();
		System.out.println(elemento);
        elemento = p.pop();
		System.out.println(elemento);
		
		System.out.println(p.size());
		
		p.push(10);
		p.push(2);
		p.push(9);
		
		System.out.println(p.size());

	}

}
