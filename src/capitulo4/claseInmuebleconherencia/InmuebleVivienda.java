package capitulo4.claseInmuebleconherencia;

public class InmuebleVivienda extends Inmueble{
	
	protected int numeroHabitaciones;
	protected int numeroBaños;

	public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,int numeroBaños) {
		super(identificadorInmobiliario, area, direccion);
		this.numeroHabitaciones=numeroHabitantes;
		this.numeroBaños=numeroBaños;	
	}

	@Override
	public void imprimir() {
		System.out.println(" numeroHabitaciones =" + numeroHabitaciones + " numeroBaños =" + numeroBaños ); 
	}
	
	

}
