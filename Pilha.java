package model;
public class Pilha<T> {
	No<T> topo;
	
	public Pilha() {
		topo = null;
	}
	
	//verifica se está vazia
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//coloca elementos na pilha
	public void push(T e) {
		No<T> elemento = new No<>();
		elemento.dado =e;
		if(isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//tira elementos da pilha e retorna
	public T pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		T valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	// mostra o topo da pilha
	public T top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		T valor = topo.dado;
		return valor;
	}
	
	//mostra o tamanho da pilhha 
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No<T> aux = topo;
			cont = 1;
			while(aux.proximo != null) {	
				aux = aux.proximo;
				cont++;
			}
		}
		return cont;
	}
}
