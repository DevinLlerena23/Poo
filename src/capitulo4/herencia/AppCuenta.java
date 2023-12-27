package capitulo4.herencia;

import java.util.*;

public class AppCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1=new Cuenta(10000, (float) 0.10);
		
		cuenta1.consignar(50000);
		cuenta1.retirar(7522);
		cuenta1.extractoMensual();
		cuenta1.imprimir();
		
	}

}