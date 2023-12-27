package capitulo4.definirunaclaseabstractadenominadaNuméricaquetengalos;

public class Appnum {

    public static void main(String[] args) {
        
        Fraccion fra = new Fraccion(5, 2);
        Fraccion frac = new Fraccion(9, 3);
        
        System.out.println("Fra: " + fra.toString());
        System.out.println("Frac: " + frac.toString());
        System.out.println();
        
        System.out.println("Suma");
        System.out.println(fra.sumar(frac).toString());
        System.out.println();
        
        System.out.println("Resta");
        System.out.println(fra.restar(frac).toString());
        System.out.println();
        
        System.out.println("Multiplica");
        System.out.println(fra.multiplicar(frac).toString());
        System.out.println();
        
        System.out.println("Division");
        System.out.println(fra.dividir(frac).toString());
        
    }

}



