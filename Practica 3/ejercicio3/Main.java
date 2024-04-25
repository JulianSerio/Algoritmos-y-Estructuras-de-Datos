package ejercicio3;

import ejercicio1.GeneralTree;

public class Main {
	public static void main (String args[]) {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(3);
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(1);
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(5);
		GeneralTree<Integer> a4 = new GeneralTree<Integer>(10);
		GeneralTree<Integer> a5 = new GeneralTree<Integer>(20);
		
		a1.addChild(a2);
		a1.addChild(a3);
		a1.addChild(a4);
		a4.addChild(a5);
		
		//System.out.println("Altura "+a1.altura());
		//System.out.println("Nivel del valor 5: "+a1.nivel(3));
		//System.out.println("Ancho "+a1.ancho());
	}

}
