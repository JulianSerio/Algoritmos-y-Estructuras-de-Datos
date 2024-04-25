package ejercicio6;

import ejercicio1.GeneralTree;

public class Main {
	public static void main(String[] args) {
	        // Crear la estructura de la red de agua potable
		GeneralTree<Character> root = new GeneralTree<>('M');
	    GeneralTree<Character> child1 = new GeneralTree<>('A');
	    GeneralTree<Character> child2 = new GeneralTree<>('B');
	    GeneralTree<Character> child3 = new GeneralTree<>('C');
	    GeneralTree<Character> child4 = new GeneralTree<>('D');
	    GeneralTree<Character> child5 = new GeneralTree<>('E');
	    GeneralTree<Character> child6 = new GeneralTree<>('F');
	    GeneralTree<Character> child7 = new GeneralTree<>('G');
	    GeneralTree<Character> child8 = new GeneralTree<>('H');
	    GeneralTree<Character> child9 = new GeneralTree<>('I');
	    GeneralTree<Character> child10 = new GeneralTree<>('J');
	    GeneralTree<Character> child11 = new GeneralTree<>('K');
	    GeneralTree<Character> child12 = new GeneralTree<>('L');

	    root.addChild(child1);
	    root.addChild(child2);
	    root.addChild(child3);
	    root.addChild(child4);
	    
	    child1.addChild(child5);
   		child1.addChild(child6);
   		child1.addChild(child7);
   		
   		child2.addChild(child8);
   		child2.addChild(child9);
   		
   		child3.addChild(child10);
   		child3.addChild(child11);
   		
   		child4.addChild(child12);

	    

	    // Crear la red de agua potable
	    RedDeAguaPotable red = new RedDeAguaPotable(root);

	    // Calcular el caudal mínimo
	    double caudalMinimo = red.minimoCaudal(1000.0);
	    System.out.println("El caudal mínimo que recibe una casa es: " + caudalMinimo + " litros.");
	}
}

