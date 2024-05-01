package ejercicio8;

import ejercicio1.GeneralTree;

public class Main {
	public static void main (String args[]) {
		GeneralTree<Integer> root = new GeneralTree<>(7);
	    GeneralTree<Integer> child1 = new GeneralTree<>(5);
	    GeneralTree<Integer> child2 = new GeneralTree<>(3);
	    GeneralTree<Integer> child3 = new GeneralTree<>(3);
	    GeneralTree<Integer> child4 = new GeneralTree<>(4);
	    GeneralTree<Integer> child5 = new GeneralTree<>(1);
	    GeneralTree<Integer> child6 = new GeneralTree<>(2);
	    GeneralTree<Integer> child7 = new GeneralTree<>(5);
	    
	    root.addChild(child1);
	    root.addChild(child2);
	    root.addChild(child3);
	    root.addChild(child4);
	    
	    child2.addChild(child5);
	    child2.addChild(child6);
	    child2.addChild(child7);
	    child2.addChild(child7);
	    
	    child6.addChild(child7);
	    child6.addChild(child7);
	    
	    

	    
	    Navidad n = new Navidad(root);
	    
	    System.out.println(n.esAbetoNavidenio());
	}
}
