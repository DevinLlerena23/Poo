package capitulo4.jerarquíadeherenciadeCiclista;

public class Escalador extends Ciclista{
	
	private double aceleracionPromedio;
	private double gradoRampa;
	public Escalador(int identificador, String nombre,double aceleracionPromedio,double gradoRampa) {
		super(identificador, nombre);
		this.aceleracionPromedio=aceleracionPromedio;
		this.gradoRampa=gradoRampa;
	}
	
	

	protected double getAceleracionPromedio() {
		return aceleracionPromedio;
	}
	protected void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}
	protected double getGradoRampa() {
		return gradoRampa;
	}
	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}


	



	@Override
	public void imprimir() {
		System.out.println("aceleracionPromedio =" + aceleracionPromedio + " gradoRampa = " + gradoRampa ); 
	}



	@Override
	String imrpimirTipo() {

		return "Es un escalador";
	}

}
