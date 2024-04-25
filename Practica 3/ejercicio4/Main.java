package ejercicio4;

import ejercicio1.GeneralTree;

public class Main {
    public static void main(String[] args) {
        // Creamos el árbol de ejemplo
        GeneralTree<AreaEmpresa> nodoA = new GeneralTree<>(new AreaEmpresa("A", 10));
        GeneralTree<AreaEmpresa> nodoB = new GeneralTree<>(new AreaEmpresa("B", 10));
        GeneralTree<AreaEmpresa> nodoC = new GeneralTree<>(new AreaEmpresa("C", 12));
        GeneralTree<AreaEmpresa> nodoD = new GeneralTree<>(new AreaEmpresa("D", 15));
        GeneralTree<AreaEmpresa> nodoE = new GeneralTree<>(new AreaEmpresa("E", 9));
        GeneralTree<AreaEmpresa> nodoF = new GeneralTree<>(new AreaEmpresa("F", 11));
        GeneralTree<AreaEmpresa> nodoG = new GeneralTree<>(new AreaEmpresa("G", 8));
        GeneralTree<AreaEmpresa> nodoH = new GeneralTree<>(new AreaEmpresa("H", 16));
        GeneralTree<AreaEmpresa> nodoI = new GeneralTree<>(new AreaEmpresa("I", 7));
        GeneralTree<AreaEmpresa> nodoJ = new GeneralTree<>(new AreaEmpresa("J", 17));
        GeneralTree<AreaEmpresa> nodoK = new GeneralTree<>(new AreaEmpresa("K", 13));

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

     

        AnalizadorArbol analizador = new AnalizadorArbol();
        double maxPromedio = analizador.devolverMaximoPromedio(nodoA);

        System.out.println("El mayor promedio encontrado es: " + maxPromedio);
    }

}
