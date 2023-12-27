package capitulo4.claseInmuebleconherencia;

public class CasaRural extends Casa{
	
	protected static double valorArea=1500000;
	
	protected int distanciaCabera;
	
	protected int altitud;

	public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes, int numeroBaños,
			int numeroPisos, int distanciaCabera, int altitud) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños, numeroPisos);
			this.distanciaCabera=distanciaCabera;
			this.altitud=altitud;
	}

	@Override
	public void imprimir() {
		System.out.println("distanciaCabera =" + distanciaCabera + " altitud =" + altitud );
		System.out.println();
	}
	
	
	

}
