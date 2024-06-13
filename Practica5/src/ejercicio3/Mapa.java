package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Edge;
import ejercicio1.Vertex;

public class Mapa {
	private AdjListGraph<String> mapaCiudades;
	
	public Mapa (AdjListGraph<String> graph) {
		this.mapaCiudades = graph;
	}
	
	public List<String> devolverCamino(String ciudad1, String ciudad2) {
		List<String> listaCiudades = new ArrayList<String>();
		Vertex<String> origen = mapaCiudades.search(ciudad1);
		Vertex<String> destino = mapaCiudades.search(ciudad2);
		boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
		if (origen != null && destino != null) {
			this.dfs(origen,destino,listaCiudades,visitados);
		}
		return listaCiudades;
	}
	private boolean dfs(Vertex<String> origen, Vertex<String> destino, List<String> listaCiudades, boolean[] visitados) {
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
		boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
		if (origen != null && destino != null) {
			this.dfsExceptuando(origen,destino,listaCamino,ciudades,visitados);
		}
		return listaCamino;
	}
	private boolean dfsExceptuando(Vertex<String> origen, Vertex<String> destino, List<String> listaCamino,List<String> ciudades, boolean[] visitados) {
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
				boolean coincide = false;
				
				if (ciudades.contains(ciudad)) coincide = true;

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
		if (!this.mapaCiudades.isEmpty()) {
			Vertex<String> origen = this.mapaCiudades.search(ciudad1);
			Vertex<String> destino = this.mapaCiudades.search(ciudad2);
			boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
			if (origen != null && destino != null) {
				 this.dfsMasCorto(origen,destino,camino,new ArrayList<String>(),visitados);
			}
		}
		return camino;
	}

	private void dfsMasCorto(Vertex<String> origen, Vertex<String> destino, List<String> camMin, List<String> camAct,boolean[] visitados) {
		visitados[origen.getPosition()] = true;
		camAct.add(origen.getData());
		if (origen.equals(destino)) {
			if (camMin.isEmpty()) camMin.addAll(new ArrayList<>(camAct));
			if (camAct.size() < camMin.size()) {
				camMin.clear();
				camMin.addAll(new ArrayList<>(camAct));
			}
		}
		else {
			for (Edge<String> edge :  this.mapaCiudades.getEdges(origen)) {
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				if (!visitados[pos]) {
					dfsMasCorto(vertex, destino, camMin, camAct, visitados);
				}	
			}	
			//SI YO PONGO EL visitados[origen.getPosition()] = false; CUANDO ENCUENTRA EL DATO NO ENTRA
			//NO ENTRA AL ELSE POR LO TANTO QUEDA MARCADO ETERNAMENTE
		}
		camAct.remove(camAct.size() -1);
		visitados[origen.getPosition()] = false;	
	}
	
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto){
		Auto auto = new Auto(tanqueAuto,tanqueAuto);
		List<String> camino = new ArrayList<String>();
		if (!this.mapaCiudades.isEmpty()) {
			Vertex<String> origen = this.mapaCiudades.search(ciudad1);
			Vertex<String> destino = this.mapaCiudades.search(ciudad2);
			if (origen != null && destino != null) {
				boolean[] visitados = new boolean[this.mapaCiudades.getSize()];
				this.dfsSinCargarCombustible(origen, destino, camino, auto,visitados);
			}
		}
		return camino;
	}
	
	private boolean dfsSinCargarCombustible(Vertex<String> origen, Vertex<String> destino, List<String> camino, Auto auto, boolean[] visitados) {
		visitados[origen.getPosition()] = true;
		camino.add(origen.getData());
		if (origen.equals(destino)) {
			return true;
		}
		else {
			Iterator<Edge<String>> it = this.mapaCiudades.getEdges(origen).iterator();
			boolean encontre = false;
			while (it.hasNext() && !encontre) {
				Edge<String> edge = it.next();
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				int peso = edge.getWeight();
				
				if (!visitados[pos] && auto.getTanque() - peso > 0) {
					auto.setTanque(auto.getTanque() - peso);
					encontre = this.dfsSinCargarCombustible(vertex, destino, camino, auto, visitados);
					if (encontre) return true;
					auto.setTanque(auto.getTanque() + peso);			
				}
			}
		}
		  visitados[origen.getPosition()] = false;
	      camino.remove(camino.size() - 1);
	      return false;
	}
	
	public List<String> caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto) {
		List<String> camino = new ArrayList<String>(); 
		Auto auto = new Auto(tanqueAuto,tanqueAuto);
		if (!this.mapaCiudades.isEmpty()) {
			Vertex<String> origen = this.mapaCiudades.search(ciudad1);
			Vertex<String> destino = this.mapaCiudades.search(ciudad2);
			if (origen != null && destino != null) {
				Integer min = Integer.MAX_VALUE;
				dfsMenorCarga(origen,destino,auto,new ArrayList<String>(),camino,new boolean[this.mapaCiudades.getSize()],min);	
			}
		}
		return camino;
	}

	private void dfsMenorCarga(Vertex<String> origen, Vertex<String> destino, Auto auto,ArrayList<String> camino,List<String> caminoMin, boolean[] visitados,Integer min) {
		visitados[origen.getPosition()] = true;
		camino.add(origen.getData());
		if (origen.equals(destino)) {
			if (auto.getCantidadCargas() < min) {
				caminoMin.clear();
				min = auto.getCantidadCargas();
				auto.cargar();
				auto.setCantidadCargas(0);
				caminoMin.addAll(new ArrayList<>(camino));	
			}
		}
		else {
			for (Edge<String> edge : this.mapaCiudades.getEdges(origen)) {
				Vertex<String> vertex = edge.getTarget();
				int pos = vertex.getPosition();
				int peso = edge.getWeight();
				if (!visitados[pos] ) {
					System.out.println(origen.getData() + " --- " + edge.getWeight() + " --- " + vertex.getData() + " tanque " + auto.getTanque());
					
					if (auto.getTanque() - peso > 0) {
						auto.setTanque(auto.getTanque() - peso);
					}
					else if (auto.getTanque() - peso <= 0) {
						auto.setTanque(auto.getTanque() - peso);
						auto.cargar();
					}
					this.dfsMenorCarga(vertex, destino, auto, camino, caminoMin, visitados,min);
				}
			}
		}
		visitados[origen.getPosition()] = false;
		camino.remove(camino.size() - 1);
	}
}