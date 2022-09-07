package actividad02;

import java.util.ArrayList;

public class Barrio {

	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	//Constructor
	public Barrio(String nombre) {
		super();
		this.nombre = nombre;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public void addProp(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void eliminarProp(Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}
	
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

	
	
	//métodos
	//mostrarPropiedad: Recibe un tipo de propiedad y muestra direcciones y precios
	
	
	public void mostrarPropiedades(Tipo tipo) {
		
		for (Propiedad propiedad : propiedades) {
			if(propiedad.getTipo().equals(tipo)) {
				System.out.println(propiedad.getDomicilio() + ", " + propiedad.getPrecio());
			}
		}
		
	}
	
	public void mostrarPropiedades() {
		for (Propiedad propiedad : propiedades) {
				System.out.println(propiedad.getDomicilio() + ", " + propiedad.getPrecio());
		}
	
	}

	
	//buscarPropiedad
	public Propiedad buscarPropiedad(String domicilio) {
		Propiedad propiedad = null;
		int i = 0;

		while (i < propiedades.size() && propiedad == null) {
			if (propiedades.get(i).getDomicilio().equals(domicilio)) {
				propiedad = propiedades.get(i);
			} else {
				i++;
			}
		}
	
	return propiedad;
	}
	
	
	
}
