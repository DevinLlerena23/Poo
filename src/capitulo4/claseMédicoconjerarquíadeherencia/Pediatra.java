package capitulo4.claseMédicoconjerarquíadeherencia;

public class Pediatra extends Medico {
	enum tipologia {NEUROLOGO, PSICOLOGO};
	tipologia tipo;
	
	public tipologia getTipologia() {
		return tipo;
	}
	
	public void setTipologia(tipologia tipo) {
		this.tipo=tipo;
	}
	

}
