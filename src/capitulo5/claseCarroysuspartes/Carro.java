package capitulo5.claseCarroysuspartes;



public class Carro {
	Motor motor;
	Chasis chasis;
	Llanta[] llantas;
	Carroceria carroceria;
	
	public Carro(int volumen,tipoChasis clChasis,String color,tipoCarroceria clCarroceria,
			String marca , int diametro,int altura,int anchura) {
		motor=new Motor(volumen);
		chasis=new Chasis(clChasis);
		llantas=new Llanta[4];
		for(int i=0;i<llantas.length;i++) {
			
			llantas[i]=new Llanta(marca,diametro,altura,anchura);
			
		}
		carroceria=new Carroceria(color,clCarroceria);
		
	}
	void imprimir() {
		System.out.println("Datos del carro");
		System.out.println("Motor-Cilindros= "+motor.volumen + "Chasis-Tipo= "+chasis.tipo
				);
		System.out.println("Carroceria-tipo= " + carroceria.tipo +" Color= "+carroceria.color);
		System.out.println("Llantas-cantidad= "+llantas.length);
		
		for(int i=0;i<llantas.length; i++) {
			llantas[i].imprimir();
		}
	}
	
	
	
	
}
