package actividad09;

public class Promedio {

	private Contador contador;
	private Acumulador acumulador;

	public Promedio() {
		super();
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}

	public Acumulador getAcumulador() {
		return acumulador;
	}

	public void setAcumulador(Acumulador acumulador) {
		this.acumulador = acumulador;
	}

	public void incrementar(int nota) {
		contador.incrementar();
		acumulador.incrementar(nota);
	}
	
	public int obtenerValor() {
		int promedio = 0;
		if(acumulador.obtenerValor()!=0) {
			promedio = acumulador.obtenerValor()/contador.obtenerValor();
		} 
		
		
		return promedio;
	}
	
}
