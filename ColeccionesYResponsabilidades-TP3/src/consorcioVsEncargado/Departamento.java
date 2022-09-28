package consorcioVsEncargado;

public class Departamento {

	private int numeroDeUnidad;
	private String dni;
	private String nombre;
	private boolean voto;

	public Departamento(int numeroDeUnidad, String dni, String nombre, boolean voto) {
		super();
		this.numeroDeUnidad = numeroDeUnidad;
		this.dni = dni;
		this.nombre = nombre;
		this.voto = voto;
	}

	public int getNumeroDeUnidad() {
		return numeroDeUnidad;
	}

	public void setNumeroDeUnidad(int numeroDeUnidad) {
		this.numeroDeUnidad = numeroDeUnidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getVoto() {
		return voto;
	}

	public void setVoto(boolean voto) {
		this.voto = voto;
	}

	@Override
	public String toString() {
		return numeroDeUnidad + ", dni=" + dni + ", nombre=" + nombre + ", voto="
				+ voto;
	}
	
	
	
	
	
	
}
