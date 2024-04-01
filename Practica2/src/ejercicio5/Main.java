package ejercicio5;

import java.util.ArrayList;

import ejercicio1.BinaryTree;
import ejercicio3.ContadorArbol;

public class Main {
	public static void main(String args[]) {
		BinaryTree<Integer> arbol1 = new BinaryTree(5);
		BinaryTree<Integer> arbol2 = new BinaryTree(4);
		BinaryTree<Integer> arbol3 = new BinaryTree(3);
		BinaryTree<Integer> arbol4 = new BinaryTree(6);
		BinaryTree<Integer> arbol5 = new BinaryTree(8);
		BinaryTree<Integer> arbol6 = new BinaryTree(1);
		
		arbol1.addLeftChild(arbol2);
		arbol1.addRightChild(arbol3);
		arbol3.addLeftChild(arbol4);
		arbol3.addRightChild(arbol5);
		arbol2.addRightChild(arbol6);
		
		ProfundidadArbolBinario prof = new ProfundidadArbolBinario(arbol1);
		System.out.println(prof.sumaElementosProfundidad(2));
		
	}
	
}
