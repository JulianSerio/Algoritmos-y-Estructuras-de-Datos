package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tp5.ejercicio1.Edge;
import tp5.ejercicio1.Graph;
import tp5.ejercicio1.Vertex;
import tp5.ejercicio1.adjList.AdjListGraph;

public class Mapa {
	private AdjListGraph<String> mapaCiudades;
	
	public Mapa (AdjListGraph<String> graph) {
		this.mapaCiudades = graph;
	}
	
	public List<String> devolverCamino(String ciudad1, String ciudad2) {
		List<String> listaCiudades = new ArrayList<String>();
		Vertex<String> origen = mapaCiudades.search(ciudad1);
		Vertex<String> destino = mapaCiudades.search(ciudad2);
		Boolean[] visitados = new Boolean[this.mapaCiudades.getSize()];
		Arrays.fill(visitados, false);
		if (origen != null && destino != null) {
			this.dfs(origen,destino,listaCiudades,visitados);
		}
		return listaCiudades;
	}
	private boolean dfs(Vertex<String> origen, Vertex<String> destino, List<String> listaCiudades, Boolean[] visitados) {
		visitados[origen.getPosition()] = true; //marco la pos actual como visitada
		listaCiudades.add(origen.getData()); //lo agrego a la lista
		if (origen == destino) {	
			return true;	//cuando encuentre el destino retorno true, pq tengo que cortar (origen y destino tienen que ser iguales)
		} else {	//sino encontre el destino
			List<Edge<String>> adyacentes = mapaCiudades.getEdges(origen); //obtengo la lista de aristas adyacentes
			Iterator<Edge<String>> it = adyacentes.iterator();	//creo un iterador de aristas
			boolean corto = false; //variable que me determina cuando cortar
			while (it.hasNext() && (!corto)) {	//mientras hay aristas por recorrer y no corto
				Edge<String> edge = it.next();	//obtengo el elemento
				int pos = edge.getTarget().getPosition();	//obtengo la pos del elemento
				if (!visitados[pos]) {	//si no esta visitado
					corto = dfs(edge.getTarget(),destino,listaCiudades,visitados);	
				}
			}
			if (!corto) {	//si no corte significa que me quede sin elementos 
				listaCiudades.remove(listaCiudades.size() -1);
			}
			else return true;
			return false;
		}
	}
	public List<String> devolverCaminoExceptuando(String ciudad1, String ciudad2, List<String> ciudades){
		List<String> listaCamino = new ArrayList<String>();
		Vertex<String> origen = mapaCiudades.search(ciudad1);
		Vertex<String> destino = mapaCiudades.search(ciudad2);
		Boolean[] visitados = new Boolean[this.mapaCiudades.getSize()];
		Arrays.fill(visitados, false);
		if (origen != null && destino != null) {
			this.dfsExceptuando(origen,destino,listaCamino,ciudades,visitados);
		}
		return listaCamino;
	}
	private boolean dfsExceptuando(Vertex<String> origen, Vertex<String> destino, List<String> listaCamino,List<String> ciudades, Boolean[] visitados) {
		visitados[origen.getPosition()] = true;
		listaCamino.add(origen.getData());
		if (origen == destino) return true;
		else {
			Iterator<Edge<String>> it = this.mapaCiudades.getEdges(origen).iterator();
			boolean corto = false;
			while (it.hasNext() && !corto) {
				Edge<String> edge = it.next();
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				String ciudad = vertex.getData();
				
				Iterator<String> itCiudades = ciudades.iterator();
				boolean coincide = false;
		
				while (!coincide && itCiudades.hasNext()) {
					if (itCiudades.next() == ciudad) coincide = true;						
				}
				
				if (!coincide) {
					if (!visitados[pos])
					corto = dfsExceptuando(vertex,destino,listaCamino,ciudades,visitados);
				}
			}
			if (!corto) listaCamino.remove(listaCamino.size() - 1); 
			else return true;
			return false;
		}	
	}
	public List<String> caminoMasCorto(String ciudad1, String ciudad2){
		List<String> camino = new ArrayList<String>();
		Vertex<String> origen = this.mapaCiudades.search(ciudad1);
		Vertex<String> destino = this.mapaCiudades.search(ciudad2);
		Boolean[] visitados = new Boolean[this.mapaCiudades.getSize()];
		Arrays.fill(visitados, false);
		int cont = 0;
		if (origen != null && destino != null) {
			this.dfsMasCorto(origen,destino,camino,new ArrayList<String>(),visitados,cont);
		}
		return camino;
	}

	private boolean dfsMasCorto(Vertex<String> origen, Vertex<String> destino, List<String> camMin, List<String> camAct,Boolean[] visitados,int contAct, int contMin) {
		visitados[origen.getPosition()] = true;
		camAct.add(origen.getData());
		if (origen == destino) return true;
		else {
			Iterator<Edge<String>> it = this.mapaCiudades.getEdges(origen).iterator();
			boolean corto = false;
			while (it.hasNext() && !corto) {
				Edge<String> edge = it.next();
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				acum = edge.getWeight();
				
				if (!visitados[pos]) corto = this.dfsMasCorto(vertex, destino, camMin, camAct, visitados, acum);
			}
			if (!corto) camAct.remove(camAct.size() -1);
			else return true;
			return false;
		}
		
	}
	

}
