package capitulo5.Diferenciasentreagregaciónycomposición;

public class Mediocampo extends Jugador{
	
	int numeroAsistencias;

	public Mediocampo(String nomber, String apellidos, int edad, boolean esTitular, int numeroAsistencias) {
		super(nomber, apellidos, edad, esTitular);
		this.numeroAsistencias=numeroAsistencias;
	}

	@Override
	public String toString() {
		return "numeroAsistencias=" + numeroAsistencias + ", nomber=" + nomber + ", apellidos=" + apellidos
				+ ", edad=" + edad ;
	}

	
}
