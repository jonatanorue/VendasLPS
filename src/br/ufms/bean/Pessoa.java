package br.ufms.bean;

public abstract class Pessoa {

	private String nome;
	
	public Pessoa(){
		this.nome = "";
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
