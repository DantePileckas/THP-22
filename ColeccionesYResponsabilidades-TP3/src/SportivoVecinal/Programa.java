package SportivoVecinal;

import java.util.ArrayList;

public class Programa {

	private ArrayList<Socio> socios;

	public Programa() {
		this.socios = new ArrayList<Socio>();
	}
	
	private Socio buscarSocio(String nombre) {
		Socio socio = null;
		int i = 0;

		while (i < socios.size() && socio == null) {
			if (socios.get(i).getNombre().equals(nombre)) {
				socio = socios.get(i);
			} else {
				i++;
			}
	}
		return socio;
	}
	
	public Resultado agregarSocio(String nombre, int edad) {
		Resultado result = Resultado.YA_EXISTE;
		if(buscarSocio(nombre)==null) {
			socios.add(new Socio(nombre, edad));
			result = Resultado.OK;
		}
				
		return result;		
	}
	
	public Resultado establecerAmistad(String nombre1, String nombre2) {
		Resultado r = Resultado.OK;
		Socio socio1 = buscarSocio(nombre1);
		Socio socio2 = buscarSocio(nombre2);
	
		if(socio1!=null && socio2!=null) {
			if(!(nombre1.equals(nombre2))) {
				if(!SonAmigos(socio1, socio2)) {
					socio1.agregarAmistad(socio2);
					socio2.agregarAmistad(socio1);
				} else {
					r = Resultado.YA_SON_AMIGOS;
				}
			} else {
				r = Resultado.NOMBRES_IGUALES;
			}
		} else {
			r = Resultado.NO_EXISTE;
		}
		
		return r;
	}
	
	private boolean SonAmigos(Socio s1, Socio s2) {
		boolean sonAmigos= true;
		Socio socio = s1.buscarAmigo(s2.getNombre());
		if(socio==null) {
			sonAmigos=false;
		}
		return sonAmigos;
	}
	
	public Resultado deshacerAmistad(String nombre1, String nombre2) {
		Resultado r = Resultado.OK;
		Socio socio1 = buscarSocio(nombre1);
		Socio socio2 = buscarSocio(nombre2);
	
		if(socio1!=null && socio2!=null) {
			if(!(nombre1.equals(nombre2))) {
				if(SonAmigos(socio1, socio2)) {
					socio1.eliminarAmistad(socio2);
					socio2.eliminarAmistad(socio1);
				}
			} else {
				r = Resultado.NOMBRES_IGUALES;
			}
		} else {
			r = Resultado.NO_EXISTE;
		}
		
		return r;
	}

	public void promedioEdades() {
		for (Socio socio : socios) {
			if(socio.tieneAmigos()) {
				System.out.println(socio.getNombre() + " " +socio.promedioAmigos());
			} else {
				System.out.println(socio.getNombre() + " no tiene amigos");
			}
		}
	}

	public void devolverAmigos(String nombre) {
		Socio socio = buscarSocio(nombre);
		if(socio!=null) {
			socio.mostrarAmigos();
		} else {
			System.out.println(nombre + " No existe");
		}
	}




}
