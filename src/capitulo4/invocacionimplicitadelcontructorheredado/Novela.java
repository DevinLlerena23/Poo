package capitulo4.invocacionimplicitadelcontructorheredado;

public class Novela  extends Libro{

	public String tipo;
	
	public Novela(String titulo, String autor, String precio,String tipo) {
		super(titulo, autor, precio);
		this.tipo=tipo;
		
	}

	@Override
	public void imprimir() {
		System.out.println("tipo :"+tipo);
	}

	

}
