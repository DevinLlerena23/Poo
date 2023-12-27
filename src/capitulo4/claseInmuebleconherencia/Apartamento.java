package capitulo4.claseInmuebleconherencia;

public class Apartamento extends InmuebleVivienda {

	public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,
			int numeroBaños) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños);
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
	}
	
	

}
