package capitulo4.interfazMatchDeportivoysusinterfacesheredadas;

public class AppDeportes {

	public static void main(String[] args) {
	
		PartidoFutbolLigaEspañola partido= new PartidoFutbolLigaEspañola();
		System.out.println("duracion del partido= "+ PartidoFutbolLigaEspañola.duracionPartidoFutbol);
		partido.setEquipoLocal("Real madrid");
		partido.setEquipoVisitante("Barcelona");
		partido.setGolesEqupoLocal(3);
		partido.setGolesEquipoVisitante(3);
		partido.imprimir();

	}

}
