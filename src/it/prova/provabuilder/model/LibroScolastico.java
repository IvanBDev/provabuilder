package it.prova.provabuilder.model;

public class LibroScolastico {
	
	protected Long id;
	protected String titolo;
	protected String materia;
	protected String nomeAutore;
	protected Integer numeroPagine;
	
	public LibroScolastico(Long id, String titolo, String materia, String nomeAutore, Integer numeroPagine) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.materia = materia;
		this.nomeAutore = nomeAutore;
		this.numeroPagine = numeroPagine;
	}

	public LibroScolastico() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getNomeAutore() {
		return nomeAutore;
	}

	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "[titolo=" + titolo + ", materia=" + materia + ", nomeAutore=" + nomeAutore
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
}
