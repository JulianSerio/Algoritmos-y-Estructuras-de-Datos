package ejercicio4;

public class SwapValores {
	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ; //tmp = 1
			x = y ; //x = 2
			y = tmp; // y = 1
		}
	}
	public static void swap2 (Integer x, Integer y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
}
