package ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ejercicio4.AreaEmpresa;

public class GeneralTree<T> {
	private T data;
	private List<GeneralTree<T>> children =
	new LinkedList<GeneralTree<T>>();
	
	public GeneralTree() {
		
	}
	
	public GeneralTree(T data) {
		this.data = data;
	}
	
	public GeneralTree(T data,List<GeneralTree<T>> children){
		this(data);
		this.children = children;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
		this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		getChildren().add(child);
	}
	
	public boolean isLeaf() {
		return !hasChildren();
	}
	
	public boolean hasChildren() {
		return children!=null && !children.isEmpty();
	}
	
	public boolean isEmpty() {
		return data==null && !this.hasChildren();
	}
	
	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren()) {
			children.remove(child);
		}
	}
	
	public int altura() {
		return altura(this);
	}
	
	public int altura (GeneralTree<T> node) {
		int max = -1;
		for (GeneralTree<T> child : node.getChildren()) {
			int alturaHijo = this.altura(child);
			if (alturaHijo > max) {
				max = alturaHijo;
			}
		}
		return max + 1;
	}
	
	public int nivel (T dato) {
		return nivel(this,dato,0);
	}
	
	private int nivel (GeneralTree<T> node, T dato, int nivelActual) {
		if (node.getData().equals(dato)) {
			return nivelActual;
		}
		for (GeneralTree<T> child: node.getChildren()) {
			int nivelEncontrado = nivel(child,dato,nivelActual + 1);
			if (nivelEncontrado != -1) {
				return nivelEncontrado;
			}
		}	
		return -1;
	}
	
	public int ancho() {
        Queue<GeneralTree<T>> queue = new LinkedList<>();
        queue.offer(this); // Agrega el nodo raíz a la cola
        int maxAncho = 0;

        while (!queue.isEmpty()) {
            int nivelSize = queue.size(); // Cantidad de nodos en el nivel actual

            // Verifica si el nivel actual tiene más nodos que el máximo anterior
            if (nivelSize > maxAncho) {
                maxAncho = nivelSize;
            }

            // Agrega todos los hijos de los nodos del nivel actual a la cola
            for (int i = 0; i < nivelSize; i++) {
                GeneralTree<T> node = queue.poll();
                
                for (GeneralTree<T> child : node.getChildren()) {
                    queue.offer(child);
                }
            }
        }
        return maxAncho;
	}
	
	public boolean esAncestro(T a, T b) {
		if (this == null) return false;
		GeneralTree<T> nodoA = this.encontrarA(a);
		return this.encontrarB(nodoA, b); 
	}
	
	private boolean encontrarB (GeneralTree<T> nodo, T b) {
		if (nodo == null || nodo.isEmpty()) return false;
		if (nodo.getData() == b) return true;
		for (GeneralTree<T> child : nodo.getChildren()) {
			if (this.encontrarB(child, b)) return true;
		}
		return false;
	}
	
	private GeneralTree<T> encontrarA (T a){
		if (this == null) return null;
		Queue<GeneralTree<T>> queue = new LinkedList<>();
		queue.offer(this);
		double max = -1;
		
		while (!queue.isEmpty()) {			
			int size = queue.size();
			double sum = 0;
			
			for (int i = 0; i < size; i++) {
				GeneralTree<T> aux = queue.poll();
				if (aux.getData() == a) return aux;
				
				
				for (GeneralTree<T> child: aux.getChildren()) {
					queue.offer(child);
				}
			}			
		}
		return null;
	}
	
}
