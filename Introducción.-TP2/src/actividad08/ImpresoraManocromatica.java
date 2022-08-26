package actividad08;

import java.util.Iterator;

public class ImpresoraManocromatica {

	private boolean estaEncendida;
	private int cantHojas;
	private int nivelTinta;
	private final int MAX_HOJA = 20;
	private final int LIMITE_HOJA = 35;
	private final int MAX_TINTA = 50;
	

	
	public ImpresoraManocromatica() {
		super();
		this.estaEncendida = false;
		this.cantHojas = 0;
		this.nivelTinta = 100;
	}


	public boolean isEstaEncendida() {
		return estaEncendida;
	}


	public void setEstaEncendida(boolean estaEncendida) {
		this.estaEncendida = estaEncendida;
	}


	public int getCantHojas() {
		return cantHojas;
	}


	public void setCantHojas(int cantHojas) {
		this.cantHojas = cantHojas;
	}


	public int getNivelTinta() {
		return nivelTinta;
	}


	public void setNivelTinta(int nivelTinta) {
		this.nivelTinta = nivelTinta;
	}

	
	public void imprimir(Documento doc) {
		 int nivelRequerido = nivelSegunCantCaracteres(doc.getTexto().length());
		 int hojasRequeridas = cantHojasSegunCaracteres(doc.getTexto().length());		
		if (estaEncendida) {
			if(this.nivelTinta>=nivelRequerido && this.cantHojas>=hojasRequeridas) {
				System.out.println(doc.getFecha() + "      "  + doc.getTitulo());
				System.out.println(doc.getTexto());
				setCantHojas(cantHojas - hojasRequeridas);
				setNivelTinta(nivelTinta - nivelRequerido); 
			} else {
				System.out.println("Ojo, sin papel o sin nivel. Asegurate de que esté todo en orden");
			}
		} else {
			System.out.println("Máquina Apagada");
		}
	}
	
	public int nivelSegunCantCaracteres(int caracteres) {
		int nivelNecesitado=0;
		
		while(caracteres>=MAX_TINTA) {
			nivelNecesitado++;
			 caracteres = caracteres - MAX_TINTA;
		}
		
		return nivelNecesitado;

	}

	public int cantHojasSegunCaracteres(int caracteres) {
		int nivelNecesitado=0;
		
		while(caracteres>=MAX_HOJA) {
			nivelNecesitado++;
			 caracteres = caracteres - MAX_HOJA;
		}
		
		return nivelNecesitado;

	}
	
	
	public void recargarHojas(int hojas) {
		if(hojas<=LIMITE_HOJA) {
			setCantHojas(hojas);
		} else {
			System.out.println("No debe superar el límite");
		}
		
	}
	
	public void encenderImpresora() {
		if(estaEncendida==false) {
			setEstaEncendida(true);
		} else {
			System.out.println("La máquina ya está encendida");
		}
		
	}
	
	public void apagarImpresora() {
		if(estaEncendida==false) {
			System.out.println("La máquina ya se encuentra apagada");
		} else {
			setEstaEncendida(false);
		}
		
	}

	@Override
	public String toString() {
		return "ImpresoraManocromatica [estaEncendida=" + estaEncendida + ", cantHojas=" + cantHojas + ", nivelTinta="
				+ nivelTinta + "]";
	}
	
	
	
	
	
	
	
}
