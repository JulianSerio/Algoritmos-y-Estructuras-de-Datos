package ejercicio10;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ejercicio1.GeneralTree;

public class ParcialArboles {
	public static List<Integer> resolver(GeneralTree<Integer> arbol){
		List<Integer> listaActual = new LinkedList<Integer>();
		List<Integer> listaCaminoMaximo = new LinkedList<Integer>();
		int nivel = 0;
		
		return resolver(arbol,listaActual,listaCaminoMaximo,nivel);	
	}
	
	public static List<Integer> resolver (GeneralTree<Integer> nodo, List<Integer> listaActual, List<Integer> listaCaminoMaximo, int nivel){
		if (nodo.isLeaf()) {
			if (nodo.getData() == 1) {
				listaCaminoMaximo.add(nodo.getData());
				return listaCaminoMaximo;
			}
		}
		
		if ()
		
		
		
	}

}
