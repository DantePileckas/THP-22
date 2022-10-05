package tableroDeControl;

public class Telon {

	private boolean abierto;
	
	public Telon() {
		if (!estaAbierto()) {
			this.abierto = false;
		}
		
	}
	
	public boolean subir() {
		if(!estaAbierto()) {
			this.abierto = true;
		}
		return abierto;
	}
	
	public boolean bajar() {
		if(estaAbierto()) {
			this.abierto = false;
		}
		return abierto;
	}
	
	public boolean estaAbierto() {
		boolean estaAbierto = false;
		if (this.abierto) {
			estaAbierto=true;
		}
		return estaAbierto;
	}
	
}
