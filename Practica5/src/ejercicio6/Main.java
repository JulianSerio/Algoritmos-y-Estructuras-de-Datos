package ejercicio6;

import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Graph;
import ejercicio1.Vertex;

public class Main {
	public static void main (String args[]) {
		AdjListGraph<String> grafo = new AdjListGraph<>();
		
		Vertex<String> casaCaperucita = grafo.createVertex("Casa Caperucita");
		Vertex<String> claro1 = grafo.createVertex("Claro 1");
		Vertex<String> claro2 = grafo.createVertex("Claro 2");
		Vertex<String> claro3 = grafo.createVertex("Claro 3");
		Vertex<String> claro4 = grafo.createVertex("Claro 4");
		Vertex<String> claro5 = grafo.createVertex("Claro 5");
		Vertex<String> casaAbuelita = grafo.createVertex("Casa Abuelita");
		
		grafo.connect(casaCaperucita, claro3,4);
		grafo.connect(casaCaperucita, claro1,3);
		grafo.connect(casaCaperucita, claro2,4);
		
		grafo.connect(claro3, claro5,15);
		
		grafo.connect(claro1, claro5,3);
		
		grafo.connect(claro2, claro1,4);
		grafo.connect(claro2, claro5,11);
		grafo.connect(claro2, claro4,10);
		
		grafo.connect(claro4, casaAbuelita,9);
		grafo.connect(claro5, casaAbuelita,4);
		
		BuscadorDeCaminos buscador = new BuscadorDeCaminos(grafo);
		List<List<String>> caminos = buscador.recorridosMasSeguros();
		System.out.println(caminos);
	}

}
