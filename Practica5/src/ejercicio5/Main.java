package ejercicio5;

import java.util.ArrayList;
import java.util.List;

import adjList.AdjListGraph;
import ejercicio1.Vertex;

public class Main {
	public static void main (String args[]) {
		AdjListGraph<Persona> grafo = new AdjListGraph<Persona>();

        Persona e = new Persona(false, "Empleado", false);
        Persona p1 = new Persona(true, "Jubilado 1", false);
        Persona p2 = new Persona(true, "Jubilado 2", false);
        Persona p3 = new Persona(true, "Jubilado 3", true);
        Persona p4 = new Persona(true, "Jubilado 4", true);
        Persona p5 = new Persona(true, "Jubilado 5", true);
        Persona p6 = new Persona(true, "Jubilado 6", true);
        Persona p7 = new Persona(true, "Jubilado 7", false);
        Persona p8 = new Persona(true, "Jubilado 8", true);

        Vertex<Persona> v1 = grafo.createVertex(e);
        Vertex<Persona> v2 = grafo.createVertex(p1);
        Vertex<Persona> v3 = grafo.createVertex(p2);
        Vertex<Persona> v4 = grafo.createVertex(p3);
        Vertex<Persona> v5 = grafo.createVertex(p4);
        Vertex<Persona> v6 = grafo.createVertex(p5);
        Vertex<Persona> v7 = grafo.createVertex(p6);
        Vertex<Persona> v8 = grafo.createVertex(p7);
        Vertex<Persona> v9 = grafo.createVertex(p8);

        grafo.connect(v1, v2);
        grafo.connect(v1, v3);
        grafo.connect(v1, v4);
        grafo.connect(v1, v5);
        grafo.connect(v3, v6);
        grafo.connect(v3, v7);
        grafo.connect(v4, v8);
        grafo.connect(v8, v9);

        QuedateEnCasa q = new QuedateEnCasa();

        List<Persona> lista = new ArrayList<Persona>();
        lista = q.bfs(grafo, e, 2);
        System.out.println("lista de jubilados: ");
        for(Persona p : lista) {
            System.out.println(p.get_nombre());
        }
	}
	
}
