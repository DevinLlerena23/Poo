package capitulo4.claseInmuebleconherencia;

public class CasaUrbana extends Casa{

	public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes, int numeroBaños,
			int numeroPisos) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños, numeroPisos);
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
	}

	
}
