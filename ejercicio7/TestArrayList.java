package ejercicio7;


public class TestArrayList {	
	public static void main (String args[]) {
		/*ArrayList<Integer> lista = new ArrayList<Integer>(); a)
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		for (Integer elem:lista) {
			System.out.println(elem);
		}
		
		LinkedList<Integer> lista = new LinkedList<Integer>(); b)
		lista.add(10);
		lista.add(20);
		lista.add(30);
		for (Integer elem:lista) {
			System.out.println(elem);
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}*/
		
		//d)
		Estudiante e1 = new Estudiante("Juan","Perez","Mañana","juanperez@yahoo.com","7 y 70");
		Estudiante e2 = new Estudiante("Miguel","Paez","Tarde","miguelpaez@yahoo.com","2 y 50");
		Estudiante e3 = new Estudiante("Pepe","Argento","Mañana","peparg@gmail.com","7 y 50");
		Ejercicio7 clase = new Ejercicio7();
		clase.cargarLista(e1);
		clase.cargarLista(e2);
		clase.cargarLista(e3);
		
		
		System.out.println(clase.imprimirLista(clase.getLista()));
		System.out.println();
		
		clase.modificarAlgunDato();
		
		System.out.println(clase.imprimirLista(clase.getLista()));
		System.out.println();		
	}

}
