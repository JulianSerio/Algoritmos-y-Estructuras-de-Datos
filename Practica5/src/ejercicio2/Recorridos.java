package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import ejercicio1.Edge;
import ejercicio1.Vertex;
import adjList.AdjListGraph;

public class Recorridos<T> {
	public List<T> dfs (AdjListGraph<T> grafo){
		List<T> lista = new ArrayList<T>();
		List<Vertex<T>> ady = grafo.getVertices();
		for (Vertex<T> vertex : ady) {
			lista.add(vertex.getData());
		}	
		return lista;
	}
	
	public List<T> bfs (AdjListGraph<T> grafo){
		List<T> lista = new ArrayList<T>(); 
		boolean[] visitados = new boolean[grafo.getSize()];
		for (int i = 0 ; i < grafo.getSize(); i++) {
			if (!visitados[i]) {
				this.bfs(grafo.getVertex(i),grafo,visitados,lista);
			}
		}
		return lista;
	}

	private void bfs(Vertex<T> origen, AdjListGraph<T> grafo, boolean[] visitados, List<T> lista) {
		Queue<Vertex<T>> queue = new Queue<Vertex<T>>();
		visitados[origen.getPosition()] = true;

		queue.enqueue(origen);
		
		while (!queue.isEmpty()) {
			Vertex<T> vertex = queue.dequeue();
			lista.add(vertex.getData());

			List<Edge<T>> adyacentes = grafo.getEdges(vertex);
			for (Edge<T> edge : adyacentes) {
				Vertex<T> vertexTarget = edge.getTarget();
				int pos = vertexTarget.getPosition();
				if (!visitados[pos]) {
					queue.enqueue(vertexTarget);
					visitados[pos] = true;
				}
			}
		}
	}
	
	

}
