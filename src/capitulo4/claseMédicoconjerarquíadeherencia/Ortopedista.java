package capitulo4.claseMédicoconjerarquíadeherencia;

public class Ortopedista extends Medico {
	enum tipologia {MAXILOFACIAL,PEDIATRICA};
	tipologia tipo;
	
	public tipologia getTipo() {
		return tipo;
	}
	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
