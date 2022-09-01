package actividad09;

public class Acumulador {

	public int numero;
	
	public Acumulador() {
		super();
		this.numero = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void incrementar(int n) {
		numero += n;
		setNumero(numero);
	}
	
	public int obtenerValor() {
		return getNumero();
	}
	
}
