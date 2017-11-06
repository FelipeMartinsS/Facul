package br.com.fean.si.poo3.controller;

import java.util.HashMap;
import java.util.Map;

import br.com.fean.si.poo3.service.NoticiaService;
import model.Noticia;

public class NoticiaController{
	private static Map<Noticia, Integer> noticias = new HashMap<Noticia,Integer>();
	NoticiaService noticiaService = new NoticiaService();
	
	
		
	public String salvarNoticia(String titulo, String textoController) {
		
		return noticiaService.insertarNoticia(titulo, textoController, noticias);
	}
}
