package capitulo5.claseCírculoylasPunto;

public class Circulo {
	Punto centro;
	int radio;
	
	public Circulo(int x,int y,int radio) {
		centro=new Punto(x,y);
	}
	
	int getRadio() {
		return radio;
	}
	
	void setRadio(int radio) {
		this.radio=radio;
	}
	
	
	void imprimir() {
		System.out.println("El centro del circulo es la coordenada ( " + centro.getX()+","+centro.getY()+") y tiene un radio = " + radio);
	}

}
