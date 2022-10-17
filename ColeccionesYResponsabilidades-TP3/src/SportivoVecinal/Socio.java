package SportivoVecinal;

import java.util.ArrayList;

public class Socio {

	private String nombre;
	private int edad;
	private ArrayList<Socio> amigos;
	
	public Socio(String nombre, int edad) {
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

	public void agregarAmistad(Socio socio) {
		this.amigos.add(socio);
	}
	
	public void eliminarAmistad(Socio socio) {
		this.amigos.remove(socio);
	}
	
	public Socio buscarAmigo(String nombre) {
		Socio socio = null;
		int i = 0;

		while (i < amigos.size() && socio == null) {
			if (amigos.get(i).getNombre().equals(nombre)) {
				socio = amigos.get(i);
			} else {
				i++;
			}
	}
		return socio;
	}

	public double promedioAmigos() {
		double edadTotal = 0;
		double contador = 0;
		double promedio = 0;
		for (Socio s : amigos) {
			edadTotal += s.getEdad();
			contador++;
		}
		promedio = edadTotal/contador;
		return promedio;
	}
	
	public boolean tieneAmigos() {
		return this.amigos != null;
	}
	
	public void mostrarAmigos() {
		for (Socio socio : amigos) {
			System.out.println("[Amigo]" + socio.getNombre() + " " + socio.getEdad());
		}
	}
	
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + ", amigos=" + amigos + "]";
	}
	
	
	
	
}
