package capitulo5.claseDepartamentoyMunicipio;

import java.util.Vector;

public class Departamento {
	String nombre;
	private Vector municipios;
	
	public Departamento(String nombre, Vector municipios) {
		
		this.nombre = nombre;
		this.municipios = municipios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarMunicipio(Municipio municipio) {
		municipios.add(municipio);
	}
	
	public void eliminarMunicipio(String nombre) {
		Municipio municipio;
		for(int i=0;i<municipios.size();i++) {
			municipio=(Municipio) municipios.elementAt(i);
			if(nombre.equals(municipio.getNombre())) {
				municipios.remove(municipio);
				break;
			}
		}
	}
	
	public void buscarMunicipio(String nombre) {
		Municipio municipio = null ;
		for(int i=0;i<municipios.size();i++) {
			municipio=(Municipio) municipios.elementAt(i);
			if(nombre.equals(municipio.getNombre()));
			municipio.imprimir();
			break;
		}
		if(!nombre.equals(municipio.getNombre())) {
			System.out.println("Municipio no encontrado");
		}
	}
	
	public void buscarMunicipioConPoblacionMayor(int poblacion) {
		Municipio municipio;
		boolean encontroMunicipios=false;
		
		for(int i=0;i<municipios.size();i++) {
			municipio=(Municipio) municipios.elementAt(i);
			if(municipio.getPoblacion()>=poblacion) {
				System.out.println(municipio.getNombre());
				encontroMunicipios=true;
			}
			
		}
		
		if(!encontroMunicipios) {
			System.out.println("No existen municipios con esta poblacion");
		}
	}
	
	public int calcularCensoPoblacionDepartamento() {
		Municipio municipio;
		int totalCenso=0;
		for(int i=0;i<municipios.size();i++) {
			municipio=(Municipio) municipios.elementAt(i);
			totalCenso+=municipio.getPoblacion();
		}
		return totalCenso;
	}
	
}
