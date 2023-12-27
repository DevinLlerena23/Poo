package capitulo4.jerarquíadeclasesdeanimales;

public class Leon extends Felino{

	@Override
	public String getSonido() {
		
		return "Rugido";
	}

	@Override
	public String getAlimentos() {
	
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		
		return "Praderas";
	}

	@Override
	public String getNombreCientifico() {
		
		return "Panthera leo";
	}

}
