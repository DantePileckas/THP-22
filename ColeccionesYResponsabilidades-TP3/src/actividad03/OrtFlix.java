package actividad03;

import java.util.ArrayList;

public class OrtFlix {

	
	private ArrayList<Cliente> clientes;
	private ArrayList<Cliente> clientesDeudores;
	private ArrayList<Pelicula> peliculas;
	
	public OrtFlix() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.clientesDeudores = new ArrayList<Cliente>();
		this.peliculas = new ArrayList<Pelicula>();
	}

	private Cliente buscarCliente(String dni) {
		Cliente cliente = null;
		int i = 0;

		while (i < clientes.size() && cliente == null) {
			if (clientes.get(i).getDni().equals(dni)) {
				cliente = clientes.get(i);
			} else {
				i++;
			}
		}
		return cliente;
	}
	
	private Pelicula buscarPelicula(String nombre) {
		Pelicula pelicula = null;
		int i = 0;

		while (i < peliculas.size() && pelicula == null) {
			if (peliculas.get(i).getNombre().equals(nombre)) {
				pelicula = peliculas.get(i);
			} else {
				i++;
			}
		}
		return pelicula;
	}
	
	public Respuesta verPelicula(String dni, String nombre) {
		
		Cliente cliente = buscarCliente(dni);
		Pelicula pelicula = buscarPelicula(nombre);
		Respuesta rta = Respuesta.OK;
		
		if(cliente!=null) {
			if(pelicula != null) {
				if(!cliente.esDeudor()) {
					if(!cliente.puedeVer(pelicula.getCategoria(),cliente.getCategoria())) {
						cliente.getHistoricoPelicula().agregarPeli(pelicula);
					} else {
						rta = Respuesta.CONTENIDO_NO_DISPONIBLE;
					}
				} else {
					rta = Respuesta.CLIENTE_DEUDOR;
				}
			} else {
				rta = Respuesta.CONTENIDO_INEX;
			}
		} else {
			rta = Respuesta.CLIENTE_INEX;
		}
		
		return rta;
		
	}
	
	public void darDeBaja(String dni) {
		Cliente cliente = buscarCliente(dni);
		
		if(cliente!=null) {
			clientes.remove(cliente);
				if(cliente.esDeudor()) {
					clientesDeudores.add(cliente);
				}
		}
		
	}
	
	public boolean ClienteListaNegra(String dni) {
		boolean esta = false;
		for (Cliente cliente : clientesDeudores) {
			if(cliente.getDni().equals(dni)) {
				esta = true; 
			} else {
				esta = false;
			}
		}
		return esta;
	}
	
	public RespuestaLogeo darDeAlta(String dni, Categoria categoria) {
		RespuestaLogeo rtaLogeo = RespuestaLogeo.ALTA_OK;
		Cliente cliente = buscarCliente(dni);
		
		if(cliente==null) {
			if(!ClienteListaNegra(dni)) {
				clientes.add(new Cliente(dni, "", 0.0, categoria));
			} else {
				rtaLogeo = RespuestaLogeo.CLIENTE_DEUDOR;
			}
		} else {
			rtaLogeo  = RespuestaLogeo.CLIENTE_EXISTENTE;
		}
		
		return rtaLogeo;
	}
	
}
