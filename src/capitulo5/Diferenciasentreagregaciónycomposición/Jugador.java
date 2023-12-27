package capitulo5.Diferenciasentreagregaciónycomposición;

public class Jugador extends Persona {
	
	boolean esTitular;
	
	public Jugador(String nomber, String apellidos, int edad, boolean esTitular) {
		super(nomber, apellidos, edad);
		this.esTitular=esTitular;
		
	}

}
