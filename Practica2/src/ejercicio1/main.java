package ejercicio1;

public class main {
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
		
		
		System.out.println(arbol1.contarHojas());
		
		//arbol1.imprimirPreOrden();
		//System.out.println();
		//arbol1.espejo().imprimirPreOrden();
		
		//arbol1.entreNiveles(0,1); no funciona para niveles != 0

		
		
	}

}
