package capitulo5.clasePeajeyjerarquíadeherenciadevehículos;

public class Moto extends Vehiculo{
	
	static int valorPeaje=500;

	Moto(String placa) {
		super(placa);
	
	}

	public static int getValorPeaje() {
		return valorPeaje;
	}

	public static void setValorPeaje(int valorPeaje) {
		Moto.valorPeaje = valorPeaje;
	}
	
	
	void imprimir() {
		System.out.println("Placa= "+placa + "Valor del peaje= " + valorPeaje);
	}

}
