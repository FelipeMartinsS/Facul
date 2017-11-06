package br.com.fean.si.poo3.service;

import java.util.Map;

import model.Noticia;

public class NoticiaService {

	public String insertarNoticia(String titulo, String textoCompleto, Map<Noticia, Integer> noticias) {

		int id = 1;

		Noticia noticia = new Noticia(id, titulo, textoCompleto);
		noticias.put(noticia, id);
		id++;

		return "Notícia inserido com sucesso!";

	}

}
