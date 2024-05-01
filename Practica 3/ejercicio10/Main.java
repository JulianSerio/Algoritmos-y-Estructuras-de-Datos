package ejercicio10;

import ejercicio1.GeneralTree;

public class Main {
	public static void main (String args[]) {
		 GeneralTree<Integer> root = new GeneralTree<>(1);
	     GeneralTree<Integer> child1 = new GeneralTree<>(0);
	     GeneralTree<Integer> child2 = new GeneralTree<>(1);
	     GeneralTree<Integer> child3 = new GeneralTree<>(1);
	     GeneralTree<Integer> child4 = new GeneralTree<>(1);
	     GeneralTree<Integer> child5 = new GeneralTree<>(1);
	     GeneralTree<Integer> child6 = new GeneralTree<>(0);
	     GeneralTree<Integer> child7 = new GeneralTree<>(1);
	     root.addChild(child1);
	     root.addChild(child2);
	     root.addChild(child3);
	     
	     child1.addChild(child4);
	     child1.addChild(child5);
	     
	     child2.addChild(child7);
	     child2.addChild(child6);
		
		
		
		System.out.println(ParcialArboles.resolver(root));
		
	}

}
