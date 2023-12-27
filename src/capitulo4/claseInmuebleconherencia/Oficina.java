package capitulo4.claseInmuebleconherencia;

public class Oficina extends Local {
	
	protected static double valorArea=3500000;
	protected boolean esGobierno;

	public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
		super(identificadorInmobiliario, area, direccion, tipoLocal);
	this.esGobierno=esGobierno;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("esGobierno =" + esGobierno );
		System.out.println();
	}

	
}
