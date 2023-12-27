package capitulo5.Diferenciasentreagregaciónycomposición;

public class Portero extends Jugador {
	
	int golesRecibidos;
	public Portero(String nomber, String apellidos, int edad, boolean esTitular,int golesRecibidos) {
		super(nomber, apellidos, edad, esTitular);
		this.golesRecibidos=golesRecibidos;
	}
	@Override
	public String toString() {
		return "golesRecibidos=" + golesRecibidos + ", nomber=" + nomber + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}
	
	
}
