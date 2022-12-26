package br.com.br.Eduardo.paises.entity;

import java.util.Date;

public class Paises {
	
	private Integer id;
	private String nome;
	private Date data;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	
}
