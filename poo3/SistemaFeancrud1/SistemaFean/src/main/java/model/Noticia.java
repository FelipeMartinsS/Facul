package model;

public class Noticia {
	
	
	private int id;
	private String titulo;
	private String textoCompleto;
	
	public Noticia(){
		
	}
public Noticia(int id, String titulo, String textoCompleto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.textoCompleto = textoCompleto;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTextoCompleto() {
		return textoCompleto;
	}
	public void setTextoCompleto(String textoCompleto) {
		this.textoCompleto = textoCompleto;
	}
	
	
	



}
