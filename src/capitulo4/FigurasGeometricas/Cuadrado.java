package capitulo4.FigurasGeometricas;

public  class Cuadrado extends FiguraGeometrica{

	public double lado;

	public Cuadrado(double lado) {

		this.lado = lado;
	}

	@Override
	public double areaFigura() {
	
		return lado*lado;
	}

	@Override
	public double perimetro() {
	
		return (4*lado);
	}

}
