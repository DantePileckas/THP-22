package actividad06;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calculadora = new Calculadora();
		
		//Sumas
		System.out.println(calculadora.sumar(50, 15));
		System.out.println(calculadora.sumar(50, 100));
		System.out.println(calculadora.sumar(50, 150));
		System.out.println(calculadora.sumar(50, 10));

		System.out.println("");
		
		//Restas
		System.out.println(calculadora.restar(50, 15));
		System.out.println(calculadora.restar(50, 25));
		System.out.println(calculadora.restar(50, 30));
		System.out.println(calculadora.restar(50, 51));
		
		System.out.println("");

		//Multiplciación
		System.out.println(calculadora.multiplicar(2, 2));
		System.out.println(calculadora.multiplicar(8, 7));
		System.out.println(calculadora.multiplicar(9, 9));
		System.out.println(calculadora.multiplicar(1, 15));
		
		System.out.println("");
		
		//División
		System.out.println(calculadora.dividir(0, 15));
		System.out.println(calculadora.dividir(5, 5));
		System.out.println(calculadora.dividir(50, 5));
		System.out.println(calculadora.dividir(30, 15));
		
	}

}
