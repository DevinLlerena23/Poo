package capitulo4.claseInmuebleconherencia;

public class Apartaestudio extends Apartamento {
	
	protected static double valorArea=1500000;

	public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,
			int numeroBaños) {
		super(identificadorInmobiliario, area, direccion, 1,1);
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println(); 
	}

	
	
}
