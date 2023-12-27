package capitulo4.jerarquíadeherenciadeCiclista;

public class Contrarrelojista  extends Ciclista{
	
	private double velocidadMaxima;

	public Contrarrelojista(int identificador, String nombre, double velocidadMacima) {
		super(identificador, nombre);
		this.velocidadMaxima=velocidadMacima;
	}

	
	
	protected double getVelocidadMaxima() {
		return velocidadMaxima;
	}



	protected void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	


	@Override
	public void imprimir() {
		System.out.println("velocidadMaxima = " + velocidadMaxima );
	}



	@Override
	String imrpimirTipo() {
		// TODO Auto-generated method stub
		return "Es un constrarrelojista";
	}

}
