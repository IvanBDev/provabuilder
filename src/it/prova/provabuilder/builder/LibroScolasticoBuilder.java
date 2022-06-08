package it.prova.provabuilder.builder;

import it.prova.provabuilder.model.LibroScolastico;

public class LibroScolasticoBuilder extends LibroScolastico{
	
	/*private Long id;
	private String titolo;
	private String materia;
	private String nomeAutore;
	private Integer numeroPagine;*/
	
	private LibroScolasticoBuilder(Long id) {
		this.id = id;
	}
	
	public static LibroScolasticoBuilder newBuilder(Long id) {
		return new LibroScolasticoBuilder(id);
	}
	
	public LibroScolasticoBuilder titolo(String titolo) {
		this.titolo = titolo;
		return this;
	}
	
	public LibroScolasticoBuilder materia(String materia) {
		this.materia = materia;
		return this;
	}
	
	public LibroScolasticoBuilder nomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
		return this;
	}
	
	public LibroScolasticoBuilder numeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
		return this;
	}
	
	public LibroScolastico build() {
		return new LibroScolastico(id, titolo, materia, nomeAutore, numeroPagine);
	}
	
}
