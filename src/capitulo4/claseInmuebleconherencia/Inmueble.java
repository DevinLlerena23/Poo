package capitulo4.claseInmuebleconherencia;

public class Inmueble {
	protected int identificadorInmobiliario;
	protected int area;
	protected String direccion;  
	protected double precioVenta;
	
	public Inmueble(int identificadorInmobiliario, int area, String direccion) {
		
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.area = area;
		this.direccion = direccion;
		
	}
	
	
	double calcularPrecioVenta(double valorArea) {
		precioVenta = area * valorArea;
		return precioVenta;
		}


	public void imprimir() {
		System.out.println("identificadorInmobiliario :" + identificadorInmobiliario + "area :" + area + ", direccion :"
				+ direccion + " precioVenta" + precioVenta  );
	}
	
	
	
	
	
	
}
	

	

		


