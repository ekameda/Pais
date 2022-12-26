package br.com.br.Eduardo.paises.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoPaisServlet
 */
@WebServlet("/novoPais")
public class MostraPaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Console: Cadastro empresa");
		String nomePais = request.getParameter("pais");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Pais "+nomePais+" Cadastrado com Sucesso!!!!!!!</body/</html>");
	}

}
