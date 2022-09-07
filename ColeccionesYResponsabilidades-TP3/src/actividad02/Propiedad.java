package actividad02;

public class Propiedad {

	private String domicilio;
	private int precio;
	private Tipo tipo;
	
	//Constructor
	public Propiedad(String domicilio, int precio, Tipo tipo) {
		super();
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}

	//Getters and setters
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.domicilio + "," + this.precio + "," + this.tipo;
				}
	
	
	
}
