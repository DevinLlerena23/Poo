package capitulo4.jerarquíadeherenciadeCiclista;

public class AppEquipo {

	public static void main(String[] args) {
		
		Equipo equipo1 =new Equipo("SKY", "EEUU");
		Velocista velo1 =new Velocista(123979, "Gerainr", 320, 25);
		Escalador esca=new Escalador(123980, "Egan", 25,10);
		Contrarrelojista contr=new Contrarrelojista(123981, "Jonathan", 120);
		equipo1.añadirCiclista(velo1);
		equipo1.añadirCiclista(esca);
		equipo1.añadirCiclista(contr);
		
		velo1.setTiempoAcumulado(365);
		esca.setTiempoAcumulado(385);
		contr.setTiempoAcumulado(370);
		equipo1.calcularTotalTiempo();
		equipo1.imprimir();
		equipo1.listarEquipo();
	}

}
