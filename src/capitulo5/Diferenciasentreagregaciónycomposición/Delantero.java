package capitulo5.Diferenciasentreagregaciónycomposición;

public class Delantero extends Jugador{

	int golesAnotados;
	public Delantero(String nomber, String apellidos, int edad, boolean esTitular,int golesAnotados) {
		super(nomber, apellidos, edad, esTitular);
	this.golesAnotados=golesAnotados;
	}
	@Override
	public String toString() {
		return "Delantero [golesAnotados=" + golesAnotados + ", nomber=" + nomber + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}
	
	

}
