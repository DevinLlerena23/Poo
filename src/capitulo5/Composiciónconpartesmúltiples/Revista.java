package capitulo5.Composiciónconpartesmúltiples;

public class Revista extends Publicacion{
	
	public String periodicidad,pais;

	public Revista(String titulo, String autor, String editorial, int anioPublicacion,String periodicidad, String pais) {
		super(titulo, autor, editorial, anioPublicacion);
		this.periodicidad=periodicidad;
		this.pais=pais;
	}

	
	public void imprimir() {
		System.out.println("periodicidad=" + periodicidad + ", pais=" + pais + ", titulo=" + titulo + ", autor=" + autor
				+ ", editorial=" + editorial + " anioPublicacion=" + anioPublicacion ); 
	}
	
	

}
