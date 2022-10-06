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
		if(cantidadMaxLuces<LUCES_MIN) {
			this.cantidadMaxLuces = LUCES_MIN;
		} else if(cantidadMaxLuces>LUCES_MAX) {
			this.cantidadMaxLuces=LUCES_MAX;
		} else {
			this.cantidadMaxLuces = cantidadMaxLuces;
		}
		this.luces = new ArrayList<Lampara>();
		this.historicoLuces = new ArrayList<HistoricoLuces>();
		this.telon = new Telon();
		
	}
	
	public boolean subirTelon() {
		boolean pudoSubir = false;
		if(!telon.getAbierto() && luces.size()>=LUCES_MIN) {
			pudoSubir = true;
			telon.setAbierto(pudoSubir);
			System.out.println("Telón, Arriba");
		} else {
			System.out.println("El telón ya está subido!");
		}
		
		return pudoSubir;
	}
	
	private void apagarLuces() {
		for (Lampara l : luces) {
			l.apagar();
		}
	}

	private void bajarTelon() {
		if(telon.getAbierto()) {
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
			System.out.println("La luz: " + luz.getNumero() + " se Pudo Prender");
		} else {
			System.out.println("¡¡No se pudo prender!!");
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
	
	public void agregarLampara(int numero, Sector sector, Color color) {
		
		if(this.luces.size()<=LUCES_MAX) {
			this.luces.add(new Lampara(numero, sector, color));
			System.out.println("Lámpara Agregada");
		} else {
			System.out.println("Excede. ¡Ojo!");
		}
		
	}
	
	public void mostrarOperatividad() {
		double porcentaje = this.luces.size()*100/cantidadMaxLuces;
		System.out.println(porcentaje + "%");
	}
	
	
	
}
