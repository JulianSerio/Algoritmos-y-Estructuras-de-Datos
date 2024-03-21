package ejercicio2;

import java.util.Scanner;

public class main {
	public static void main (String args[]) {	
		System.out.println("Ingrese un numero: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]v = Ejercicio2.arregloMultiplos(n);
	}

}
