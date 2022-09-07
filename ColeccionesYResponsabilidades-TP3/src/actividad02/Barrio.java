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
	
	
	//métodos
	//mostrarPropiedad: Recibe un tipo de propiedad y muestra direcciones y precios
	
	public void mostrarPropiedades(Tipo tipo) {
		
		for (Propiedad propiedad : propiedades) {
			if(propiedad.getTipo().equals(tipo)) {
				System.out.println(propiedad.getDomicilio() + ", " + propiedad.getPrecio());
			}
		}
		
		
	}
	
	
	
	//buscarPropiedad
	
	
	
}
