package ejercicio6;

import java.util.ArrayList;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Edge;
import ejercicio1.Vertex;

public class BuscadorDeCaminos {
	private AdjListGraph<String> bosque;
	
	public BuscadorDeCaminos (AdjListGraph<String> grafo) {
		this.bosque = grafo;
	}
	
	public List<List<String>> recorridosMasSeguros(){
		List<List<String>> caminos = new ArrayList<List<String>>();
		if (!this.bosque.isEmpty()) {
			Vertex<String> origen = this.bosque.search("Casa Caperucita");
			Vertex<String> destino = this.bosque.search("Casa Abuelita");
			if (origen != null && destino != null) {
				this.dfs(origen,destino,caminos,new ArrayList<String>(),new boolean[this.bosque.getSize()]);
			}
		}
		return caminos;
	}

	private void dfs(Vertex<String> origen, Vertex<String> destino, List<List<String>> caminos,
	ArrayList<String> caminoAct, boolean[] visitados) {
		visitados[origen.getPosition()] = true;
		caminoAct.add(origen.getData());
		if (origen == destino) {
			caminos.add(new ArrayList<>(caminoAct));
		}
		else {
			for (Edge<String> edge : this.bosque.getEdges(origen)) {
				int peso = edge.getWeight();
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				if (!visitados[pos] && peso < 5) {
					this.dfs(vertex, destino, caminos, caminoAct, visitados);
				}
			}
		}
		visitados[origen.getPosition()] = false;
		caminoAct.remove(caminoAct.size() - 1);
	}
	
	

}
