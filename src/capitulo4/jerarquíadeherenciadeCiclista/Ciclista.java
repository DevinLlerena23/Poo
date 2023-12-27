package capitulo4.jerarquíadeherenciadeCiclista;

public abstract class Ciclista {
	private int identificador;
	private String nombre;
	private int tiempoAcumulado=0;
	
	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	abstract String imrpimirTipo();

	protected int getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	protected void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	
	protected int getPosicionGeneral(int posicionGeneral) {
		return posicionGeneral;
	}
	
	protected void setPosicionGeneral(int posicionGeneral) {
		posicionGeneral=posicionGeneral;
	}

	public void imprimir() {
		System.out.println("identificador=" + identificador + " nombre=" + nombre + " tiempoAcumulado="
				+ tiempoAcumulado );
	}
	
	
	
	
	
	
	

}
