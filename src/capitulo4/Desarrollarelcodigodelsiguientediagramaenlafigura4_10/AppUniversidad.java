package capitulo4.Desarrollarelcodigodelsiguientediagramaenlafigura4_10;

public class AppUniversidad {

	public static void main(String[] args) {
		
		Estudiante estu =new Estudiante("Juan", "Espejo", "TICS", 5);
		estu.imprimir();
		
		System.out.println();
		Profesor pro =new Profesor("Jose", "Colon", "TICS", "5");
		pro.imprimir();

	}

}
