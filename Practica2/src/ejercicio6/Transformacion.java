package ejercicio6;

import ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma(){
		this.recorrerArbol(this.arbol);
		return arbol;
	}
	
	public int recorrerArbol(BinaryTree<Integer> nodo) {
		if (nodo.isLeaf()) {
			int aux = nodo.getData();
			nodo.setData(0);
			return aux;
		}
		int sum = nodo.getData();
		if (nodo.hasLeftChild()) sum+=this.recorrerArbol(nodo.getLeftChild());
	
		if (nodo.hasRightChild()) sum+=this.recorrerArbol(nodo.getRightChild());

		nodo.setData(sum);
		

		
		return sum;
		
	}
	public int recorrerArbol(BinaryTree<Integer> nodo) {
		if (nodo.isLeaf()) {
			int aux = nodo.getData();
			nodo.setData(0);
			return aux;
		}
		int sumLeft = 0; int sumRight = 0;
		if (nodo.hasLeftChild()) sumLeft = this.recorrerArbol(nodo.getLeftChild());
		if (nodo.hasRightChild()) sumRight = this.recorrerArbol(nodo.getRightChild());
		
		int aux = nodo.getData();
		nodo.setData(sumLeft + sumRight);
		
		return aux + sumLeft + sumRight;
		
	}
	

}
