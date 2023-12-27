package capitulo4.claseVehículoconjerarquíadeherencia;

public class Acuatico extends Vehiculo implements Motor,Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento>80 || velocidadViento< 10) {
			velocidadActual=0;
		}
		
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		
		return (fuerza*radio);
	}

	@Override
	void acelerar(int velocidad) {
		int vel=velocidadActual+velocidad;
		if(vel>velocidadMaxima) {
			System.out.print("Supera la velocidad maxima permitida");
		} else {
			velocidadActual=vel;
		}
		
	}

	@Override
	void frenar(int velocidad) {
		 int vel=velocidadActual-velocidad;
		 if(vel<0) {
			 System.out.println("La velocidad no puede ser negativa");
		 } else {
			 velocidadActual=vel;
		 }
		
	}

}
