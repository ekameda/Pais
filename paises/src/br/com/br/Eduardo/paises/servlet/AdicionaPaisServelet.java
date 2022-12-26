package br.com.br.Eduardo.paises.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.br.Eduardo.paises.entity.Paises;

@WebServlet("/PaisServ")
public class AdicionaPaisServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomePais = request.getParameter("pais");
		PrintWriter out = response.getWriter();
		Paises pais = new Paises();
		pais.setNome(nomePais);
		
		BancoBase db = new BancoBase();
		db.adicionar(pais);	
		
		out.println("<html><body>Pais : " + nomePais + " Cadastrado com Sucesso!!!</body></html>");
		System.out.println("Console: " + nomePais + " Cadastrando Novo Pais");
	}

}
