package actividad02;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inmobiliaria inmobiliaria = new Inmobiliaria();
		
		//testPropiedades
		Propiedad propiedad1 = new Propiedad("Eintestin", 270000, Tipo.CASA);
		Propiedad propiedad2 = new Propiedad("Rio Cuarto", 300000, Tipo.CASA);
		Propiedad propiedad3 = new Propiedad("Cachi", 275000, Tipo.PH);
		Propiedad propiedad4 = new Propiedad("Tilcara", 200000, Tipo.PH);
		Propiedad propiedad5 = new Propiedad("Saenz", 210000, Tipo.PH);
		Propiedad propiedad6 = new Propiedad("Ventana", 250000, Tipo.DEPARTAMENTO);
		Propiedad propiedad7 = new Propiedad("Esquiu", 220000, Tipo.DEPARTAMENTO);

		//TestBarrios
		Barrio barrio1 = new Barrio("Pompeya");
		Barrio barrio2 = new Barrio("Parque Patricios");
		Barrio barrio3 = new Barrio("Boedo");
		
		
		barrio1.addProp(propiedad1);
		barrio1.addProp(propiedad7);
		barrio1.addProp(propiedad3);
		
		barrio2.addProp(propiedad2);
		barrio2.addProp(propiedad4);


		System.out.println("Testeando el m?todo Mostrar Propiedades seg?n el tipo");
		barrio1.mostrarPropiedades(Tipo.CASA);
		
		
		inmobiliaria.addBarrio(barrio1);
		inmobiliaria.addBarrio(barrio2);
		inmobiliaria.addBarrio(barrio3);

		System.out.println("Mostrando Todas las propiedades");
		inmobiliaria.mostrarPropiedades();
		
		System.out.println(inmobiliaria.obtenerBarrioMaxProp());
		
		inmobiliaria.borrarPropiedad("Cachi");
		barrio1.mostrarPropiedades();
	
		System.out.println("Mostrando del barrio 1");
		inmobiliaria.cambiarPropiedad("Esquiu", barrio2);
		barrio1.mostrarPropiedades();
		System.out.println("Mostrando del barrio 2");
		barrio2.mostrarPropiedades();
		
		
	}

}
