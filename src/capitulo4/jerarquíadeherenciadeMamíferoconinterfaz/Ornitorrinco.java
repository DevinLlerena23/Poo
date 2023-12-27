package capitulo4.jerarquíadeherenciadeMamíferoconinterfaz;

public class Ornitorrinco extends Mamifeo implements Oviparo {

	@Override
	public void ponerHuevos() {
		System.out.println("El ornitorrinco amamanta a sus crias");
		
	}

	@Override
	public void amammantarCrias() {
		System.out.println("El ornitorrinco porn huevos");
	
		
	}

}
