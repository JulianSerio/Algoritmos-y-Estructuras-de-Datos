package ejercicio2;

public class Ejercicio2 {
	public static int[] arregloMultiplos(int n) {
		int[] v = new int[n]; 
		for (int i = 0; i < n; i++) {
			v[i] = (i + 1) * n;
			System.out.println(v[i]);
		}
		return v;
 	}

}
