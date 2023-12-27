package capitulo4.claseMédicoconjerarquíadeherencia;

import java.util.*;

public class AppMedicina {

	public static void main(String[] args) {
		
		Vector listaMedicos=new Vector();
		Medico medico1 =new Medico();
		listaMedicos.add(medico1);
		Ortopedista ortope1 =new Ortopedista();
		listaMedicos.add(ortope1);
		Pediatra pedia1 = new Pediatra();
		listaMedicos.add(pedia1);
		
		for(int i=0;i<listaMedicos.size();i++) {
			Medico a= (Medico) listaMedicos.elementAt(i);
			if(a instanceof Ortopedista) {

				System.out.println("El objeto en el indice" + i +" es de la clase ortopedista");
				continue;
				
			}
			if(a instanceof Pediatra) {

				System.out.println("El objeto en el indice" + i + " es de la clase pediatra");
				continue;
				
			}
			if(a instanceof Medico) {

				System.out.println("El objeto en el indice " + i + " es de la clase medico");
				continue;
				
			}
			
		}

	}

}
