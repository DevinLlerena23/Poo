package capitulo4.interfazMatchDeportivoysusinterfacesheredadas;

public class PartidoFutbolLigaEspañola implements PartidoFutbol{

	String equipoLocal;
	String equipoVisitante;
	int golesEquipoLocal;
	int golesEquipoVisitante;
	
	
	
	
	
	
	@Override
	public void setEquipoLocal(String nombreEquipo) {
	this.equipoLocal=nombreEquipo;
		
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante=nombreEquipo;
		
	}

	@Override
	public void setGolesEqupoLocal(int marcador) {
		this.golesEquipoLocal=marcador;
		
	}

	@Override
	public void setGolesEquipoVisitante(int marcador) {
		this.golesEquipoVisitante=marcador;
	}

	public void imprimir() {
		System.out.println("equipoLocal = " + equipoLocal + " equipoVisitante=" + equipoVisitante
				+ " golesEquipoLocal =" + golesEquipoLocal + " golesEquipoVisitante =" + golesEquipoVisitante ); 
	}
	
	
	

}
