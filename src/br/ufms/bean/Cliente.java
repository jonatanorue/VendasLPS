package br.ufms.bean;

public abstract class Cliente extends Pessoa{
	
	private String telefone;
	private String endereco;
	
	public Cliente(){
		super();
		this.telefone = "";
		this.endereco = "";
	}
	
	public Cliente(String nome, String telefone, String endereco){
		super(nome);
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
