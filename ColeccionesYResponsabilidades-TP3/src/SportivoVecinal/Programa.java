package SportivoVecinal;

import java.util.ArrayList;

public class Programa {

	private ArrayList<Socio> socios;

	public Programa() {
		super();
		this.socios = new ArrayList<Socio>();
	}
	
	private Socio buscarSocio(String nombre) {
		Socio socio = null;
		int i = 0;

		while (i < socios.size() && socio.equals(null)) {
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
		Socio socio = buscarSocio(nombre);		
		if(socio.equals(null)) {
			result = Resultado.OK;
		}
				
		return result;		
	}
	
	
}
