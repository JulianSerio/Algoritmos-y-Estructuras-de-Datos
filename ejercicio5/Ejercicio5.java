package ejercicio5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Ejercicio5 {
	private static int[] arreglo;
	
	public Ejercicio5(int[] arreglo) {
		this.arreglo = arreglo;
	}

	public static double[] operaciones1 (int[] v) {
		double[] res = new double[3];
		int min = 999;
		int max = 0; 
		int acum = 0;
		for (int i = 0; i < v.length; i++){
			if (v[i] > max) { //SACO MAX
				max = v[i];
			}
			if (v[i] < min) { //SACO MIN
				min = v[i];
			}
			acum += v[i]; 
		}
		res[0] = max;
		res[1] = min;
		res[2] = acum / v.length; //SACO PROM 
		return res;
	}
	
	public static double[] operaciones2 (LinkedList<Integer> valores) {
		/*String[] division = cadena.split(" "); 
		int[] v = new int[division.length];
		for (int i = 0; i < division.length; i++) {
			v[i] = Integer.parseInt(division[i]);
		}*/
		double[] res = new double[3];
		int min = 999;
		int max = 0; 
		int acum = 0;
		for (int val:valores) {
			if (val > max) {
				max = val;
			}
			if (val < min) {
				min = val;
			}
			acum+= val;
		}
		res[0] = max;
		res[1] = min;
		res[2] = acum / valores.size();
		return res;
	}
	
	public static void operaciones3() {
        int min = 9999;
        int max = 0;
        int acum = 0;
        
        for (int val : arreglo) {
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
            acum += val;
        }
        
        double promedio = (double) acum / arreglo.length;
        
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }

}
