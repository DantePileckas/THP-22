package actividad05;

public class Turnera {

	private int valor;


	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int otorgarProximoTurno() {
		setValor(valor+1);
		return getValor();
	}

	public void verUltimoNumeroOtorgado() {
		System.out.println("Último valor otorgado: " + getValor());
	}
	
	public void resetarContador() {
		setValor(0);
	}
	
	public void resetearConador(int valor) {
		if(valor>=0) {
			setValor(valor);
		}
	}
	
	@Override
	public String toString() {
		return "Turnera [valor=" + valor + "]";
	}
	
	
	
}
