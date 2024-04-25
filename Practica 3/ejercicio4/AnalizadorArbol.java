package ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

import ejercicio1.GeneralTree;

public class AnalizadorArbol {
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		if (arbol == null) return 0;
		Queue<GeneralTree<AreaEmpresa>> queue = new LinkedList<>();
		queue.offer(arbol);
		double max = -1;
		
		while (!queue.isEmpty()) {			
			int size = queue.size();
			double sum = 0;
			
			for (int i = 0; i < size; i++) {
				GeneralTree<AreaEmpresa> aux = queue.poll();
				sum += aux.getData().getTardanza();
				
				for (GeneralTree<AreaEmpresa> child: aux.getChildren()) {
					queue.offer(child);
				}
			}
			double prom = sum / size;
			if (prom > max) 
				max = prom;
			
		}
		return max;
		
	}

	

}
