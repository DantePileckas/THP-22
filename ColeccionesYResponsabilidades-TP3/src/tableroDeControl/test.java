package tableroDeControl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tablero tablero = new Tablero(20);
		
		tablero.agregarLampara(1, Sector.CENTRO, Color.ROJA);
		tablero.agregarLampara(2, Sector.CENTRO, Color.AMARILLA);
		tablero.agregarLampara(3, Sector.CENTRO, Color.AZUL);
		tablero.agregarLampara(4, Sector.CENTRO, Color.BLANCA);
		
		tablero.agregarLampara(5, Sector.DERECHA, Color.ROJA);
		tablero.agregarLampara(6, Sector.DERECHA, Color.AMARILLA);
		tablero.agregarLampara(7, Sector.DERECHA, Color.AZUL);
		tablero.agregarLampara(8, Sector.DERECHA, Color.BLANCA);
		
		tablero.agregarLampara(9, Sector.IZQUIERDA, Color.ROJA);
		tablero.agregarLampara(10, Sector.IZQUIERDA, Color.AMARILLA);
		tablero.agregarLampara(11, Sector.IZQUIERDA, Color.AZUL);
		tablero.agregarLampara(12, Sector.IZQUIERDA, Color.BLANCA);
		
		tablero.mostrarOperatividad();

		tablero.prenderLuz(5);
		tablero.prenderLuz(5);
		tablero.prenderLuz(50);

		tablero.subirTelon();
		tablero.subirTelon();
		
		tablero.prenderLuces(Sector.CENTRO);

		//falta testear el cambio de color
		
		tablero.apagarYCerrarTodo();

		//Me falta agregar la acción.
		tablero.mostrarHistoricoLuces();
		
		
	}

}
