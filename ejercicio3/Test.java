package ejercicio3;

import ejercicio7.Estudiante;

public class Test {
	public static void main (String args[]) {
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];
		
		estudiantes[0] = new Estudiante("Juan","Perez","Mañana","juanperez@yahoo.com","7 y 70");
		estudiantes[1] = new Estudiante("Miguel","Paez","Tarde","miguelpaez@yahoo.com","2 y 50");
		profesores[0] = new Profesor("Pepe","Pasto","pepepasto@gmai.com","tarde","Economicas");
		profesores[1] = new Profesor("Mauricio","Gomez","maurigomez@gmail.com","tarde","Informatica");
		profesores[2] = new Profesor("Rodrigo","Nuñez","rodrinunez@gmail.com","tarde","Informatica");
	
		for(Profesor profe:profesores) {
			System.out.println(profe.tusDatos());
		}
		System.out.println();
		for (Estudiante alu:estudiantes) {
			System.out.println(alu.tusDatos());
		}
	}
	
}
