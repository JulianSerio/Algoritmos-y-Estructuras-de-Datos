package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Edge;
import ejercicio1.Vertex;

public class QuedateEnCasa {
	
	public List<Persona> bfs (AdjListGraph<Persona> grafo, Persona empleado, int grado){
		List<Persona> lista = new ArrayList<Persona>();
		if (!grafo.isEmpty()) {
			Vertex<Persona> origen = grafo.search(empleado);
			if (origen != null) {
				boolean[] visitados = new boolean[grafo.getSize()];
				if (!visitados[origen.getPosition()]) {
					this.bfs(origen,grafo,visitados,grado,lista);
				}
			}
		}
		return lista;
	}

	private void bfs(Vertex<Persona> origen, AdjListGraph<Persona> grafo, boolean[] visitados, int grado, List<Persona> lista) {
		Queue<Vertex<Persona>> queue = new Queue<Vertex<Persona>>();	//creo queue de vertices 
		Queue<Integer> queueDistancia = new Queue<Integer>();	//creo queue de distancias
		queue.enqueue(origen);	//ingreso el vertice
		visitados[origen.getPosition()] = true;	//seteo el vertice act en true
		int distanciaAct = 0;	//inicializo distancia
		queueDistancia.enqueue(distanciaAct);	//ingreso distanciaAct
		while (!queue.isEmpty() && lista.size() < 40) { //mientras no se vacie la cola y la lista tenga menos de 40 elementos
			Vertex<Persona> vertex = queue.dequeue(); //desencolo el vertice act 
			distanciaAct = queueDistancia.dequeue();	//desencolo distancia act
			if (distanciaAct <= grado) {	//si la distancia es menor al grado
				List<Edge<Persona>> adyacentes = grafo.getEdges(vertex); //creo una lista de adyacentes del vertice act
				Iterator<Edge<Persona>> it = adyacentes.iterator();		
				while (it.hasNext() && lista.size() < 40) {	//mientras tenga adyacentes y la lista tenga menos de 40 elementos
					Edge<Persona> edge = it.next();	//tomo la arista
					Vertex<Persona> vertexTarget = edge.getTarget(); //tomo a donde apunta la arista
					int pos = vertexTarget.getPosition();	// obtengo la pos del vertice apuntado
					if (!visitados[pos]) {	//si no esta visitado
						visitados[pos] = true;	//lo pongo en true
						queue.enqueue(vertexTarget);	//lo encolo	
						queueDistancia.enqueue(distanciaAct + 1);	//encolo la distancia a la que esta (1 + act) 
						Persona p = vertexTarget.getData();	//obtengo persona act
						if (p.is_jubilado() && !p.is_ultimoPago()) lista.add(p); // si cumple agrego 
					}
				}
			}
		}
	}

}
