package ejercicio3;

import java.util.ArrayList;
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
	    Vertex<String> F = grafo.createVertex("F");
	    Vertex<String> G = grafo.createVertex("G");

	    grafo.connect(A, B);
	    grafo.connect(A, C);	
	    grafo.connect(A, D);
	    grafo.connect(B, E);
	    grafo.connect(D, F);
	    grafo.connect(E, G);
	    grafo.connect(F, G);
	    
	    
	    grafo.connect(B, C);
	    //grafo.connect(C, B);
	    grafo.connect(C, D);
	    //grafo.connect(D, C);
	  
	 
		
        Mapa map  = new Mapa(grafo);
        
        List<String> recorrido = map.devolverCamino("A","G");
        System.out.println("1. "+recorrido);
        
        List<String> ciudades = new ArrayList<String>();
        ciudades.add("C");
        List<String> recorridoEx = map.devolverCaminoExceptuando("A","G",ciudades);
        System.out.println("2. "+recorridoEx);
        
        
    }
}
