package capitulo4.tiendamascotas;

public class Gato_sin_pelo extends Gato{
	
	public String raza;

	public Gato_sin_pelo(String nombre, String edad, String color, tipo tipopelo, String altura_salto,
			String longitud_salto,String raza) {
		super(nombre, edad, color, tipopelo, altura_salto, longitud_salto);
		this.raza=raza;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println(" raza =" + raza ); 
	}
	
	

}
