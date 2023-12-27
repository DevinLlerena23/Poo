package capitulo4.invocacionimplicitadelcontructorheredado;

public class Applibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Abel Iglesias", "Bone  Cantuña", "1000");
		
		libro1.imprimir();
		System.out.println();
		
		LibroTexto librotex = new LibroTexto("La odicea", "Amdrew Gonzales ", "50000", "2 primaria");
		
		librotex.imprimir();
		System.out.println();
		librosUColombia libru =new librosUColombia("ilíada", " Federico Robles ", "210000", "1ro", "Deportes");
			
		libru.imprimir();
		System.out.println();
	}

}
