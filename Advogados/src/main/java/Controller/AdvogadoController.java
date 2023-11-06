package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Advogado;
import model.AdvogadoDao;

/**
 * Servlet implementation class AdvogadoController
 */
@WebServlet({ "/AdvogadoController", "/novacausa", "/buscacausa" })

public class AdvogadoController extends HttpServlet {

	Advogado adv = new Advogado();
	AdvogadoDao daoadv = new AdvogadoDao();

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdvogadoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String acao = request.getServletPath();
		if (acao.equals("/novacausa")) {
			EnviaDadosAdv(request, response);
		} else if (acao.equals("/buscacausa")) {
			BuscaDadosAdv(request, response);
		}
	}

	protected void EnviaDadosAdv(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // classe
		adv.setOab(Integer.parseInt(request.getParameter("oab")));
		adv.setNome(request.getParameter("nome"));
		adv.setTelefone(request.getParameter("telefone"));
		adv.setTipocausas(request.getParameter("tipocausas"));
		;
		daoadv.Salvar(adv);
	}

	protected void BuscaDadosAdv(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Advogado> lista = daoadv.Listar();
		request.setAttribute("advogado", lista);
		RequestDispatcher rd = request.getRequestDispatcher("RelAdvogado.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
