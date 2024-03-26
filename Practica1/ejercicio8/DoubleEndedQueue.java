package ejercicio8;

import java.util.ArrayDeque;

public class DoubleEndedQueue<T> extends Queue<T>{
	private ArrayDeque<T> data;

	
	public DoubleEndedQueue() {
		super();
		this.data = new ArrayDeque<T>();
	}



	public void enqueueFirst(T dato) {
		data.addFirst(dato);;
	}

}
