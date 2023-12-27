package capitulo4.claseVehículoconjerarquíadeherencia;

public class VehiculoAereo implements Alas, Reactor{

	public void despegar() {
		System.out.println("despegando vehiculo");
	}
	
	public void aterrizar() {
		System.out.println("aterrizando vehiculo");
	}
	
	public void volar() {
		System.out.println(" vehiculo volando");
	}
	
	@Override
	public void encender() {
		System.out.println(" vehiculo encendido");
		
	}

	@Override
	public void apagar() {
		System.out.println(" vehiculo apagado");
		
	}

	@Override
	public void bajarTren() {
		System.out.println(" bajando tren");
		
	}

	@Override
	public void subirrTren() {
		System.out.println(" subiendo tren");
		
	}

}
