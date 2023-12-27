package capitulo4.tiendamascotas;

public class Mascota {
	
	public String nombre;
	public String edad;
	public String color;
	
	public Mascota(String nombre, String edad, String color) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}

	public void imprimir() {
		System.out.println("nombre=" + nombre + " edad=" + edad +" color=" + color ); 
	}
	
	
	
	
	
}
