package capitulo4.FigurasGeometricas;

public class Triangulo extends FiguraGeometrica {

	public double base,altura;
	
	public Triangulo(double base,double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double areaFigura() {
		
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
	
		return base+base+base;
	}

	
	public void imprimir() {
		System.out.println("area=" + areaFigura() + " perimetro=" + perimetro() ); 
	}
	
	
	

}
