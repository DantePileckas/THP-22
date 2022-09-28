package consorcioVsEncargado;

import java.util.ArrayList;
import java.util.Iterator;

public class Edificio {

	
	private String direccion;
	private int cantDeptos;
	private ArrayList<Departamento> departamentos;
	
	public Edificio(String direccion, int cantDeptos) {
		super();
		this.direccion = direccion;
		this.cantDeptos = cantDeptos;
		this.departamentos = new ArrayList<Departamento>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantDeptos() {
		return cantDeptos;
	}

	public void setCantDeptos(int cantDeptos) {
		this.cantDeptos = cantDeptos;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	//métodos
	private boolean validarUnidad(int unidad) {
		boolean valorHabilitado = true;
		for (Departamento departamento : departamentos) {
			if(departamento.getNumeroDeUnidad()==unidad || departamentos.size()>unidad ) {
				valorHabilitado = false;
			}
		}
		return valorHabilitado;
	}
	
	public boolean agregarUnidad(int unidad, String dni, String prop) {
		boolean pudo = false;
		boolean validarUnidad = validarUnidad(unidad);
		
		if (validarUnidad) {
			departamentos.add(new Departamento(unidad, dni, prop, false));
			pudo = true;
			System.out.println("Se pudo");
		} else {
			System.out.println("No se pudo");
		}
		
		return pudo;
		
	}
	
	private Departamento buscarDepto(int unidad) {
		Departamento depto = null;
		int i = 0;

		while (i < departamentos.size() && depto == null) {
			if (departamentos.get(i).getNumeroDeUnidad()==unidad) {
				depto = departamentos.get(i);
			} else {
				i++;
			}
		}
		return depto;
	}
	
	public boolean actualizarVoto(int unidad, boolean voto) {
		Departamento dpto = buscarDepto(unidad);
		boolean votoActualizado = false;
		
		if(dpto!=null) {
			dpto.setVoto(voto);
			votoActualizado = true;
		}
		
		return votoActualizado;
		
	}
	
	public void listarVotosPositivos() {
		for (Departamento departamento : departamentos) {
			if(departamento.getVoto()) {
				System.out.println(departamento);
			}
		}
	}
		
	public double calcularPorcentaje() {
		double cantidad = 0;
		for (Departamento departamento : departamentos) {
			if(departamento.getVoto()) {
				cantidad++;
			}
		}
		return cantidad*100/departamentos.size();
	}
	
	
	@Override
	public String toString() {
		return "Edificio [direccion=" + direccion + ", cantDeptos=" + cantDeptos + ", departamentos=" + departamentos
				+ "]";
	}
	
	
	
	
	
	
}
