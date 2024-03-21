package ejercicio1;

public class Ejercicio1 {
	
	public static void recorridoA (int a, int b) {
		if (a > b) {
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		}
		else 
			for (int i = a; i <= b; i++) {
				System.out.println(i);
		}
	}
	
	public static void recorridoB (int a, int b) {
		if (a < b){
			while (a <= b) {
				System.out.println(a);
				a++;
			}
		}
		else {
			while (a >= b) {
				System.out.println(a);
				a--;
			}
		}
	}
	
	public static void recorridoC (int a, int b) {
		if (a == b) {
			System.out.println(a);
		}
		else if (a < b) {
			System.out.println(a);
			recorridoC(a + 1,b);
		}
		else {
			System.out.println(a);
			recorridoC(a - 1,b);
		}

	}
	
	

}
