package actividad03;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha fechaNac1 = new Fecha(05, 04, 89);
		Fecha fechaNac2 = new Fecha(30, 12, 76);
		Domicilio domicilio1= new Domicilio("yatay", 240, "Almagro");
		Persona persona1 = new Persona("123456789","Fulano", "Gomez", fechaNac1, domicilio1); 
		Persona persona2 = new Persona("901234567","Mengana", "Torres", fechaNac2, domicilio1); 
		CuentaBancaria cuentaBancaria = new CuentaBancaria(Tipo.CAJA_DE_AHORRO, persona1);
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria(Tipo.CAJA_DE_AHORRO, persona2);
		
//		System.out.println(cuentaBancaria);
	
		System.out.println("Depositando...");
		System.out.println();
		cuentaBancaria.depositar(-54);
		cuentaBancaria.depositar(500);
		cuentaBancaria.depositar(2500);
		cuentaBancaria.depositar(1000);
		System.out.println();
		cuentaBancaria1.depositar(-1);
		cuentaBancaria1.depositar(100);
		cuentaBancaria1.depositar(200);
		cuentaBancaria1.verSaldo();
		cuentaBancaria1.depositar(200);

		System.out.println("Extrayendo...");
		System.out.println(cuentaBancaria.extraer(12000));
		System.out.println(cuentaBancaria.extraer(2000));
		System.out.println(cuentaBancaria.extraer(1000));
		System.out.println(cuentaBancaria.extraer(500));
		System.out.println(cuentaBancaria.extraer(400));
		System.out.println(cuentaBancaria.verSaldo());
	
		
	}

}
