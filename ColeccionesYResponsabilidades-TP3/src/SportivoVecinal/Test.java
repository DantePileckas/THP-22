package SportivoVecinal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programa sistema = new Programa();
		
	System.out.println(sistema.agregarSocio("Juan", 23));
	System.out.println(sistema.agregarSocio("Laura", 18));
	System.out.println(sistema.agregarSocio("Maria", 26));
	System.out.println(sistema.agregarSocio("Joaquín", 20));
	System.out.println(sistema.agregarSocio("Belén", 20));
	System.out.println(sistema.agregarSocio("Daniel", 21));
	System.out.println(sistema.agregarSocio("Valeria", 20));
	System.out.println(sistema.agregarSocio("Ana", 19));
	System.out.println(sistema.agregarSocio("Javier", 22));
	System.out.println(sistema.agregarSocio("Javier", 22));
	
	System.out.println("");
	
	System.out.println(sistema.establecerAmistad("Juan", "Ana"));
	System.out.println(sistema.establecerAmistad("Laura", "Ana"));
	System.out.println(sistema.establecerAmistad("Laura", "Juan"));
	System.out.println(sistema.establecerAmistad("Maria", "Ana"));
	System.out.println(sistema.establecerAmistad("Belén", "Joaquín"));
	System.out.println(sistema.establecerAmistad("Belén", "Daniel"));
	System.out.println(sistema.establecerAmistad("Valeria", "Ana"));
	System.out.println(sistema.establecerAmistad("Ana", "Daniel"));
	System.out.println(sistema.establecerAmistad("Javier", "Juan"));
	System.out.println(sistema.establecerAmistad("Javier", "Ana"));
	System.out.println(sistema.establecerAmistad("Ana", "Javier"));
	System.out.println(sistema.establecerAmistad("Ana", "Ana"));
	System.out.println(sistema.establecerAmistad("Laura", "Marcelo"));
	System.out.println(sistema.establecerAmistad("Toribio", "Ana"));
		
	System.out.println("");
	
	System.out.println(sistema.deshacerAmistad("Ana", "Javier"));
	System.out.println(sistema.deshacerAmistad("Ana", "Valeria"));
	System.out.println(sistema.deshacerAmistad("Ana", "Ana"));
	System.out.println(sistema.deshacerAmistad("Laura", "Marcelo"));
	System.out.println(sistema.deshacerAmistad("Toribio", "Ana"));
	
	System.out.println("");
	System.out.println("Socios con edad promedio de sus amigos:" );
	sistema.promedioEdades();
	
	System.out.println("");
	sistema.devolverAmigos("Laura");
	sistema.devolverAmigos("Walter");
	}
	

	

}
