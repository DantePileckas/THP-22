package actividad01;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agenda agenda = new Agenda();
				
		//En la primera opci�n se pudo. Pepe no existe pero, ya en la segunda opci�n, no se pudo debido a que se encuentra identificado.
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		
		
		
		
	}

}
