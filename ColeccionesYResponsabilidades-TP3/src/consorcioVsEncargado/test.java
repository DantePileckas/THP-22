package consorcioVsEncargado;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edificio yatay240 = new Edificio("YATAY 240", 5); 
		
		yatay240.agregarUnidad(1, "10741852", "Lionel Messi"); 
		yatay240.agregarUnidad(1, "20178359", "Marcelo Gallardo"); 
		yatay240.agregarUnidad(2, "20178359", "Marcelo Gallardo"); 
		yatay240.agregarUnidad(3, "23796335", "Alejandro Jait"); 
		yatay240.agregarUnidad(4, "40466799", "Dalma Maradona"); 
		yatay240.agregarUnidad(5, "27632464", "Marcelo Espinosa"); 
		yatay240.agregarUnidad(6, "39258369", "Diego Torres"); 
		
		yatay240.actualizarVoto(2, true); 
		yatay240.actualizarVoto(3, true); 
		yatay240.actualizarVoto(5, true);
		

		yatay240.listarVotosPositivos(); 
		
		System.out.println(yatay240.calcularPorcentaje() + " %");
		
	}

}
