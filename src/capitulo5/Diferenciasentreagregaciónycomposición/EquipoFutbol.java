package capitulo5.Diferenciasentreagregaciónycomposición;

public class EquipoFutbol {
	String nombre;
	String pais;
	Tecnico tecnico;
	Portero portero;
	Defensa[] defensas;
	Mediocampo[] mediocampos;
	Delantero[] delanteros;
	
	public EquipoFutbol(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public EquipoFutbol(String nombre,String ciudad,Tecnico tecnico,Portero portero,
			Defensa[] defensa,Mediocampo[] mediocampos,Delantero[] delanteros) {
		this(nombre,ciudad);
		this.tecnico=tecnico;
		this.portero=portero;
		this.defensas=defensa;
		this.mediocampos=mediocampos;
		this.delanteros=delanteros;
	}
	
	void imprimir() {
		System.out.println("nombre del equipo= "+nombre);
		System.out.println("pais= "+pais);
		System.out.println("Portero ["+ portero +"]");
		System.out.println("Defensas= ");
		for(int i=0;i<defensas.length;i++) {
			System.out.println(defensas[i]);
		}
		System.out.println("Medicampo");
		for(int j=0;j<mediocampos.length;j++) {
			System.out.println(mediocampos[j]);
		}
		System.out.println("Delanteros");
		for(int k=0; k<delanteros.length;k++) {
			System.out.println(delanteros[k]);
		}
	}
	
	

}
