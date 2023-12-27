package capitulo4.herencia;

public class CuentaAhorros extends Cuenta {
	
	private boolean activa;

	public CuentaAhorros(float saldo, double tasa) {
		super(saldo, (float) tasa);
		
		if(saldo<1000)
			activa=false;
		else
			activa=true;
	}

	public void retirar(float cantidad) {
		
			super.retirar(cantidad);
	}
	
	public void consignar(float cantidad) {
		
			super.consignar(cantidad);
	}
	
	public void extractoMensual() {
		if(numeroRetiros>4) {
			comisionMensual+=(numeroRetiros-4)*100;
		}
		super.extractoMensual();
		if(saldo<1000)
			activa=false;
	}
	
	public void imprimir() {
		System.out.println("Saldo= $ "+saldo);
		System.out.println("Comision mensual= $ "+comisionMensual);
		System.out.println("Numero de transacciones = "+(numeroConsignaciones+
				numeroRetiros));
		System.out.println();
		
	}

}
