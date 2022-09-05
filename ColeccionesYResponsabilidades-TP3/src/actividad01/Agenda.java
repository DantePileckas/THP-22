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
	
	
	//Remover persona a mi lista
	public Persona removerPersona(String dni) {
		Persona persona = buscarPersona(dni);
			
				if(persona!=null) {
					personas.remove(persona);				
				} 
				
				return persona;
				
	}
	
	//Modificar Domicilio. 
	public boolean modificarDomicilio(String dni, String domicilio) {
	boolean sePudo = false;
	Persona persona = buscarPersona(dni);
	
		if(persona != null) {
			persona.setDomicilio(domicilio);
			sePudo = true;
		} 
	
		return sePudo;
	}

	//Listar por pantalla a cada persona
	public void listarPersonas() {
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
	}
	
	//Devolver el último
	public Persona devovlerUlitmo() {
		int i = 0;
		Persona persona = null;
		
		for (Persona p : personas) {
			persona = p;
		}
	
		return persona;
		
	}

	//Eliminar todos los elementos sin utilizar el clear
	public void eliminarElementos() {
		int i = 0;
		
		while(personas.size()>0) {
			personas.remove(i);
		}
		
	}
	
	
	
}