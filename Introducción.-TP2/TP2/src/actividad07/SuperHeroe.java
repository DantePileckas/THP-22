package actividad07;

public class SuperHeroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int poder;
	private final int VALOR_MIN = 0;
	private final int VALOR_MAX = 100;

	
	public SuperHeroe(String nombre, int fuerza, int resistencia, int poder) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.poder=poder;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		if(fuerza>=VALOR_MIN && fuerza <=VALOR_MAX ) {
			this.fuerza = fuerza;
		} if(fuerza<0) {
			this.fuerza=VALOR_MIN;
		} else {
			this.fuerza=VALOR_MAX;
		}
	}


	public int getResistencia() {
		return resistencia;
	}


	public void setResistencia(int resistencia) {
		if(resistencia>=VALOR_MIN && resistencia <=VALOR_MAX ) {
			this.resistencia = resistencia;
		} if(resistencia<0) {
			this.resistencia=VALOR_MIN;
		} else {
			this.resistencia=VALOR_MAX;
		}	}


	
	public int getPoder() {
		return poder;
	}


	public void setPoder(int poder) {
		this.poder = poder;
	}


	public Resultado competir(SuperHeroe superHeroeCompetidor) {
		int contadorJug1 = 0;
		int contadorJug2= 0;
		Resultado resultado = Resultado.EMPATE;
		
		if(this.fuerza>superHeroeCompetidor.getFuerza()) {
			contadorJug1++;
		} else {
			contadorJug2++;
		}
		
		if(this.poder>superHeroeCompetidor.getPoder()) {
			contadorJug1++;
		} else {
			contadorJug2++;
		} 
		
		if(this.resistencia>superHeroeCompetidor.getResistencia()) {
			contadorJug1 ++;
		} else {
			contadorJug2++;
		}
		
		if(contadorJug1>contadorJug2) {
			resultado = Resultado.TRIUNFO;
		} else if(contadorJug1<contadorJug2) {
			resultado = Resultado.DERROTA;
		}
		
		return resultado;
		
	}

	
	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", VALOR_MIN="
				+ VALOR_MIN + ", VALOR_MAX=" + VALOR_MAX + "]" + ", Poder=" + poder;
	}
	
	
	
}
