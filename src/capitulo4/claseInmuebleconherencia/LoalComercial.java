package capitulo4.claseInmuebleconherencia;

public class LoalComercial extends Local{
	protected static double valorArea=300000;
	protected String centroComercial;

	public LoalComercial(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal,String centroComercial) {
		super(identificadorInmobiliario, area, direccion, tipoLocal);
		this.centroComercial=centroComercial;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("centroComercial =" + centroComercial ); 
		System.out.println();
	}
	
	
	

}
