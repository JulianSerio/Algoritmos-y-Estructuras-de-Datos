package ejercicio7;

import java.util.List;

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
	    GeneralTree<Integer> child8 = new GeneralTree<>(7);
	    
	    root.addChild(child1);
	    root.addChild(child2);

	    child1.addChild(child3);
   		child1.addChild(child4);
   		
   		child2.addChild(child5);
   		child2.addChild(child6);
   		
   		child4.addChild(child7);
   		child6.addChild(child8);
   		
   		Caminos c = new Caminos(root);
   		List<Integer> lista = c.caminoAHojaMasLejana();
   		
   		for (Integer elem : lista) {
   			System.out.println(elem);
   		}

		
	}
}
