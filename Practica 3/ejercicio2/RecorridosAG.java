package ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ejercicio1.GeneralTree;

public class RecorridosAG {
	//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	//pasados como parámetros, recorrido en preorden.
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lista = new ArrayList<Integer>();
		if (a == null) return lista; 
	
		if (a.getData() % 2 != 0 && a.getData() > n) 
			lista.add(a.getData());
		
	
		for (GeneralTree<Integer> e: a.getChildren()) {
			lista.addAll(numerosImparesMayoresQuePreOrden(e, n));
		}
		return lista;
	}
	
	//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	//pasados como parámetros, recorrido en inorden.			
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lista = new ArrayList<Integer>();
		if (a == null) return lista;
		
		numerosImparesMayoresQueInOrden(a.getChildren().get(0),n);
		
		if (a.getData() % 2 != 0 && a.getData() > n)
			lista.add(a.getData());
		
		for (int i = 1; i < a.getChildren().size(); i++) {
			numerosImparesMayoresQueInOrden(a.getChildren().get(i),n);
		}
		return lista;
	}

	//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	//pasados como parámetros, recorrido en postorden.	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lista = new ArrayList<Integer>();
		if (a == null) return lista;
		
		if (a.hasChildren()) 
			for (GeneralTree<Integer> e: a.getChildren()) {
				lista.addAll(this.numerosImparesMayoresQuePostOrden(e, n));
			}
		if (a.getData() % 2 != 0 && a.getData() > n)
			lista.add(a.getData());
		return lista;
	}

	//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	//pasados como parámetros, recorrido por niveles.	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> a, Integer n) {
	    List<Integer> lista = new LinkedList<Integer>();
	    if (a == null) return lista; // Devolver una lista vacía si el árbol es nulo

	    Queue<GeneralTree<Integer>> queue = new LinkedList<>(); // Usar LinkedList como implementación de Queue
	    queue.offer(a) ;

	    while (!queue.isEmpty()) {
	        GeneralTree<Integer> treeAux = queue.poll();

	        // Verificar si el valor es impar y mayor que n
	        if (treeAux.getData() % 2 != 0 && treeAux.getData() > n) {
	            lista.add(treeAux.getData());
	        }

	        List<GeneralTree<Integer>> children = treeAux.getChildren();
	        for (GeneralTree<Integer> child : children) {
	            queue.offer(child);
	        }
	    }
	    return lista;
	}

}
