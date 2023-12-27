package capitulo5.Diferenciasentreagregaciónycomposición;

public class Defensa extends Jugador{

	public Defensa(String nomber, String apellidos, int edad, boolean esTitular) {
		super(nomber, apellidos, edad, esTitular);
	
	}

	@Override
	public String toString() {
		return "nomber=" + nomber + ", apellidos=" + apellidos + ", edad=" + edad ;
	}
	
	

}
