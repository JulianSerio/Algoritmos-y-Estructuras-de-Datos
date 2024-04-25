package ejercicio7;

import java.util.ArrayList;
import java.util.List;

import ejercicio1.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> arbol;
	
	public Caminos(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public List<Integer> caminoAHojaMasLejana(){
		int camino = 0;
		int max = -1;
		return caminoAHojaMasLejana(arbol,camino,max);
	}
	private List<Integer> caminoAHojaMasLejana(GeneralTree<Integer> nodo, int camino,int max){
		List<Integer> lista = new ArrayList<Integer>();
		if (nodo.getChildren().isEmpty()) {
			return null;
		}

		camino++;
		System.out.println(max);

		if (camino > max) {
			max = camino;
			lista.add(nodo.getData());
		}
		
		for (GeneralTree<Integer> child : nodo.getChildren()) {

			this.caminoAHojaMasLejana(child, camino,max);
		}
		return lista;
		
		
	}
}
