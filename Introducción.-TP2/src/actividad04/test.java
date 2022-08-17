package actividad04;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona("0303456", "Fulano", "Gómez");
		Robot robot = new Robot();
		
		robot.saludar();
		robot.saludar(persona);
		
	}

}
