package capitulo4.jerarquíadeclasesdeanimales;

public class Perro extends Canido{

	@Override
	public String getSonido() {
		
		return "Ladrido";
	}

	@Override
	public String getAlimentos() {
		
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		
		return "Domestico";
	}

	@Override
	public String getNombreCientifico() {
		
		return "Canis lupues familiaris";

	}

}
