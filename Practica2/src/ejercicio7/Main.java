package ejercicio7;

import ejercicio1.BinaryTree;

public class Main {
	public static void main (String args[]) {
		BinaryTree<Integer> arbol2 = new BinaryTree(2);
		BinaryTree<Integer> arbol7 = new BinaryTree(7);
		BinaryTree<Integer> arbolMenos5 = new BinaryTree(-5);
		BinaryTree<Integer> arbol19 = new BinaryTree(19);
		BinaryTree<Integer> arbol6 = new BinaryTree(6);
		BinaryTree<Integer> arbol23 = new BinaryTree(23);
		BinaryTree<Integer> arbolMenos3 = new BinaryTree(-3);
		BinaryTree<Integer> arbol55 = new BinaryTree(55);
		BinaryTree<Integer> arbol11 = new BinaryTree(11);
		BinaryTree<Integer> arbol18 = new BinaryTree(18);
		BinaryTree<Integer> arbol4 = new BinaryTree(4);
		
		arbol2.addLeftChild(arbol7);
		arbol2.addRightChild(arbolMenos5);
		
		arbolMenos5.addLeftChild(arbol19);
		
		arbol19.addRightChild(arbol4);
		
		arbol4.addLeftChild(arbol18);
		
		arbol7.addRightChild(arbol6);
		arbol7.addLeftChild(arbol23);
		
		arbol6.addLeftChild(arbol55);
		arbol6.addRightChild(arbol11);
		
		arbol23.addLeftChild(arbolMenos3);
		
		
		ParcialArboles p = new ParcialArboles(arbol2);
		System.out.println(p.isLeftTree(2));
	}

}
