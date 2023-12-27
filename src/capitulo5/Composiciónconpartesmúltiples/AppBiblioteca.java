package capitulo5.Composiciónconpartesmúltiples;

public class AppBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
		Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquz"
				,1967,"Sudamericana","858.67");
		biblioteca1.agergarLibro(libro1);
		Libro libro2 = new Libro("Rayela","Julio Cotazar",1963,"Sudamericana",
				"863.55");
		biblioteca1.agergarLibro(libro2);
		Libro libro3 = new Libro("La tia julia y el escribidor","Mario Vargas",
				7977,"SeixBarral","868");
		biblioteca1.agergarLibro(libro3);
		biblioteca1.listarLibros();
		
	}

}
