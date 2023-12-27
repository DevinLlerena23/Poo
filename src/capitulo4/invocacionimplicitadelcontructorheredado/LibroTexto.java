package capitulo4.invocacionimplicitadelcontructorheredado;

public class LibroTexto extends Libro  {
	
	public String curso;
	
	public LibroTexto(String titulo, String autor, String precio, String curso) {
		super(titulo, autor, precio);
		this.curso=curso;
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("curso: " + curso );
	}
	
	
	
	

}
