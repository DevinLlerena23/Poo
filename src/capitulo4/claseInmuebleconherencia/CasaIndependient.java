package capitulo4.claseInmuebleconherencia;

public class CasaIndependient extends CasaUrbana {

	protected static double valorArea=3000000;
	public CasaIndependient(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,
			int numeroBaños, int numeroPisos) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños, numeroPisos);
		
	}
	@Override
	public void imprimir() {
		 super.imprimir();
		 System.out.println();
	}
	
	
	
	

}
