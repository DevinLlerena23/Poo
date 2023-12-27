package capitulo5.clasePeajeyjerarquíadeherenciadevehículos;

public class AppSistemaPeaje {

	public static void main(String[] args) {
		Peaje peaje = new Peaje ("La Lizama", "Santander");
		Camion camión1 = new Camion("PKI-889", 2);
		peaje.añadirVehiculo(camión1);
		peaje.calcularPeaje(camión1);
		Camion camión2 = new Camion("KLM-123", 3);
		peaje.añadirVehiculo(camión2);
		peaje.calcularPeaje(camión2);
		Camion camión3 = new Camion("PQI-234", 4);
		peaje.añadirVehiculo(camión3);
		peaje.calcularPeaje(camión3);
		Moto moto1 = new Moto("ABC-123");
		peaje.añadirVehiculo(moto1);
		peaje.calcularPeaje(moto1);
		Moto moto2 = new Moto("XYZ-000");
		peaje.añadirVehiculo(moto2);
		peaje.calcularPeaje(moto2);
		Carro carro1 = new Carro("VC-389");
		peaje.añadirVehiculo(carro1);
		peaje.calcularPeaje(carro1);
		Carro carro2 = new Carro("QWE-543");
		peaje.añadirVehiculo(carro2);
		peaje.calcularPeaje(carro2);
		peaje.imprimir();
		
		System.out.println();
		Persona persona = new Persona("Dany","Barre","05/5/1999","0259412474");
		
		persona.asignarVehiculo(carro2);
		System.out.println("Toral de peaje :"+persona.nombre + " es "+persona.calcularPeajePersona());
	}

}
