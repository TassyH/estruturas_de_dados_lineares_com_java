package PILHAS;

public class Pilha {
	
	//primeiro a entrar, ultimo a sair
	
	public No topo;
	public int n;
	
	public Pilha() {
		topo = null;
		n = 0;
	}
	
	public int size() {
		return n;
	}
	
	public void push(int elemento) {
		No novo = new No(elemento);
		
		if(topo==null) {
			topo = novo;
		}else {
			novo.proximo = topo;
			topo = novo;
		}
		
		n++;
	}
	
	public int pop() {
		
		int elemento = topo.elemento;
		topo = topo.proximo;
		n--; //ta tirando ele ta pilha
		return elemento;
	}

}
