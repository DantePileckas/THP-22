package tableroDeControl;

public class Telon {

	private boolean abierto;
	
	public Telon() {
		this.abierto = false;
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
		if (abierto) {
			estaAbierto=true;
		}
		return estaAbierto;
	}

	public boolean getAbierto() {
		return this.abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	
	
	
}
