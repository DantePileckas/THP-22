package actividad04;

public class Robot {

	private String nombre;
	
	public Robot() {
		super();
		this.nombre = "Robo";
	}

	public void saludar(){
		System.out.println("Hola, mi nombre es " + this.nombre + " ¿En qué puedo ayudarte?");
	}
	
	public void saludar(Persona p) {
		System.out.println("Hola, " + p.getNombre() + " " + p.getApellido() + 
							" .Mi nombre es " + this.nombre + " ¿En qué puedo ayudarte?");
	}
	
	
	
}
