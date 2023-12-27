package capitulo4.claseInmuebleconherencia;

public class CasaConjuntoCerrado extends CasaUrbana {
	
	protected static double valorArea=2500000;
	protected int valorAdminisreacion;
	protected boolean tienePiscina;
	protected boolean tieneCamposDeportivos;

	public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,
			int numeroBaños, int numeroPisos,int valorAdminisreacion, boolean tienePiscina, boolean tieneCamposDeportivos) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños, numeroPisos);
		
		this.valorAdminisreacion=valorAdminisreacion;
		this.tienePiscina=tienePiscina;
		this.tieneCamposDeportivos=tieneCamposDeportivos;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("valorAdminisreacion =" + valorAdminisreacion + " tienePiscina =" + tienePiscina
				+ " tieneCamposDeportivos =" + tieneCamposDeportivos ); 
		
		System.out.println();
	}
	
	
	

}
