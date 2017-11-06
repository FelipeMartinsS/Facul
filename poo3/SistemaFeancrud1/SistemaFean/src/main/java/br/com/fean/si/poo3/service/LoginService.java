package br.com.fean.si.poo3.service;

import java.util.HashMap;
import java.util.Map;

import model.Aluno;

public class LoginService {
Map<String, Aluno> listaAluno = new HashMap<String, Aluno>();
	
	public String verificarMatriculaESenha(String matricula, String senha) {
		if(listaAluno.containsKey(matricula)) {
			if(listaAluno.get(matricula).getSenha()==senha) {
			return "true";
			}
		}else {
			return "false";
		}
		return listaAluno.get(matricula).getNome();
		
	}
}
