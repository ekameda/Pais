package br.com.br.Eduardo.paises.servlet;

import java.util.ArrayList;
import java.util.List;

import br.com.br.Eduardo.paises.entity.Paises;

public class BancoBase{

	private static List<Paises> listaPaises = new ArrayList<>();	
	static {
		Paises pais = new Paises();
		pais.setNome("Brasil :1 Adicionado ao carregar");
		listaPaises.add(pais);
		Paises pais2 = new Paises();
		pais2.setNome("Peru :2 Adicionado ao carregar");
		listaPaises.add(pais2);		
	}

	public void adicionar(Paises nomePais) {
		listaPaises.add(nomePais);
	}

	public List<Paises> getpais(){
		return BancoBase.listaPaises;
	}
	
		
}
