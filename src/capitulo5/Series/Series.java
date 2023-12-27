package capitulo5.Series;

public class Series {
	private String titulo,genero,paisOrigen;
	private int añoRealizacion;
	
	public Series(String titulo, String genero, String paisOrigen, int añoRealizacion) {
		this.titulo = titulo;
		this.genero = genero;
		this.paisOrigen = paisOrigen;
		this.añoRealizacion = añoRealizacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getAñoRealizacion() {
		return añoRealizacion;
	}

	public void setAñoRealizacion(int añoRealizacion) {
		this.añoRealizacion = añoRealizacion;
	}

	
	public void imprimir() {
		System.out.println("titulo=" + titulo + ", genero=" + genero + ", paisOrigen=" + paisOrigen + ", añoRealizacion="
				+ añoRealizacion ); 
	}
	
	
	

}
