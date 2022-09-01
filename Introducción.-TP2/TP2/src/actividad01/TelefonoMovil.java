package actividad01;

public class TelefonoMovil {

	private String marca;
	private boolean estaEncendido;
	

	public TelefonoMovil(String marca, boolean estaEncendido) {
		super();
		this.marca = marca;
		this.estaEncendido = estaEncendido;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean getEstaEncendido() {
		return estaEncendido;
	}
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	
	
	public void prender() {
		if(this.estaEncendido==false) {
			setEstaEncendido(true);
		}
	}
	
	public void apagar() {
		if(this.estaEncendido==true) {
			setEstaEncendido(false);
		}
	}
	
	public void llamar(String num) {
		System.out.println("llamando al número " + num);
	}
	
	@Override
	public String toString() {
		return "TelefonoMovil [marca=" + marca + ", estaEncendido=" + estaEncendido + "]";
	}
	
	
	
	
}
