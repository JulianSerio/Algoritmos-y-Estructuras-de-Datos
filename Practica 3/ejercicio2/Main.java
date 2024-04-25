package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import ejercicio1.GeneralTree;

public class Main {
	public static void main (String args[]) {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>();
		GeneralTree<Integer> a2 = new GeneralTree<Integer>();
		GeneralTree<Integer> a3 = new GeneralTree<Integer>();
		GeneralTree<Integer> a4 = new GeneralTree<Integer>();
		GeneralTree<Integer> a5 = new GeneralTree<Integer>();
		RecorridosAG r = new RecorridosAG();
		
		a1.setData(1);
		a2.setData(2);
		a3.setData(3);
		a4.setData(4);
		a5.setData(5);
		
		a1.addChild(a2);
		a1.addChild(a3);
		
		a2.addChild(a4);
		
		a3.addChild(a5);
		
		List<Integer> nums = new ArrayList<Integer>(); 
		//nums = r.numerosImparesMayoresQuePreOrden(a1, 1);
		//nums = r.numerosImparesMayoresQuePostOrden(a1, 1);
		nums = r.numerosImparesMayoresQuePorNiveles(a1, 1);
		for(int num : nums) {
			System.out.println(num);
		}
	}

}
