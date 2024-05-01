package ejercicio11;

import java.util.LinkedList;
import java.util.Queue;

import ejercicio1.GeneralTree;

public class ParcialArboles {
	
	public static boolean resolver(GeneralTree<Integer> arbol) {
		
		Queue<GeneralTree<Integer>> queue = new LinkedList<GeneralTree<Integer>>();
		queue.offer(arbol);
		int nodosNivelAnterior = 0;
		
		while (!queue.isEmpty()) {
			int nivelAnterior = queue.size();
			
			if (nivelAnterior != nodosNivelAnterior + 1) {
				return false;
			}
			
			nodosNivelAnterior = nivelAnterior;
			
			while (nivelAnterior > 0) {
				GeneralTree<Integer> nodoAux = queue.poll();
				for (GeneralTree<Integer> child : nodoAux.getChildren()) {
					queue.offer(child);
				}	
				nivelAnterior--;
			}
		
		}
		return true;
	}
}
