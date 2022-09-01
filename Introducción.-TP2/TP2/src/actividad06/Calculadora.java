package actividad06;

public class Calculadora {

	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public int dividir(int a, int b) {
		int resultado;
		if(a==0) {
			resultado=0;
		} else {
			resultado = a/b;
		}
		return resultado;
	}
	
	
}
