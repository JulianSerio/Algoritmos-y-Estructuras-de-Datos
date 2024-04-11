package ejercicio7;

import ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol; 
	
	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public boolean isLeftTree(int num) {
		int izq = -1; int der = -1;
		BinaryTree<Integer> nodo = buscarNodo(arbol,num);
		if (nodo == null) return false;
		System.out.println(nodo.getData());
		if (nodo.hasLeftChild()) {
			izq = recorrer(nodo.getLeftChild());
		}
		if (nodo.hasRightChild()) {
			der = recorrer(nodo.getRightChild());
		}
		return izq > der;

	}
	
	private BinaryTree<Integer> buscarNodo (BinaryTree<Integer> arbol, int num){
		if (arbol != null) {
			if (arbol.getData().equals(num)) {
				return arbol;
			}
			BinaryTree<Integer> nodoIzquierdo = this.buscarNodo(arbol.getLeftChild(), num);
	        if (nodoIzquierdo != null) {
	            return nodoIzquierdo; // Si se encuentra en el subárbol izquierdo, retornar el nodo encontrado
	        }
	        // Buscar en el subárbol derecho
	        BinaryTree<Integer> nodoDerecho = this.buscarNodo(arbol.getRightChild(), num);
	        if (nodoDerecho != null) {
	            return nodoDerecho; // Si se encuentra en el subárbol derecho, retornar el nodo encontrado
	        }
		}
		return null;
	}
	
	private int recorrer (BinaryTree<Integer> nodo) {
		int sum = 0;
		if (nodo != null) {
			if (!nodo.hasLeftChild() & nodo.hasRightChild() || nodo.hasLeftChild() & !nodo.hasRightChild()) {
				sum++;
				if (nodo.hasLeftChild()) {
					sum += recorrer(nodo.getLeftChild());
				}
				else {
					sum += recorrer(nodo.getRightChild());
				}	
			}
			if (nodo.hasLeftChild() && nodo.hasRightChild()) {
				sum += recorrer(nodo.getLeftChild());
				sum += recorrer(nodo.getRightChild());
			}
		}
		return sum;
	}
	
}
