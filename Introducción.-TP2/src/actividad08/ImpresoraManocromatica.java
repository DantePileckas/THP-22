package actividad08;

import java.util.Iterator;

public class ImpresoraManocromatica {

	private boolean estaEncendida;
	private int cantHojas;
	private int nivelTinta;
	
	
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
		
		
		
		
		
	}
	
	public int nivelSegunCantCaracteres(int caracteres) {
		int nivelNecesitado=0;
		
		while(caracteres>=50) {
			nivelNecesitado++;
			 caracteres = caracteres - 50;
		}
		
		return nivelNecesitado;

	}
	
	public void recargarHojas(int hojas) {
		if(hojas<=35) {
			setCantHojas(hojas);
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
			System.out.println("La máquina ya se encuentra aoagada");
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
