package br.com.fean.si.poo3.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Aluno;



@Controller
public class AlunoController {

 @RequestMapping(value = "/aluno", method = RequestMethod.GET) 
 public ModelAndView aluno() {
  return new ModelAndView("aluno", "command", new Aluno());
 }

 @RequestMapping(value = "/addAluno", method = RequestMethod.POST)
 public String adicionarAluno(
  @ModelAttribute("SpringWeb") Aluno aluno, ModelMap model, HttpServletRequest request) {
		
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

   model.addAttribute("nome", aluno.getNome());
   model.addAttribute("cpf", aluno.getCpf());
   model.addAttribute("descricao", aluno.getDescricao());
   model.addAttribute("telefone", aluno.getTelefone());
   model.addAttribute("endereco", aluno.getEndereco());
   model.addAttribute("rg", aluno.getRg());
   model.addAttribute("dataNascimento", sdf.format(aluno.getDataNascimento()));
   model.addAttribute("profissao", aluno.getProfissao());
		

   List<Aluno> alunos = (List<Aluno>) request.getSession().getAttribute("alunos");
   if (alunos == null) {
      alunos = new ArrayList<Aluno>();
   } 
   alunos.add(aluno);
   request.getSession().setAttribute("alunos", alunos);
		
   return "exibeAluno";
}
	
	@RequestMapping(value = "/listaAlunos", method = RequestMethod.GET)
	public String listaralunos(
  @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {
		
    List<Aluno> alunos = (List<Aluno>) request.getAttribute("alunos");
		
    model.addAttribute("alunos", alunos);	
		
		
    return "listaAlunos";
   }

}
