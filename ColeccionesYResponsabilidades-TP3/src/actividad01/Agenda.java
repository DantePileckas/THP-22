package actividad01;

import java.util.ArrayList;

public class Agenda {

	//Atributo
	private ArrayList<Persona> personas;

	//Constructor
	public Agenda() {
		super();
		this.personas = new ArrayList<Persona>();
	}
	
	//Búsqueda en arraysList
	private Persona buscarPersona(String dni) {
		Persona persona = null;
		int i = 0;

		while (i < personas.size() && persona == null) {
			if (personas.get(i).getDni().equals(dni)) {
				persona = personas.get(i);
			} else {
				i++;
			}
		}
	
		return persona;
}


	//Agregar persona a mi lista.
	public boolean agregarPersona(String dni, String nombre, String apellido, String domicilio) {
		boolean sePudoAgregar = false;
		Persona persona = buscarPersona(dni);
		if(persona == null) {
			persona = new Persona(dni, nombre, apellido, domicilio);
			personas.add(persona);
			sePudoAgregar = true;
		}
		
		return sePudoAgregar;
		
	}
	
	

}