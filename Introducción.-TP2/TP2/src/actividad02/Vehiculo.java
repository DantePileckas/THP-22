package actividad02;

public class Vehiculo {

	//Atributos
	private String marca;
	private String color;
	private String modelo;
	private boolean estaEncendido = false;
	private int velocidadMax;
	
	//Constructor
	public Vehiculo(String marca, String color, int velocidadMax) {
		super();
		this.marca = marca;
		this.color = color;
		this.velocidadMax = velocidadMax;
	}

	//Getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public boolean getEstaEncendido() {
		return estaEncendido;
	}

	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}

	
	
	
	//ToString
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velocidadMax=" + velocidadMax
				+ "]";
	}
	
	
	
	
	
}
