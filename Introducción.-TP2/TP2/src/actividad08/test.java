package actividad08;

import actividad03.Fecha;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha fecha = new Fecha(9, 10, 2000);
		ImpresoraManocromatica impresora = new ImpresoraManocromatica();
		Documento documento = new Documento("Había una vez", "Había una vez Había una vez  Había una vez  Había una vez  Había una vez"
				, fecha);
		
		
		impresora.apagarImpresora();
		impresora.encenderImpresora();
		impresora.encenderImpresora();
		impresora.apagarImpresora();
		
		impresora.imprimir(documento);
		impresora.encenderImpresora();
		impresora.recargarHojas(36);
		impresora.recargarHojas(2);
		System.out.println(impresora.cantHojasSegunCaracteres(documento.getTexto().length()));
		System.out.println(impresora.nivelSegunCantCaracteres(documento.getTexto().length()));
	
		impresora.imprimir(documento);
		impresora.imprimir(documento);
	

		
		
		
		
	
		
		
	}

}
