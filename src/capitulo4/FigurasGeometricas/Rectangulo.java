package capitulo4.FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica {

	
	public double base, altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double areaFigura() {
		
		return base*altura;
	}

	@Override
	public double perimetro() {
		
		return (2*base) + (2*altura);
	}

	public void imprimir() {
		System.out.println("base=" + base + " altura=" + altura ); 
	}
	
	
	
	

}
