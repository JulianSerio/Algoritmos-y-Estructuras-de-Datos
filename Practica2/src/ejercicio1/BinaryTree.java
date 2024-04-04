package ejercicio1;

import java.util.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {  
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		int sum = 0;
		if (this.isLeaf()) {
			return 1;
		}
		if (this.hasLeftChild()) sum += this.getLeftChild().contarHojas();
		if (this.hasRightChild()) sum += this.getRightChild().contarHojas();
		return sum;		
	}
		
	public void imprimirPreOrden() {
	
		System.out.println(this.getData());
		
		if (this.hasLeftChild()) {
			System.out.print("izquierda ");
			this.getLeftChild().imprimirPreOrden();
		}
		if (this.hasRightChild()) {
			System.out.print("derecha ");
			this.getRightChild().imprimirPreOrden();
		}
	}

    	 
    public BinaryTree<T> espejo(){
    	BinaryTree<T> mirror = new BinaryTree<T>();
    	mirror.data = this.getData();
    	if (this == null) {
    		return null;
    	}
    	if (this.hasLeftChild()) {
    		mirror.rightChild = this.getLeftChild().espejo();
    	}
    	if (this.hasRightChild()) {
    		mirror.leftChild = this.getRightChild().espejo();
    	}
    	return mirror;
    }

     public BinaryTree<T> espejo(){
	BinaryTree<T> aux = this.getRightChild();
	this.addRightChild(this.getLeftChild());
	this.addLeftChild(aux);
	if (this.hasLeftChild()) this.rightChild().espejo();
	if (this.hasRightChild()) this.leftChild().espejo();
	return this;
     }
	

	public void entreNiveles(int n, int m){		
		//Inicializar cola de tipo arbol
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.add(this);
		cola.add(null);
		int nivel = 1;
		//Mientras la cola no esta vacia
		while (cola.isEmpty() && nivel <= m) {
			BinaryTree<T> aux = cola.dequeue();
			if (aux != null) {
				//Si no es null imprimo
				if (nivel >= n && nivel <= m) System.out.println(aux.getData());
				if (this.hasLeftChild()) cola.add(this.getLeftChild());
				if (this.hasRightChild()) cola.add(this.getRightChild());
			}
			else {
				nivel++;
				if (!cola.isEmpty()){
					cola.add(null);
				}	
			}
		}
		
	}











	
	
	/*public void entreNiveles(int n, int m){
		this.entreNivelesRecursivo(this,n,m);
    	}
	
    private void entreNivelesRecursivo(BinaryTree<T> arbol, int n, int m) {
    	// Obtener la altura del árbol
    	int altura = calcularAltura(arbol);
    	
    	// Verificar si los niveles dados son válidos
    	if (n < 0 || m > altura || n > m) {
            System.out.println("Niveles dados no validos");
            return;
        }
    	
    	Queue<BinaryTree<T>> cola = new LinkedList<>();
        cola.offer(arbol);
        
        int nivelActual = 0;

        while (!cola.isEmpty()) {
            int numNodosNivelActual = cola.size();
            nivelActual++;

            if (nivelActual >= n && nivelActual <= m) {
                // Si estamos dentro del rango de niveles, imprimir el nivel actual
                System.out.println("Nivel " + nivelActual + ":");
                for (int i = 0; i < numNodosNivelActual; i++) {
                    BinaryTree<T> nodo = cola.poll();
                    System.out.print(nodo.getData() + " ");

                    // Agregar los hijos del nodo actual a la cola para procesar en el siguiente nivel
                    if (nodo.hasLeftChild()) {
                        cola.offer(nodo.getLeftChild());
                    }
                    if (nodo.hasRightChild()) {
                        cola.offer(nodo.getRightChild());
                    }
                }
                System.out.println();// Imprimir nueva línea después de cada nivel
            } else {
            	 // Si no estamos dentro del rango de niveles, simplemente agregamos los hijos del nodo actual a la cola
                for (int i = 0; i < numNodosNivelActual; i++) {
                    BinaryTree<T> nodo = cola.poll();
                    if (nodo.hasLeftChild()) {
                        cola.offer(nodo.getLeftChild());
                    }
                    if (nodo.hasRightChild()) {
                        cola.offer(nodo.getRightChild());
                    }
                }
            }
        }
    }
    
    	public int calcularAltura(BinaryTree<T> arbol) {
        	if (arbol == null) {
            return 0;
        	}

        	int alturaIzquierda = calcularAltura(arbol.getLeftChild())+1;
        	int alturaDerecha = calcularAltura(arbol.getRightChild())+1;
	
	        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }*/
		
}

