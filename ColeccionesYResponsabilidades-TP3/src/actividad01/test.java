package actividad01;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agenda agenda = new Agenda();
				
		//En la primera opci�n se pudo. Pepe no existe pero, ya en la segunda opci�n, no se pudo debido a que se encuentra identificado.
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		
		//En la primera opci�n, est� escrito de forma incorrecta el dni. Ya, para la segunda opci�n, lo permite remover
		System.out.println(agenda.removerPersona("003456"));
		System.out.println(agenda.removerPersona("0303456"));

		
		//En la primera, devuelve un false. No se encuentra la persoan por el dni. Ya, en la segunda, se modific� con �xito.
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		System.out.println(agenda.modificarDomicilio("033456", "Rivadavia"));
		System.out.println(agenda.modificarDomicilio("0303456", "Rivadavia"));
		
		//Agrego personas y las listo.
		System.out.println(agenda.agregarPersona("0303456", "Pepe", "P�rez", "Av. Rivadavia"));
		System.out.println(agenda.agregarPersona("6540303", "Mar�a", "L�pez", "Av. Cabildo"));
		System.out.println(agenda.agregarPersona("7893211", "Jos�", "Mart�nez", "Av. Alcorta"));
		
		agenda.listarPersonas();
		
		//Mostrar el �ltimo.
		System.out.println(agenda.devovlerUlitmo());
		
		//Eliminar todos los elemenos
		agenda.eliminarElementos();
		
		agenda.listarPersonas();
		
	}

}
