package ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
	private ArrayList<Estudiante> lista;
	
	public Ejercicio7() {
		lista = new ArrayList<Estudiante>();
	}
	
	public void cargarLista(Estudiante e) {
		
		if (!lista.contains(e)) {
			lista.add(e);
		}
	}
	
	public void copiarLista(ArrayList<Estudiante> lista) {
		this.lista = lista;
	}
	
	public String imprimirLista(ArrayList<Estudiante> lista) {
		String aux = "";
		for (Estudiante e:lista) {
			aux = aux + " " + e.tusDatos() + '\n';
		}
		return aux;
	}
	
	public void modificarAlgunDato() {
		for (Estudiante e:lista) {
			e.setApellido("SERIO");
		}

	}

	public ArrayList<Estudiante> getLista() {
		return lista;
	}
	
	
}
