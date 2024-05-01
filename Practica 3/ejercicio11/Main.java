package ejercicio11;

import ejercicio1.GeneralTree;

public class Main {
	
	public static void main (String args[]) {
		GeneralTree<Integer> root = new GeneralTree<Integer>(5);
		GeneralTree<Integer> nodo1 = new GeneralTree<Integer>(1);
		GeneralTree<Integer> nodo2 = new GeneralTree<Integer>(2);
		GeneralTree<Integer> nodo3 = new GeneralTree<Integer>(3);
		GeneralTree<Integer> nodo4 = new GeneralTree<Integer>(4);
		GeneralTree<Integer> nodo5 = new GeneralTree<Integer>(5);

		root.addChild(nodo1);
		root.addChild(nodo2);
		
		nodo1.addChild(nodo3);
		nodo1.addChild(nodo4);
		
		nodo2.addChild(nodo5);
		
		System.out.println(ParcialArboles.resolver(root));
		
	}

}
