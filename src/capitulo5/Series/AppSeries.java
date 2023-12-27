package capitulo5.Series;

import java.util.Vector;

public class AppSeries {

	public static void main(String[] args) {
		Vector serie =new Vector();
		
		Series serie1=new Series("Bob esponja", "Comedia", "EEUU", 2004);
		Series serie2=new Series("Samurai Jack", "Accion", "EEUU", 2001);
		Series serie3=new Series("Coraje el perro cobarde", "Horro", "EEUU", 1999);
	
		Seriespro series= new Seriespro();
		series.agergarSerie(serie1);
		series.agergarSerie(serie2);
		series.agergarSerie(serie3);
		
		series.agergarSerie(serie1);
		series.buscarSerietitu("Bob esponja");
		series.buscarSerieGenero("Comedia");
		series.buscarSeriePais("EEUU");
		
		series.eliminarSeries(serie3);

	}

}
