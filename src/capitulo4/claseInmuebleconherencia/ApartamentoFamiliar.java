package capitulo4.claseInmuebleconherencia;

public class ApartamentoFamiliar extends Apartamento {
	
	protected static double valorArea= 2000000;
	
	protected int valorAdministrativo;

	public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitantes,
			int numeroBaños, int valorAdministrativo) {
		super(identificadorInmobiliario, area, direccion, numeroHabitantes, numeroBaños);
		this.valorAdministrativo=valorAdministrativo;
	}

	@Override
	public void imprimir() {
		System.out.println(" valor de la administracion =" + valorAdministrativo ); 
	System.out.println();
	}
	
	

}
