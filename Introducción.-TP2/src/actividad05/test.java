package actividad05;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turnera turnera = new Turnera();
		
		
		turnera.otorgarProximoTurno();
		turnera.otorgarProximoTurno();
		turnera.otorgarProximoTurno();
		turnera.otorgarProximoTurno();
		turnera.otorgarProximoTurno();

		turnera.verUltimoNumeroOtorgado();
		
		turnera.resetarContador();
		
		turnera.otorgarProximoTurno();
		turnera.verUltimoNumeroOtorgado();

		turnera.resetearConador(3);
		turnera.verUltimoNumeroOtorgado();

		
		
	}

}
