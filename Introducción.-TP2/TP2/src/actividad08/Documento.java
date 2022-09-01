package actividad08;

import actividad03.Fecha;

public class Documento {

	private String titulo;
	private String texto;
	private Fecha fecha;
	
	public Documento(String titulo, String texto, Fecha fecha) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.fecha = fecha;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
