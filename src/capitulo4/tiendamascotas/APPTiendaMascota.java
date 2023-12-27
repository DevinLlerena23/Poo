package capitulo4.tiendamascotas;

public class APPTiendaMascota {

	public static void main(String[] args) {

		Perro_Grande perrog =new Perro_Grande("Andrew", "950", "Vantablack", Perro.tipo.GRANDE, "65 kg", false, "pastor alemán");
		
		perrog.imprimir();
	}

}
