package SportivoVecinal;

import java.util.ArrayList;

public class Socio {

	private String nombre;
	private int edad;
	private ArrayList<Socio> amigos;
	
	public Socio(String nombre, int edad, ArrayList<Socio> amigos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.amigos = new ArrayList<Socio>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Socio> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Socio> amigos) {
		this.amigos = amigos;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + ", amigos=" + amigos + "]";
	}
	
	
	
	
}
