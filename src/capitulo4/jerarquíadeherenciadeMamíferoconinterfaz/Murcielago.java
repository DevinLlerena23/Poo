package capitulo4.jerarquíadeherenciadeMamíferoconinterfaz;

public class Murcielago extends Mamifeo implements Volador{

	@Override
	public void volar() {
		System.out.println("El murcielago vuela");
		
	}

	@Override
	public void amammantarCrias() {
		System.out.println("El murcielago amamanta a sus crias");
		
	}

}
