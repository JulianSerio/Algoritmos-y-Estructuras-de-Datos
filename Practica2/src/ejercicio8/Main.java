package ejercicio8;

import ejercicio1.BinaryTree;

public class Main {
	public static void main (String args[]) {
		BinaryTree<Integer> a65 = new BinaryTree(65);
		BinaryTree<Integer> a37= new BinaryTree(37);
		BinaryTree<Integer> a81 = new BinaryTree(81);
		BinaryTree<Integer> a47 = new BinaryTree(47);
		BinaryTree<Integer> a93= new BinaryTree(93);
		BinaryTree<Integer> a50= new BinaryTree(50);

		
		BinaryTree<Integer> b65 = new BinaryTree(65);
		BinaryTree<Integer> b37= new BinaryTree(37);
		BinaryTree<Integer> b81 = new BinaryTree(81);
		BinaryTree<Integer> b47 = new BinaryTree(47);
		BinaryTree<Integer> b93= new BinaryTree(93);
		
		
		a65.addLeftChild(a37);
		a65.addRightChild(a81);

		a81.addRightChild(a93);
		
		a37.addRightChild(a47);
		a37.addLeftChild(a50);
		
		b65.addLeftChild(b37);
		b65.addRightChild(b81);

		b81.addRightChild(b93);
		
		b37.addRightChild(b47);
		
		
		ParcialArboles p = new ParcialArboles();
		System.out.println(p.esPrefijo(a65,b65));
		
	}
}
