package actividad03;

public class Domicilio {

	private String calle;
	private int altura;
	private String barrio;
	
	public Domicilio(String calle, int altura, String barrio) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + "]";
	}
	
	
	
	
}
