package br.com.br.Eduardo.paises.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	
@WebServlet(urlPatterns="/ola")
public class OlaMundo extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws IOException {
	
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ola Mundo, Este e o Servlets Apresentado ...");;
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Teste Console OLA - Ola Mundo, Este e o Servlets Presentado ... ");
		
	}

}
