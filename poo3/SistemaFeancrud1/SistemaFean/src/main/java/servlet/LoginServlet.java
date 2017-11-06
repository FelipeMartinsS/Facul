package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fean.si.poo3.controller.AlunoController;



/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/loginlervlet1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AlunoController alunoController = new AlunoController();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		printWriter.print( "Happy Learning!");
		String matricula = request.getParameter("matricula");
		String senha = request.getParameter("senha");
		String nome = alunoController.verificarMatriculaESenha(matricula, senha);
		if(nome.length()>0) {
			printWriter.print("Matricula ou Senha incorreta!");
		}else {
		printWriter.print("Bem-vindo" + nome);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
