package capitulo4.claseInmuebleconherencia;

public class AppInmuebles {

	public static void main(String[] args) {
		
		ApartamentoFamiliar apto1= new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
		System.out.println("Datos apartamento");
		apto1.calcularPrecioVenta(apto1.valorAdministrativo);
		apto1.imprimir();
		
		System.out.println("Datos apartamento");
		Apartaestudio aptestudi1=new Apartaestudio(12345, 50, "Avenida Caracas 30-15", 1, 1);
		aptestudi1.calcularPrecioVenta(aptestudi1.valorArea);
		aptestudi1.imprimir();


	}

}
