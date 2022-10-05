package tableroDeControl;

import java.util.ArrayList;

public class Tablero {

	private final int LUCES_MIN = 3;
	private final int LUCES_MAX = 20;
	private int cantidadMaxLuces;
	private ArrayList<Lampara> luces;
	private Telon telon;
	private ArrayList<HistoricoLuces> historicoLuces;
	
	
	public Tablero(int cantidadMaxLuces) {
		super();
		this.cantidadMaxLuces = cantidadMaxLuces;
		this.luces = new ArrayList<Lampara>();
		this.historicoLuces = new ArrayList<HistoricoLuces>();
		this.telon = telon;
		
	}
	
	public boolean subirTelon() {
		
	}
	
	public void apagarYCerrarTodo() {
		
	}
	
	
	
}
