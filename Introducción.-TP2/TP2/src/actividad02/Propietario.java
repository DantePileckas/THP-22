package actividad02;

public class Propietario {

	private String nombre;
	private String apellido;
	private Vehiculo vehiculo;
	
	//Constructor
	public Propietario(String nombre, String apellido, Vehiculo vehiculo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.vehiculo = vehiculo;
	}

	//Getters and setters
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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void encenderAuto() {
		if(getVehiculo().getEstaEncendido()==false) {
			getVehiculo().setEstaEncendido(true);
			System.out.println("Auto prendido.");
		} else {
			System.out.println("Ya se encuentra prendido.");
		}
	}
	
	public void acelerar(int velocidadIndicada) {
		System.out.println("Acelerando " +  velocidadIndicada);
	}
	
	public void desacelerar(int velocidadIndicada) {
		System.out.println("Desacelerando " + velocidadIndicada);
	}
	
	public void girar(Giro dir, int grados) {
		if(grados<=90) {
			System.out.println("Girando a dirección: " + dir + " con una cantidad de grados de: " + grados);
		} else {
			System.out.println("No podes girar, supera los 90 grados.");
		}
	}
	
	public void apagar() {
		if(getVehiculo().getEstaEncendido()==true) {
			getVehiculo().setEstaEncendido(false);
			System.out.println("Auto apagado.");
		} else {
			System.out.println("Ya se encuentra apagado.");
		}
	}
	
	
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
	
	
}
