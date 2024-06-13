package ejercicio4;

import java.util.ArrayList;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Vertex;

public class Main {
	public static void main (String args[]) {
		AdjListGraph<String> grafo = new AdjListGraph<>();
		
	    Vertex<String> ayuntamiento = grafo.createVertex("Ayuntamiento");
	    Vertex<String> parqueBotanico = grafo.createVertex("Parque Botanico");
	    Vertex<String> museoMunch = grafo.createVertex("Museo Munch");
	    Vertex<String> elTigre = grafo.createVertex("El Tigre");
	    Vertex<String> galeriaNacional = grafo.createVertex("Galeria Nacional");
	    Vertex<String> palacioReal = grafo.createVertex("Palacio real");
	    Vertex<String> akkerBrigge = grafo.createVertex("Akker Brigge");		
	    Vertex<String> laOpera = grafo.createVertex("La Opera");
	    Vertex<String> fortalezaAkershus = grafo.createVertex("Fortaleza Akershus");
	    Vertex<String> museoVikingo = grafo.createVertex("Museo Vikingo");
	    Vertex<String> museoFram = grafo.createVertex("Museo Fram");
	    Vertex<String> museoBarcoPolar = grafo.createVertex("Museo del Barco Polar");
	    Vertex<String> folkMuseum = grafo.createVertex("FolkMuseum");
	    Vertex<String> parqueVigeland = grafo.createVertex("Parque Vigeland");
	    Vertex<String> holmenkollen = grafo.createVertex("Holmenkollen");
	    
	    grafo.connect(ayuntamiento, elTigre,15);
	    grafo.connect(ayuntamiento, parqueBotanico,10);
	    grafo.connect(ayuntamiento, akkerBrigge,20);
	    grafo.connect(ayuntamiento, palacioReal,5);
	    grafo.connect(elTigre, museoMunch,15);
	    grafo.connect(elTigre, laOpera,5);
	    grafo.connect(laOpera, fortalezaAkershus,10);
	    grafo.connect(museoMunch, parqueBotanico,1);
	    grafo.connect(parqueBotanico, galeriaNacional,15);
	    grafo.connect(galeriaNacional, parqueVigeland,10);
	    
	    grafo.connect(akkerBrigge, folkMuseum,30);
	    grafo.connect(akkerBrigge, museoVikingo,30);
	    grafo.connect(palacioReal, folkMuseum,5);
	    
	    grafo.connect(museoBarcoPolar, museoVikingo,5);
	    grafo.connect(museoFram, museoBarcoPolar,5);
	    grafo.connect(folkMuseum, museoFram,5);
	    grafo.connect(parqueVigeland, holmenkollen,30);
	    grafo.connect(parqueVigeland, folkMuseum,20);
	    
	    VisitaOslo visita = new VisitaOslo();
	    List<String> restringidos = new ArrayList<String>();
	    List<String> camino = visita.paseoEnBici(grafo, "Museo Vikingo", 120,restringidos);
	    System.out.println("Lugares " + camino);
	    

	    
	    
	}

}
