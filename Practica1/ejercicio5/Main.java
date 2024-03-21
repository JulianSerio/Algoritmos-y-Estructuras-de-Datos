package ejercicio5;

import java.util.LinkedList;

public class Main {
	public static void main (String args[]) {
		/*
		int[] v = {10,5,3,6,20};
		double[] res = Ejercicio5.operaciones1(v);
		System.out.println("Maximo: " +res[0]);
		System.out.println("Minimo: " +res[1]);
		System.out.println("Promedio: " +res[2]);*/
		
		/*LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(5);
		lista.add(3);
		lista.add(29);
		double[] res = Ejercicio5.operaciones2(lista);
		System.out.println("Maximo: " +res[0]);
		System.out.println("Minimo: " +res[1]);
		System.out.println("Promedio: " +res[2]); */
		
		int[] v = {10,5,3,6,20};
		Ejercicio5 ej = new Ejercicio5(v);
		ej.operaciones3();
	}
}
