package actividad01;

public class Persona {

	//atributos
	private String dni;
	private String nombre;
	private String apellido;
	private String domicilio;
	
	//constructor
	public Persona(String dni, String nombre, String apellido, String domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}

	//getters and setters
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ "]";
	}
	
	
	
	
	
	
	
}
