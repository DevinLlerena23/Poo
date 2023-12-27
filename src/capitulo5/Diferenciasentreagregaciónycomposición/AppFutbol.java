package capitulo5.Diferenciasentreagregaciónycomposición;

public class AppFutbol {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico("Carlos","Queiroz", 66, 30, false); 
		
		Portero portero = new Portero("David", "Ospina", 30, true, 10);
		
		Defensa[] defensas = new Defensa[4]; 
		Mediocampo[] mediocampos = new Mediocampo[4]; 
		Delantero[] delanteros = new Delantero[2]; 
	
		defensas[0] = new Defensa("Yerry", "Mina", 24, true);
		defensas[1] = new Defensa("Davison", "Sánchez", 23, true);
		defensas[2] = new Defensa("William", "Tesillo", 29, true);
		defensas[3] = new Defensa("Stefan", "Medina", 29, true);
		mediocampos[0] = new Mediocampo("Mateus", "Uribe", 28, true, 
		12);
		mediocampos[1] = new Mediocampo("Wilmar", "Barrios", 25, 
		true, 12);
		mediocampos[2] = new Mediocampo("Juan Guillermo", 
		"Cuadrado", 31, true, 10);
		mediocampos[3] = new Mediocampo("James", "Rodríguez", 28, 
		true, 32);
		delanteros[0] = new Delantero("Radamel Falcao", "García", 33, 
		true, 15);
		delanteros[1] = new Delantero("Duvan", "Zapata", 28, true, 12);
	
		
		EquipoFutbol equipo = new EquipoFutbol("Selección mayores", 
		"Colombia", 
		tecnico, portero, defensas, mediocampos, delanteros);
		equipo.imprimir();

	}

}
