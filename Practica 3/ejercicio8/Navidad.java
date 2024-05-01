package ejercicio8;

import ejercicio1.GeneralTree;

public class Navidad {
	private GeneralTree<Integer> arbol; 
	
	public Navidad (GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public boolean esAbetoNavidenio() {
		return this.esAbetoNavidenio(arbol);
		
		
	}
	private boolean esAbetoNavidenio(GeneralTree<Integer> nodo) {
		if (nodo.getChildren().size() < 3) return false;
		
		int cont = 0;
		for (GeneralTree<Integer> child : nodo.getChildren()) {
			if(child.isLeaf()) {
				cont++;
			}
			else
				if (!this.esAbetoNavidenio(child)) return false;
		}
		
		if (cont >= 3) return true;
		else return false;
	}

}
