package capitulo5.Composiciónconpartesmúltiples;

public class Libro extends Publicacion{
	
	public String referenciabibliografica;


	public Libro(String titulo, String autor,  int anioPublicacion ,String editorial, String referenciabibliografica) {
		super(titulo, autor, editorial, anioPublicacion );
		
		this.referenciabibliografica=referenciabibliografica;
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void imprimir() {
		System.out.println("titulo=" + titulo + " autor =" + autor + " añoPublicacion =" + anioPublicacion + " editorial ="
				+ editorial + " referenciabibliografica=" + referenciabibliografica  ); 
	}
	
	
	
	

}
