package actividad02;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intancias de objetos.
		Vehiculo vehiculo = new Vehiculo("Giat", "Gris", 180);
		Propietario propietario = new Propietario("Fulano", "Gómez", vehiculo);
	
		//El propietario enciende el auto.
		propietario.encenderAuto();
		propietario.encenderAuto();
	
		//El propietario acelera
		propietario.acelerar(150);
		
		//El propietario desacelera
		propietario.desacelerar(45);
		
		//El Propietario gira a su derecha
		propietario.girar(Giro.DERECHA, 50);
		propietario.girar(Giro.IZQUIERDA, 150);
		
		//El propietario apaga el auto
		propietario.apagar();
		propietario.apagar();
	}

}
