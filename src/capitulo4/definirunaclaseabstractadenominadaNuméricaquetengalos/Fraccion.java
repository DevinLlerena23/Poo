package capitulo4.definirunaclaseabstractadenominadaNuméricaquetengalos;

public class Fraccion extends Numerica {
	
	public int num1,num2;
	
	public Fraccion(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public String toString() {
	
		return num1+"/"+num2;
	}

	@Override
	public boolean equals(Object ob) {
		
		  if (this == ob){
	            return true;
	        }
	        if(ob == null || getClass() != ob.getClass()){
	            return false;
	        }
	        Fraccion fraccion = (Fraccion) ob;
	        
		
		return num1==fraccion.num1 && num2==fraccion.num2;
	}

	@Override
	public Numerica sumar(Numerica numero) {
		
		 if (numero instanceof Fraccion){
	            Fraccion var3 = (Fraccion) numero;
	            return new Fraccion(this.num1 * var3.num2 + var3.num1 * this.num2, this.num2 * var3.num2);
	        } else{
	            System.out.println("Deben ser tipos iguales");
	        }
	        return numero;
	    }
		
	

	@Override
	public Numerica restar(Numerica numero) {
		
		if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.num1 * var3.num2 - var3.num1 * this.num2, this.num2 * var3.num2);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }
	
	

	@Override
	public Numerica multiplicar(Numerica numero) {
		
		if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.num1 * var3.num1, this.num2 * var3.num2);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }
	

	@Override
	public Numerica dividir(Numerica numero) {
		if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.num1 * var3.num2, this.num2 * var3.num1);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }
		
}
