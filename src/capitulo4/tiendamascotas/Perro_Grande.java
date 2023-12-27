package capitulo4.tiendamascotas;

public class Perro_Grande extends Perro{
	
	public String raza;
	
	public Perro_Grande(String nombre, String edad, String color, tipo tipoperro, String peso, boolean muerde, String raza) {
		super(nombre, edad, color, tipoperro, peso, muerde);
		this.raza=raza;
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("raza =" + raza ); 
	}
	
	

}
