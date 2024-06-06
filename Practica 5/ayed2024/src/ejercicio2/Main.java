package ejercicio2;

import java.util.List;

import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class Main {
	public static void main(String[] args) {
		AdjListGraph<String> grafo = new AdjListGraph<>();
	    Vertex<String> A = grafo.createVertex("A");
	    Vertex<String> B = grafo.createVertex("B");
	    Vertex<String> C = grafo.createVertex("C");
	    Vertex<String> D = grafo.createVertex("D");
	    Vertex<String> E = grafo.createVertex("E");

	    grafo.connect(A, B);
	    grafo.connect(A, C);
	    grafo.connect(B, D);
	    grafo.connect(C, D);
	    grafo.connect(D, E);
		

        // Crear la instancia de Recorridos y realizar el DFS
        Recorridos<String> recorridos = new Recorridos<>();
        List<String> recorrido = recorridos.dfs(grafo);

        // Imprimir el recorrido en profundidad
        System.out.println("Recorrido en profundidad: " + recorrido);
    }
}
