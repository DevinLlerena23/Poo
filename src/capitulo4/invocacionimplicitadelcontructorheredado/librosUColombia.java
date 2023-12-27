package capitulo4.invocacionimplicitadelcontructorheredado;

public class librosUColombia extends LibroTexto {
	
	public String facultad;

	public librosUColombia(String titulo, String autor, String precio, String curso,String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad=facultad;
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("facultad : " + facultad);
	}
	
	

}
