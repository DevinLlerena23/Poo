package capitulo4.FigurasGeometricas;

public class Circulo extends FiguraGeometrica {
	
	public double radio;
	public Circulo(double radio) {
	
		this.radio = radio;
	}

	@Override
	public double areaFigura() {
		
		return Math.PI*(Math.pow(radio,2));
	}

	@Override
	public double perimetro() {
		
		return  2*Math.PI*radio;
	}

	public void imprimir() {
		System.out.println( "Area del circulo es:  "+ areaFigura() + "permitro: "+ perimetro()); 
	}
	
	
	
	

}
