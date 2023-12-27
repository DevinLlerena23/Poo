package capitulo4.claseInmuebleconherencia;

public class Casa extends InmuebleVivienda{
	
	protected int numeroPisos;

	public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes, int numeroBaños, int numeroPisos) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños);
		this.numeroPisos=numeroPisos;
	}

	@Override
	public void imprimir() {
		System.out.println("numeroPisos = " + numeroPisos ); 
	}

	
}
