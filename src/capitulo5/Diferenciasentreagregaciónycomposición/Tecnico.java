package capitulo5.Diferenciasentreagregaciónycomposición;

public class Tecnico extends Persona {
	
	int añosExperiencia;
	boolean esNacional;

	public Tecnico(String nomber, String apellidos, int edad,int añosExperiencia, boolean esNacional) {
		super(nomber, apellidos, edad);
		this.añosExperiencia=añosExperiencia;
		this.esNacional=esNacional;
	}

	@Override
	public String toString() {
		return "Tecnico [añosExperiencia=" + añosExperiencia + ", esNacional=" + esNacional + "]";
	}
	
	
	

}
