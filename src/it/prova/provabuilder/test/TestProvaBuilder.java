package it.prova.provabuilder.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.provabuilder.builder.LibroScolasticoBuilder;
import it.prova.provabuilder.model.LibroScolastico;

public class TestProvaBuilder {
	public static void main(String[] args) {
		
		List<LibroScolastico> libriDiScuola = new ArrayList<LibroScolastico>();
			
		LibroScolastico libroDiMatematica = LibroScolasticoBuilder.newBuilder(1l)
				.titolo("Big Number")
				.materia("Matematica")
				.nomeAutore("Antonio Antonelli")
				.numeroPagine(623)
				.build();
		LibroScolastico libroDiItaliano = LibroScolasticoBuilder.newBuilder(2l)
				.titolo("Big Letters")
				.materia("Italiano")
				.nomeAutore("Ornella Calisti")
				.numeroPagine(583)
				.build();
		LibroScolastico libroDiInglese = LibroScolasticoBuilder.newBuilder(3l)
				.titolo("Shish")
				.materia("Inglese")
				.nomeAutore("Matteo Renzi")
				.numeroPagine(450)
				.build();
		
		libriDiScuola.add(libroDiItaliano);
		libriDiScuola.add(libroDiMatematica);
		libriDiScuola.add(libroDiInglese);
		
		libriDiScuola.forEach(items -> System.out.println(items));
		
	}
}
