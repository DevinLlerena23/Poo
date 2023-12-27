package capitulo4.claseVehículoconjerarquíadeherencia;

public class AppVehiculos {

	public static void main(String[] args) {
		Terrestre camioneta = new Terrestre(100, 250);
		System.out.println("Camioneta");
		camioneta.imprimir();
		camioneta.acelerar(50);
		System.out.println("Nueva velocidad actual= "+ camioneta.velocidadActual);
		
		Acuatico motoAcu =new Acuatico(50,100);
		System.out.println("moto acuatica");
		motoAcu.imprimir();
		System.out.println("revoluciones del motor= "+ motoAcu.calcularRevolucionesMotor(1200, 2));
		motoAcu.recomendarVelocidad(20);
		
		VehiculoAereo avion= new VehiculoAereo();
		avion.encender();
		avion.despegar();
		avion.subirrTren();
		avion.bajarTren();
		avion.aterrizar();
		avion.apagar();
		
	
	}

}
