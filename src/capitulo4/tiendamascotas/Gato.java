package capitulo4.tiendamascotas;

public class Gato extends Mascota{
	
	 enum tipo {SIN_PELO,PELO_LARGO,PELO_CORTO}
	 protected tipo tipopelo;
	 public String altura_salto;
	 public String longitud_salto;
	 
	 public Gato(String nombre, String edad, String color,tipo tipopelo,String altura_salto,String longitud_salto) {
		super(nombre, edad, color);
		this.tipopelo=tipopelo;
		this.altura_salto=altura_salto;
		this.longitud_salto=longitud_salto;
	}

	 
	 public static void sonido() {
		 
		 System.out.println("“Los gatos maúllan y ronronean");
	 }
	 
	 
	@Override
	public void imprimir() {
		
		System.out.println("tipopelo =" + tipopelo + " altura_salto =" + altura_salto + " longitud_salto =" + longitud_salto); 
	}
	 
	 
	
	 
	 
}
