package actividad03;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private Fecha fechaNac;
	private Domicilio domicilio;
	
	public Persona(String dni, String nombre, String apellido, Fecha fechaNac, Domicilio domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
				+ ", domicilio=" + domicilio + "]";
	}
	
	
	
	
}
