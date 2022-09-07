package actividad02;

import java.util.ArrayList;

public class Inmobiliaria {

	private ArrayList<Barrio> barrios;

	public Inmobiliaria() {
		super();
		this.barrios = new ArrayList<Barrio>();
	}
	
	
	public void addBarrio(Barrio barrio) {
		this.barrios.add(barrio);
	}
	
	
	//métodos
	//mostrarPropiedades.
	public void mostrarPropiedades() {
		for (Barrio barrio : barrios) {
			barrio.mostrarPropiedades();
		}
	}
	
	
	//obtenerBarrioMaxProm
	public ArrayList<Barrio> obtenerBarrioMaxProp(){
		ArrayList<Barrio> barriosDevolver = new ArrayList<Barrio>();
		Barrio barrioMax = null;
		
		for (Barrio barrio : barrios) {
			if(barrio.getPropiedades().size()>barrioMax.getPropiedades().size()) {
				barrioMax = barrio;
			}
				
		}
		
		barriosDevolver.add(barrioMax);
		
		return barriosDevolver;
	}
	
	
	//BorrarPropiedad
	public void borrarPropiedad(String domicilio) {
		Propiedad propiedad = null;
		Barrio barrioCorrespondiente = null;
		
		for (Barrio barrio : barrios) {
			propiedad = barrio.buscarPropiedad(domicilio);
			barrioCorrespondiente = barrio;
		}
		
		if(propiedad!=null) {
			barrioCorrespondiente.eliminarProp(propiedad);
		} else {
			System.out.println("Propiedad no encontrada");
		}
		
	}
	
	
	
	//CambiarPropiedad
	
	
	
	
}
