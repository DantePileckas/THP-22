package actividad03;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrtFlix ort = new OrtFlix();
		
		//Clientes
		Cliente c1 = new Cliente("123456", "Laura", 0.0, Categoria.PREMIUM); 
		Cliente c2 = new Cliente("123321", "Pablo", 0.0, Categoria.PREMIUM); 
		Cliente c3 = new Cliente("030345", "Jacinto", 50.0, Categoria.STANDARD); 
		Cliente c4 = new Cliente("909032", "Mirko", 0.0, Categoria.STANDARD); 
		Cliente c5 = new Cliente("323204", "Julián", 20.0, Categoria.STANDARD); 
		Cliente c6 = new Cliente("903256", "María", 0.0, Categoria.STANDARD); 
		
		//Películas
		Pelicula p1 = new Pelicula("Aladin", Categoria.PREMIUM);
		Pelicula p2 = new Pelicula("Los simpson", Categoria.STANDARD);		
		Pelicula p3 = new Pelicula("Sherk", Categoria.STANDARD);
		Pelicula p4 = new Pelicula("Mary Poppins", Categoria.PREMIUM);
		Pelicula p5 = new Pelicula("Chicago", Categoria.PREMIUM);
		
		
		System.out.println(ort.darDeAlta("123456", Categoria.PREMIUM));
		System.out.println(ort.darDeAlta("123321", Categoria.PREMIUM));
		System.out.println(ort.darDeAlta("030345",Categoria.STANDARD));
		System.out.println(ort.darDeAlta("909032",Categoria.STANDARD));
		System.out.println(ort.darDeAlta("323204",Categoria.STANDARD));
		System.out.println(ort.darDeAlta("903256", Categoria.STANDARD));
	
		System.out.println("");
		System.out.println(c3.esDeudor());
		ort.darDeBaja("030345");
		System.out.println(ort.ClienteListaNegra("030345"));
		System.out.println(ort.darDeAlta("030345",Categoria.STANDARD));
		
		System.out.println("");
		
		System.out.println(ort.verPelicula("123456", "Aladin"));
		System.out.println(ort.verPelicula("030345", "Aladin"));
		System.out.println(ort.verPelicula("030345", "Sherk"));
		System.out.println(ort.verPelicula("4545", "Aladin"));
		System.out.println(ort.verPelicula("123456", "Minions"));
		System.out.println(ort.verPelicula("323204", "Chicago"));
		
		
	
	
		
		
		
		
	}

}
