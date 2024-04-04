package ejercicio6;

import ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma(){
		if (!this.tree.isEmpty())
			this.recorrerArbol(this.arbol);
		return arbol;
	}
	
	private int recorrerArbol(BinaryTree<Integer> nodo) {
		int oldValue = nodo.getData();
		int newValue = 0;
		if (!nodo.isLeaf()) {
			if (nodo.hasLeftChild()) newValue += this.recorrerArbol(nodo.getLeftChild());
			if (nodo.hasRightChild()) newValue += this.recorrerArbol(nodo.getRightChild());
		}	
		nodo.setData(newValue);
		return newValue + oldValue;
		
	}
	public void imprimirArbol(BinaryTree<Integer> arbol) {
		System.out.println(arbol.getData());
		if (arbol.hasLeftChild()) {
			this.imprimirArbol(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			this.imprimirArbol(arbol.getRightChild());
		}
	}
	

}
