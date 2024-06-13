package ejercicio3;

import java.util.ArrayList;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Vertex;

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

	    grafo.connect(A, B, 10);
	    grafo.connect(A, C, 10);	
	    grafo.connect(A, D, 5);
	    grafo.connect(B, E, 10);
	    grafo.connect(E, G, 5);
	    grafo.connect(B, C, 5);
	    
	    grafo.connect(C, D, 5);
	    grafo.connect(D, F, 5);
	    grafo.connect(F, G, 5);
	    
		
        Mapa map  = new Mapa(grafo);
     
        List<String> devolverCamino = map.devolverCamino("A","G");
        System.out.println("1. "+devolverCamino);
        
        
        List<String> ciudades = new ArrayList<String>();
        ciudades.add("C");
        List<String> devolverCaminoExceptuando = map.devolverCaminoExceptuando("A","G",ciudades);
        System.out.println("2. "+devolverCaminoExceptuando);
        
        
        List<String> caminoMasCorto = map.caminoMasCorto("A", "G");
        System.out.println("3. "+caminoMasCorto);
        
        List<String> caminoSinCargarCombustible = map.caminoSinCargarCombustible("A", "G", 20);
        System.out.println("4. "+caminoSinCargarCombustible);
        
        List<String> caminoMenorCarga = map.caminoConMenorCargaDeCombustible("A", "G", 20);
        System.out.println("5. "+caminoMenorCarga);
        
    }
}