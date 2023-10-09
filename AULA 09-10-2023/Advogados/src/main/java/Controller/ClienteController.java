package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;

/**
 * Servlet implementation class ClienteController
 */

@WebServlet({"/ClienteController","/novocliente"}) // rota para chamar os outros. Tomcat nove já vem com a rota

public class ClienteController extends HttpServlet { //chamar a classe
	
	
	Cliente cli= new Cliente();
	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String acao = request.getServletPath();
		if (acao.equals ("/novocliente")) {
			 EnviaDados(request,response);
		} 
	}
	
	protected void EnviaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //classe
		 cli.setIdcliente(Integer.parseInt (request.getParameter("idcliente"))); // request = requisição, Integer.paserInt para modificar letra pra numero, conversor.
		 cli.setNome(request.getParameter("nome"));
		 cli.setTelefone(request.getParameter("telefone"));
		 
		 PrintWriter pw = response.getWriter();
		 pw.println (cli.getNome());
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
