package capitulo5.clasePeajeyjerarquíadeherenciadevehículos;

import java.util.*;

public class Peaje {
	
	String nombre;
	String departamento;
	Vector vehiculos;
	int totalPeaje=0;
	static int totalCamiones=0;
	static int totalMotos=0;
	static int totalCarros=0;
	
	public Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		vehiculos=new Vector();
	}
	
	
	public String getNomber() {
		return nombre;
	}
	
	@SuppressWarnings("unused")
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	@SuppressWarnings("unused")
	private void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	
	@SuppressWarnings("unchecked")
	public void añadirVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public int calcularPeaje(Vehiculo vehiculo) {
		if(vehiculo instanceof Carro) {
			totalCarros++;
			totalPeaje+=Carro.valorPeaje;
			return Carro.valorPeaje;
		} else if(vehiculo instanceof Moto) {
			totalMotos++;
			totalPeaje+=Moto.valorPeaje;
			return Moto.valorPeaje;
		} else if(vehiculo instanceof Camion) {
			totalCamiones++;
			Camion camion=(Camion) vehiculo;
			totalPeaje+=camion.numeroEjes*camion.valorPeaje;
			return camion.numeroEjes*camion.valorPeaje;
		} else return -1;
	}
	
	public void imprimir() {
		System.out.println("Peaje = " + getNomber());
		System.out.println("Ubicación ="  + getDepartamento());
		System.out.println("Total de carros = " + totalCarros);
		System.out.println("Total de motos = " + totalMotos);
		System.out.println("Total de camiones = " + totalCamiones);
		int totalVehículos = totalCarros + totalMotos +totalCamiones;
		System.out.println("Total de vehículos = " + totalVehículos);
		System.out.println("Dinero total = $" + totalPeaje);
		}


}
