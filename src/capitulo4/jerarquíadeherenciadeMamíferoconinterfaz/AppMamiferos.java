package capitulo4.jerarquíadeherenciadeMamíferoconinterfaz;

public class AppMamiferos {

	public static void main(String[] args) {
		
		Ballena mobyDick=new Ballena();
		mobyDick.amammantarCrias();
		
		Ornitorrinco ornitorrinco1 =new Ornitorrinco();
		ornitorrinco1.amammantarCrias();
		ornitorrinco1.ponerHuevos();
		
		Murcielago mur =new Murcielago();
		mur.amammantarCrias();
		mur.volar();

	}

}
