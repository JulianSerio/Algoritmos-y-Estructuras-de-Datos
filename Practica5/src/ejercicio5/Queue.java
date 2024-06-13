package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Queue<T>{
	private List<T> data;

	public Queue() {
		this.data = new ArrayList<T>();
	}
	
	public void enqueue (T dato) {
		this.data.add(dato); //Cargo al final 
	}
	
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("La cola está vacía");
	    }
	    return data.remove(0);  //Saco del principio
	}    
	
	public T head() {
		if (isEmpty()) {
			throw new IllegalStateException("La cola está vacía");
		 }
		return data.get(0); // Devuelvo el primero
	 }
	 
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public int size() {
		return data.size();
	}
	
	public String toString() {
		String aux = null; 
		for (T elem:data) {
			aux = aux + elem + " ";
		}
		return aux;
	}

	public List<T> getData() {
		return data;
	}
	
	
	
	
	
	
	
	
}
