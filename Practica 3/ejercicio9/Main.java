package ejercicio9;

import ejercicio1.GeneralTree;

public class Main {
	public static void main (String args[]) {
		GeneralTree<Integer> root = new GeneralTree<Integer>(12);
		GeneralTree<Integer> child1 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> child2 = new GeneralTree<Integer>(25);
		GeneralTree<Integer> child3 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> child4 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> child5 = new GeneralTree<Integer>(14);
		GeneralTree<Integer> child6 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> child7 = new GeneralTree<Integer>(13);
		GeneralTree<Integer> child8 = new GeneralTree<Integer>(25);

		GeneralTree<Integer> child9 = new GeneralTree<Integer>(5);

		
		root.addChild(child1);
		root.addChild(child2);
		
				
		child1.addChild(child3);
		child1.addChild(child4);
		
		
		child2.addChild(child8);
		child1.addChild(child9);
		
		System.out.println(ParcialArboles.esDeSeleccion(root));
		
	}

}
