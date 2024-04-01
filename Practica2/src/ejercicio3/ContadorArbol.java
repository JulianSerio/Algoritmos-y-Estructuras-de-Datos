package ejercicio3;

import java.util.ArrayList;

import ejercicio1.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ArrayList<Integer> numerosParesInOrden(){
		ArrayList<Integer> aux = new ArrayList<Integer>();
		this.recorridoInOrden(this.arbol, aux);
		return aux;
	}
	
	public ArrayList<Integer> numerosParesPostOrden(){
		ArrayList<Integer> aux = new ArrayList<Integer>();
		this.recorridoPostOrden(this.arbol, aux);
		return aux;
	}
	
	public void recorridoPostOrden(BinaryTree<Integer> arbol, ArrayList<Integer> lista) {
		if (arbol != null) {
			recorridoInOrden(arbol.getLeftChild(),lista);
			recorridoInOrden(arbol.getRightChild(),lista);
			if (arbol.getData() % 2 == 0) {
				lista.add(arbol.getData());
			}
		}
	}


	public void recorridoInOrden(BinaryTree<Integer> arbol, ArrayList<Integer> lista) {
		if (arbol != null) {
			recorridoInOrden(arbol.getLeftChild(),lista);
			if (arbol.getData() % 2 == 0) {
				lista.add(arbol.getData());
			}
			recorridoInOrden(arbol.getRightChild() ,lista);
		}
	}
	
}
