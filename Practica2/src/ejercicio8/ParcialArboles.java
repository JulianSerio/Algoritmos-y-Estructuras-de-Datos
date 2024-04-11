package ejercicio8;

import ejercicio1.BinaryTree;

public class ParcialArboles {
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
	    if (arbol1 == null) {
	        // Si arbol1 es null, entonces no hay más nodos para comparar, por lo tanto, es un prefijo válido
	        return true;
	    }

	    if (arbol2 == null) {
	        // Si arbol2 es null, pero arbol1 no lo es, entonces no pueden ser prefijos
	        return false;
	    }

	    if (arbol1.getData() != arbol2.getData()) {
	        // Los datos de los nodos no coinciden, por lo tanto, no pueden ser prefijos
	        return false;
	    }

	    // Verifica recursivamente los subárboles izquierdos y derechos
	    boolean leftPrefix = esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
	    boolean rightPrefix = esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());

	    // Devuelve true si tanto el subárbol izquierdo como el derecho son prefijos válidos
	    return leftPrefix && rightPrefix;
	}
}
