package actividad03;

public class Cliente {

	private String dni;
	private String nombre;
	private double saldoAPagar;
	private HistoricoPelicula historicoPelicula;
	private Categoria categoria;
	
	public Cliente(String dni, String nombre, double saldoAPagar, Categoria categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldoAPagar = saldoAPagar;
		this.categoria = categoria;
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

	public double getSaldoAPagar() {
		return saldoAPagar;
	}

	public void setSaldoAPagar(double saldoAPagar) {
		this.saldoAPagar = saldoAPagar;
	}

	public HistoricoPelicula getHistoricoPelicula() {
		return historicoPelicula;
	}

	public void setHistoricoPelicula(HistoricoPelicula historicoPelicula) {
		this.historicoPelicula = historicoPelicula;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public boolean esDeudor() {
		boolean tieneDeuda = false;
		if(getSaldoAPagar()>0) {
			tieneDeuda=true;
		}
		return tieneDeuda;
	}
	
	public boolean puedeVer(Categoria categoriaPeli, Categoria categoriaCli) {
		boolean puedeVer = false;
		categoriaCli = getCategoria();
		if(categoriaCli.equals(categoriaPeli)) {
			puedeVer = true;
		}
		return puedeVer;
	}
	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", saldoAPagar=" + saldoAPagar + ", historicoPelicula="
				+ historicoPelicula + "]";
	}
	
	
	
}
