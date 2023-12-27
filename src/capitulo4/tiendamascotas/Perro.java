package capitulo4.tiendamascotas;

public class Perro extends Mascota {

	enum  tipo {GRANDE,PEQUENO,MEDIANO};
	protected tipo tipoperro;
	public String peso;
	boolean muerde;
	
	public Perro(String nombre, String edad, String color,tipo tipoperro,String peso,boolean muerde) {
		super(nombre, edad, color);
		this.tipoperro=tipoperro;
		this.peso=peso;
		this.muerde=muerde;
		
	}
	
	public static void sonido() {
		
		System.out.println("Los perros ladran");
	}

	@Override
	public void imprimir() {
		System.out.println("tipoperro =" + tipoperro + " peso =" + peso + " muerde =" + muerde ); 
	}
	
	
	
	

}
