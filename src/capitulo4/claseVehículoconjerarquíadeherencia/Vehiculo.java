package capitulo4.claseVehículoconjerarquíadeherencia;

public abstract class Vehiculo {
	int velocidadActual;
	int velocidadMaxima;
	
	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	public void imprimir() {
		System.out.println( "velocidadActual =" + velocidadActual + " velocidadMaxima = " + velocidadMaxima);
	}
	
	abstract void acelerar(int velocidad);
	abstract void frenar(int velocidad);
	
	
	
	
}
