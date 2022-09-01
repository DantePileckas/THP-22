package actividad09;

public class Contador {

	public int numero;
	
	public Contador() {
		super();
		this.numero = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void incrementar() {
		numero += 1;
		setNumero(numero);
	}
	
	public int obtenerValor() {
		return getNumero();
	}
	
	
	
}
