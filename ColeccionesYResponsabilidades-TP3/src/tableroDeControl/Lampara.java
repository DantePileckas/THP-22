package tableroDeControl;

public class Lampara {

	
	//atributos
	private int numero;
	private boolean prendida;
	private Sector sector;
	private Color color;
	
	//Constructor
	public Lampara(int numero, Sector sector, Color color) {
		super();
		this.sector = sector;
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isPrendida() {
		return prendida;
	}

	public void setPrendida(boolean prendida) {
		this.prendida = prendida;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void apagar() {
		if(estaPrendida()) {
			prendida = false;
		}
	}
	
	public void prender() {
		if (!estaPrendida()) {
			prendida = true;
		}
	}
	
	public boolean estaPrendida() {
		boolean estaPrendida = false;;
		if(prendida) {
			estaPrendida = true;
		}
		return estaPrendida;
	}
	
	
	
}
