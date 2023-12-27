package capitulo4.Desarrollarelcodigodelsiguientediagramaenlafigura4_10;

public class Persona {
	
	public String nombre;
	public String direccion;
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		System.out.println("nombre =" + nombre + " direccion =" + direccion ); 
	}
	
	
	
	

}
