package ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	
	public T shift() {
		T elem = this.getData().remove(0); //Saco primera pos
		this.enqueue(elem); //Cargo al final
		return elem; //Retorno el elemento
	}

}
