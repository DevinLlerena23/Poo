package capitulo4.interfazMatchDeportivoysusinterfacesheredadas;

public interface PartidoBaloncesto  extends MatchDeportivo{
	
	static final int duracionPartidoBaloncesto=40;
	void setCestasEquipoLocal(int marcador);
	void setCestasEquipoVisitante(int marcador);

}
