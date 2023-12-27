package capitulo4.invocacionimplicitadelcontructorheredado;

public class Libro {
	
	protected String titulo;
	protected String autor;
	protected String precio;
	
	public Libro(String titulo, String autor, String precio) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	
	
	public void imprimir() {
		System.out.println( "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio); 
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
