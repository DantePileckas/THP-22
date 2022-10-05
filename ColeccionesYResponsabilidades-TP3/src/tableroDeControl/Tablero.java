package tableroDeControl;

import java.util.ArrayList;
import java.util.Iterator;

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
		boolean pudoSubir = false;
		if(!telon.isAbierto() && luces.size()>=LUCES_MIN) {
			pudoSubir = true;
			telon.setAbierto(pudoSubir);
		}
		
		return pudoSubir;
	}
	
	private void apagarLuces() {
		for (Lampara l : luces) {
			l.apagar();
		}
	}

	private void bajarTelon() {
		if(telon.isAbierto()) {
			telon.setAbierto(false);
		}
	}
	
	private Lampara buscarLuz(int numero) {
		Lampara luz = null;
		int i = 0;

		while (i < luces.size() && luz == null) {
			if (luces.get(i).getNumero()==(numero)) {
				luz = luces.get(i);
			} else {
				i++;
			}
		}
		return luz;
	}
	
	public boolean prenderLuz(int numero) {
		Lampara luz = buscarLuz(numero);
		boolean pudoPrender = false;
		if(luz!=null && !luz.estaPrendida()) {
			luz.prender();
			pudoPrender = true;
		}
		
		return pudoPrender;
		
	}
	
	public void prenderLuces(Sector sector) {
		for (Lampara l : luces) {
			if(l.getSector()==sector && !l.isPrendida()) {
				prenderLuz(l.getNumero());
			}
		}
	}
	  	
	public void apagarYCerrarTodo() {
		apagarLuces();
		bajarTelon();
		
	}
	
	public void agregarLampara() {
		
	}
	
}
