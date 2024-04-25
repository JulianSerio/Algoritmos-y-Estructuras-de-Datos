package ejercicio5;

import ejercicio1.GeneralTree;
import ejercicio4.AnalizadorArbol;
import ejercicio4.AreaEmpresa;

public class Main {
	public static void main(String[] args) {
        // Creamos el árbol de ejemplo
        GeneralTree<Integer> nodoA = new GeneralTree(20);
        GeneralTree<Integer> nodoB = new GeneralTree(10);
        GeneralTree<Integer> nodoC = new GeneralTree(12);
        GeneralTree<Integer> nodoD = new GeneralTree(15);
        GeneralTree<Integer> nodoE = new GeneralTree(9);
        GeneralTree<Integer> nodoF = new GeneralTree(11);
        GeneralTree<Integer> nodoG = new GeneralTree(8);
        GeneralTree<Integer> nodoH = new GeneralTree(16);
        GeneralTree<Integer> nodoI = new GeneralTree(7);
        GeneralTree<Integer> nodoJ = new GeneralTree(17);
        GeneralTree<Integer> nodoK = new GeneralTree(13);

        nodoA.addChild(nodoB);
        nodoA.addChild(nodoC);
        nodoB.addChild(nodoD);
        nodoB.addChild(nodoE);
        nodoC.addChild(nodoF);
        nodoC.addChild(nodoG);
        nodoD.addChild(nodoH);
        nodoD.addChild(nodoI);
        nodoE.addChild(nodoJ);
        nodoE.addChild(nodoK);
        
        System.out.println(nodoA.esAncestro(9,13));

     

    }
	

}
