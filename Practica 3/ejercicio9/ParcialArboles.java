package ejercicio9;

import ejercicio1.GeneralTree;

public class ParcialArboles {

	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		if (arbol.isLeaf()) return true;
		
		int min = 9999;
		for (GeneralTree<Integer> child :arbol.getChildren()) {
			if (child.getData() < min) {
				min = child.getData();
			}
			if (!esDeSeleccion(child)) {
				return false;
			}
		}
		if (min == arbol.getData()) {
			return true;
		}
		else return false;
		
	}

}
