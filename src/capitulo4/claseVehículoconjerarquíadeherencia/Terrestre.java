package capitulo4.claseVehículoconjerarquíadeherencia;

public class Terrestre extends Vehiculo implements Motor {

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		
		return (fuerza*radio);
	}

	@Override
	void acelerar(int velocidad) {
		int vel=velocidadActual+velocidad;
		if(vel>velocidadMaxima) {
			System.out.println("Supera la velocidad maxima permitida");
		} else {
			velocidadActual=vel;
		}
		
	}

	@Override
	void frenar(int velocidad) {

		int vel= velocidadActual-velocidad;
		if(vel<0) {
			System.out.println("La velocidad no puede ser negativa");
		} else {
			velocidadActual=vel;
		}
		
	}

}
