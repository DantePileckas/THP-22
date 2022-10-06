package tableroDeControl;

public class HistoricoLuces {

	
	private int numero;
	private boolean prendida;
	private Sector sector;
	private Color color;
	
	public HistoricoLuces(Lampara lampara, Accion accion) {
		super();
		this.numero = lampara.getNumero();
		this.prendida = lampara.isPrendida();
		this.color = lampara.getColor();
		this.sector = lampara.getSector();
	}

	@Override
	public String toString() {
		return "HistoricoLuces [numero=" + numero + ", prendida=" + prendida + ", sector=" + sector + ", color=" + color
				+ "]";
	}
	
	
	
	
	
	
}
