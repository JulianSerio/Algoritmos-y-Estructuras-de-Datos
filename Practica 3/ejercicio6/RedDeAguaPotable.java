package ejercicio6;

import java.util.LinkedList;
import java.util.Queue;

import ejercicio1.GeneralTree;

public class RedDeAguaPotable {
	private GeneralTree<Character> arbol;
	
	public RedDeAguaPotable(GeneralTree<Character> arbol) {
		this.arbol = arbol;
	}
	
	public double minimoCaudal(double caudal) {
        return minimoCaudal(arbol, caudal);
    }

    private double minimoCaudal(GeneralTree<Character> nodo, double caudal) {
        if (nodo.getChildren().isEmpty()) return caudal;
        
        double min = 9999;
        double caudalDividido = caudal / nodo.getChildren().size();
        
        for (GeneralTree<Character> child : nodo.getChildren()) {
        	double aux = minimoCaudal(child,caudalDividido);
        	System.out.println(aux);
        	if (aux < min) {
        		min = aux;
        	}
        }
        return min;
    }
	
}
