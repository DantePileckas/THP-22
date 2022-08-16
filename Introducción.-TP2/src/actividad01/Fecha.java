package actividad01;

public class Fecha {

//	- dia (entero)
//	- mes (entero)
//	- anio (entero)
	
	private int dia;
	public static final int DIAS_MES_IMPAR = 31;
	public static final int DIAS_MES_PAR = 30;

	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	public void mostrarComoCadena() {
		System.out.println(dia + " " +  mes + " " + anio );
	}
	

	public void mostrarDiasConcurridos() {
		if(this.mes%2!=0) {
			int diasTransucrridos = DIAS_MES_IMPAR - dia;
			System.out.println("Dias trancurridos: " + diasTransucrridos);
		} else {
			int diasTransucrridos = DIAS_MES_PAR - dia;
			System.out.println("Dias trancurridos: " + diasTransucrridos);		}
	}
	
	
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
	
	
}
