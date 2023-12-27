package capitulo4.jerarquíadeherenciadeCiclista;

public class Velocista  extends Ciclista{
	
	private double potenciaPromedio;
	private double velocidadPromedio;

	public Velocista(int identificador, String nombre, double potenciaPromedio,double velocidadPromedio) {
		super(identificador, nombre);
		this.potenciaPromedio=potenciaPromedio;
		this.velocidadPromedio=velocidadPromedio;
	}
	

	protected double getPotenciaPromedio() {
		return potenciaPromedio;
	}



	protected void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}



	protected double getVelocidadPromedio() {
		return velocidadPromedio;
	}



	protected void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}


	
	
	
	

	@Override
	public void imprimir() {
		System.out.println("potenciaPromedio =" + potenciaPromedio + " velocidadPromedio = " + velocidadPromedio ); 
	}


	@Override
	String imrpimirTipo() {
	
		return "Es un velocista";
	}

}
