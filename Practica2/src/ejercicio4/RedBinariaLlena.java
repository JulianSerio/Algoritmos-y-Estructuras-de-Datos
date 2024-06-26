package ejercicio4;

import ejercicio1.BinaryTree;

public class RedBinariaLlena {
	private BinaryTree<Integer> nodo;
	
	public RedBinariaLlena(BinaryTree<Integer> nodo) {
		this.nodo = nodo;
	}
	
	public int retardoReenvio() {
		return this.recorridoPreOrden(nodo);
	}
	//ESTRATEGIA = Profundidad
	//Revisar
	private int recorridoPreOrden(BinaryTree<Integer> nodo) {
		if (nodo.isLeaf() {
			return 0;
		}
		int suma = 0;
		suma+=nodo.getData();
		if ((nodo.hasLeftChild() & nodo.hasRightChild()))  {
			if (nodo.getLeftChild().getData() > nodo.getRightChild().getData()) 
				suma += this.recorridoPreOrden(nodo.getLeftChild());
			else suma += this.recorridoPreOrden(nodo.getRightChild());
		}
		return suma;
	}

}
