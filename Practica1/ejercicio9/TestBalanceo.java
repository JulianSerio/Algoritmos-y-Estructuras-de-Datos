package ejercicio9;

import java.util.Scanner;
import java.util.Stack;

public class TestBalanceo {
	public static void main (String args[]) {
		//System.out.println("Ingrese cadena");
		//Scanner in = new Scanner(System.in);
		String cadena = "{()[()]}";		//in.toString();
		char[] arreglo = cadena.toCharArray();
		
		Stack<Character> pila = new Stack<>();
		
		boolean balanceado = false;
		
		for (char ch:arreglo) {
			if (ch == '{' | ch == '[' | ch == '(') { //Si corresponde con una abertura
				pila.push(ch);	//Pusheo char
			}
			else if (ch == '}' | ch == ']' | ch == ')') { //Si es un char de cierre
				if (!pila.isEmpty()) { //Verifico que la pila no este vecia
					char top = pila.pop();  //Popeo el primer elemento
					if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
						 balanceado = true; //Comparo
					 }
				}
			}	
		}
		System.out.println(balanceado);
	}

}
