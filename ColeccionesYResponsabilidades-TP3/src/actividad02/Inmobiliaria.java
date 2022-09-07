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
		int contadorMax = 0;
		
		for (Barrio barrio : barrios) {
			if(barrio.getPropiedades().size()>contadorMax) {
				barrioMax = barrio;
				contadorMax=barrio.getPropiedades().size();
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
				if(propiedad==null) {
				propiedad = barrio.buscarPropiedad(domicilio);
				barrioCorrespondiente = barrio;
				}
			}
		
		if(propiedad!=null) {
			barrioCorrespondiente.eliminarProp(propiedad);
		} else {
			System.out.println("Propiedad no encontrada");
		}
		
	}
	
	
	
	//CambiarPropiedad
	public void cambiarPropiedad(String domicilio, Barrio barrio) {
		Propiedad propRemover; 
		
		for (Barrio b : barrios) {
			propRemover = b.buscarPropiedad(domicilio);
			if(propRemover!=null) {
				b.eliminarProp(propRemover);
				barrio.addProp(propRemover);
			}
		}
		
		
	}
	
	
	
}
