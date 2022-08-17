package actividad04;

public class Persona {

	private String numero;
	private String nombre;
	private String apellido;
	
	public Persona(String numero, String nombre, String apellido) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	@Override
	public String toString() {
		return "Persona [numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
}
