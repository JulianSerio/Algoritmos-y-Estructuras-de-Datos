package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class Recorridos<T> {	
	public Recorridos() {
	}

	public List<T> dfs (AdjListGraph<T> grafo){
		List<T> lista = new ArrayList<T>();
		List<Vertex<T>> ady = grafo.getVertices();
		for (Vertex<T> vertex : ady) {
			lista.add(vertex.getData());
		}	
		return lista;
	}
	

}
