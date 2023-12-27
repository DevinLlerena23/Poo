package capitulo5.Series;

import java.util.Vector;



public class Seriespro {
	String titulo;
	Vector serie;
	boolean encontrada;
	
	public Seriespro() {
		serie=new Vector<>();
	}

	
	
	public void agergarSerie(Series nombre) {
		serie.add(nombre);
		
	}
	
	public void eliminarSeries(Series nombre) {
		serie.remove(nombre);
		while(serie.remove(nombre)) {}
		System.out.println("Nueva lista: ");
		for(int i=0;i<serie.size();i++) {
			Series serie1=(Series) serie.elementAt(i);
			serie1.imprimir();
		}
	}
	
	public void buscarSerietitu(String titulo) {
		for(int i=0;i<serie.size();i++) {
			Series series1=(Series) serie.elementAt(i);
			if(titulo.equals(series1.getTitulo())) {
				series1.imprimir();
				encontrada=true;
				break;
			}
		}
		if(!encontrada) {
			System.out.println("Serie no encontrda");
		}
	}
	
	public void buscarSerieGenero(String genero) {
		for(int i=0;i<serie.size();i++) {
			Series series1=(Series) serie.elementAt(i);
			if(genero.equals(series1.getGenero())) {
				series1.imprimir();
				encontrada=true;
			}
		}
		if(!encontrada) {
			System.out.println("Serie no encontrada");
		}
	}
	
	public void buscarSeriePais(String pais) {
		for(int i=0;i<serie.size();i++) {
			Series series1=(Series) serie.elementAt(i);
			if(pais.equals(series1.getPaisOrigen())) {
				series1.imprimir();
				encontrada=true;
			}
		}
		if(!encontrada) {
			System.out.println("Serie no encontrada");
		}
	}
	

}
