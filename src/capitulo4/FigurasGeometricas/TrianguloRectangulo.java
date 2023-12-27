package capitulo4.FigurasGeometricas;

public class TrianguloRectangulo extends Triangulo{

	public TrianguloRectangulo(double base, double altura) {
		super(base, altura);
		
	}
	
	 public double areaTrianguloRec(){
	        return (base * altura) / 2;
	    }
	
	public double perimetroTriangul() {
		return (base*altura+calcularHipotenusa());
	}
	
	double calcularHipotenusa() {
		
	    return Math.pow(base*base + altura*altura, 0.5);
	}
	
	
	 public void imprimir(){
	        System.out.println("Área: " + areaTrianguloRec() + " Perímetro del Triángulo Rectángulo: " +
	                perimetroTriangul());
	 }
}
