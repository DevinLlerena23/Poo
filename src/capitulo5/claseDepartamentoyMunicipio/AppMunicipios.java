package capitulo5.claseDepartamentoyMunicipio;

import java.util.Vector;

public class AppMunicipios {

	public static void main(String[] args) {
		
		Municipio municipio1=new Municipio("Manizales", 400000, 17,2200);
		Municipio municipio2=new Municipio("La dorada", 98000, 28,1000);
		Municipio municipio3=new Municipio("Neira", 30000, 20,1969);
		
		Vector municipios=new Vector();
		municipios.add(municipio1);
		municipios.add(municipio2);
		municipios.add(municipio3);
		Departamento departamento=new Departamento("Caldas", municipios);
		System.out.println("El censo del Departamento de " + departamento.getNombre() + "es= " +departamento.calcularCensoPoblacionDepartamento());
		System.out.println("Municipios con poblacion mayor a 50000");
		departamento.buscarMunicipioConPoblacionMayor(50000);
		System.out.println("Busqueda del municipio de manizales");
		departamento.buscarMunicipio("Manizales");
		
		

	}

}
