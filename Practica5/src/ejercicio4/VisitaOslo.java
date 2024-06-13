package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import adjList.AdjListGraph;
import ejercicio1.Edge;
import ejercicio1.Graph;
import ejercicio1.Vertex;

public class VisitaOslo {
	public List<String> paseoEnBici (AdjListGraph<String> lugares, String destino, int maxTiempo, List<String> lugaresRestringidos){
		List<String> camino = new ArrayList<String>();
		if (!lugares.isEmpty()) {
			Vertex<String> ori = lugares.search("Ayuntamiento");
			Vertex<String> des = lugares.search(destino);
			int tiempoAct = 0;
			if (ori != null && des != null) {
				this.dfs(lugares,ori,des,maxTiempo,tiempoAct,camino,lugaresRestringidos, new boolean[lugares.getSize()]);
			}
		}
		return camino;
	}

	private boolean dfs(AdjListGraph<String> grafo, Vertex<String> origen, Vertex<String> destino, 
	int maxTiempo, int actTiempo, List<String> camino ,List<String> lugaresRestringidos, boolean[] visitados) {
		visitados[origen.getPosition()] = true;
		camino.add(origen.getData());

		if (origen.equals(destino)) {
			if (actTiempo < maxTiempo) {
				maxTiempo = actTiempo;
				System.out.println(maxTiempo);

			}
			return true;
		}
		else {
			Iterator<Edge<String>> it = grafo.getEdges(origen).iterator();
			boolean encontre = false;
			while (it.hasNext()&& !encontre) {
				Edge<String> edge = it.next();
				Vertex<String> vertex = edge.getTarget();
				int peso = edge.getWeight();
				int pos = vertex.getPosition();					
				boolean estaEnRestriccion = false;
				if (lugaresRestringidos.contains(vertex.getData())) estaEnRestriccion = true;
				if (!visitados[pos] && !estaEnRestriccion && actTiempo + peso < maxTiempo && !encontre) {
					actTiempo += peso;
					encontre = this.dfs(grafo, vertex, destino, maxTiempo,actTiempo,camino, lugaresRestringidos, visitados);
					if (encontre) return true;
					actTiempo -= peso;
				}
			}
		}
		visitados[origen.getPosition()] = false;
		camino.remove(camino.size() - 1);
		return false;
	}
}
