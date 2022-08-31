package actividad09;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador contador = new Contador();
		Acumulador acumulador = new Acumulador();
		Promedio promedio = new Promedio();
		
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();
		contador.incrementar();

		System.out.println(contador.obtenerValor());
		
		acumulador.incrementar(20);
		acumulador.incrementar(20);
		acumulador.incrementar(20);
		acumulador.incrementar(20);
		acumulador.incrementar(20);

		System.out.println(acumulador.obtenerValor());
		
		promedio.incrementar(6);
		promedio.incrementar(6);
		promedio.incrementar(8);
		promedio.incrementar(10);
		promedio.incrementar(7);
		promedio.incrementar(4);
		promedio.incrementar(6);

		System.out.println(promedio.obtenerValor());
		
		promedio.incrementar(10);
		promedio.incrementar(10);
		promedio.incrementar(10);

		System.out.println(promedio.obtenerValor());

	}

}
