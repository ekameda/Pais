package br.com.br.Eduardo.paises.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.br.Eduardo.paises.entity.Paises;

@WebServlet("/listaPais")
public class ListaPaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BancoBase db = new BancoBase();		
		List<Paises> listaPaises = db.getpais();
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<ul>");		
		for (Paises paises: listaPaises) {
			out.println("<li>" +  paises.getNome() + "</li>");
		}		
		out.println("</ul>");
		out.println("</html></body>");

	}

}
