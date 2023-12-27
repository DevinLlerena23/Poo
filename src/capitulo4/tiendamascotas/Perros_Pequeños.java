package capitulo4.tiendamascotas;


public class Perros_Pequeños extends Perro{
	public String raza;

	public Perros_Pequeños(String nombre, String edad, String color, tipo tipoperro, String peso, boolean muerde,String raza) {
		super(nombre, edad, color, tipoperro, peso, muerde);
		this.raza=raza;
	
	}


	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println( "raza =" + raza);
	}
}
