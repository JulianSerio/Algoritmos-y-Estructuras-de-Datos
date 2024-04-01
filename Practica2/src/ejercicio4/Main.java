package ejercicio4;

import ejercicio1.BinaryTree;

public class Main {
	public static void main (String args[]) {
		BinaryTree<Integer> arbol1 = new BinaryTree(10);
		BinaryTree<Integer> arbol2 = new BinaryTree(2);
		BinaryTree<Integer> arbol3 = new BinaryTree(3);
		BinaryTree<Integer> arbol4 = new BinaryTree(9);
		BinaryTree<Integer> arbol5 = new BinaryTree(8);
		BinaryTree<Integer> arbol6 = new BinaryTree(4);
		BinaryTree<Integer> arbol7 = new BinaryTree(5);

		
		arbol1.addLeftChild(arbol2);
		arbol1.addRightChild(arbol3);
		
		arbol3.addLeftChild(arbol4);
		arbol3.addRightChild(arbol5);
		
		arbol2.addLeftChild(arbol7);
		arbol2.addRightChild(arbol6);
		
		RedBinariaLlena red = new RedBinariaLlena(arbol1);
		System.out.println(red.retardoReenvio());
		
	}

}
