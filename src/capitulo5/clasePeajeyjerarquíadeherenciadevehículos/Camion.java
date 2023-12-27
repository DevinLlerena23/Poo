package capitulo5.clasePeajeyjerarquíadeherenciadevehículos;

public class Camion extends Vehiculo{
	
	static int valorPeaje=5000;
	int numeroEjes;

	Camion(String placa,int numeroEjes) {
		super(placa);
		this.numeroEjes=numeroEjes;
	}

	public static int getValorPeaje() {
		return valorPeaje;
	}

	public static void setValorPeaje(int valorPeaje) {
		Camion.valorPeaje = valorPeaje;
	}
	
	
	void imprimir() {
		System.out.println("Placa= "+ placa + "Numero de ejes ="+ numeroEjes + "Valor del peajes= " + valorPeaje);
	}

}
