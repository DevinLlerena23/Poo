package capitulo4.interfazMatchDeportivoysusinterfacesheredadas;

public interface PartidoFutbol extends MatchDeportivo{
	
	static final int duracionPartidoFutbol=90;
	void setGolesEqupoLocal(int marcador);
	void setGolesEquipoVisitante(int marcador);
	

}
