package actividad03;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CuentaBancaria {

	//Atributos
	private String cbu;
	private Tipo tipoCaja;
	private double saldo;
	private String fechaApertura;
	private Persona titular;
	
	public CuentaBancaria(Tipo tipoCaja, Persona titular) {
		super();
		this.cbu = generarCbu();
		this.fechaApertura = obtenerFechaDeHoy();
		this.tipoCaja = tipoCaja;
		this.titular = titular;
		this.saldo = 0.0;
	}

	
	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public Tipo getTipoCaja() {
		return tipoCaja;
	}

	public void setTipoCaja(Tipo tipoCaja) {
		this.tipoCaja = tipoCaja;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public static String obtenerFechaDeHoy() {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);
        
        return formattedDate;

	}
	
	public static String generarCbu() {
		String theAlphaNumericS;
        StringBuilder builder;
        int i = 9;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 

        return builder.toString(); 
	}

	public double verSaldo() {
		return getSaldo();
	}
	
	public void depositar(double monto) {
		if(monto>0) {
			 double montoTotal = monto + getSaldo();
			 setSaldo(montoTotal);
			 System.out.println("Depositado con éxito. Tu saldo actual es de " + getSaldo());
		} else {
			System.out.println("No se puede depositar negativo.");
		}
	}
	
	public boolean extraer(double monto) {
		boolean pudoExtraer = true;
		
		if(monto<=getSaldo()) {
			setSaldo(getSaldo()-monto);
		} else {
			pudoExtraer = false;
		}
		
		return pudoExtraer;
		
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipoCaja=" + tipoCaja + ", saldo=" + saldo + ", fechaApertura="
				+ fechaApertura + ", titular=" + titular + "]";
	}
	
	
	
	
}
