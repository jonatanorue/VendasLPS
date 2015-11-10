package br.ufms.bean;

public abstract class Cliente {
	
	private String telefone;
	private String endereco;
	private String nome;
	private String cpf_cnpj;
	private String tipoCliente;
	
	public Cliente(){
		this.telefone = "";
		this.endereco = "";
		this.nome = "";
		this.cpf_cnpj = "";
		this.tipoCliente = "";
	}
	
	public Cliente(String nome, String telefone, String endereco, String cpf_cnpj, String tipoCliente){
		this.telefone = telefone;
		this.endereco = endereco;
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.tipoCliente = tipoCliente;
	}
	
	public void cadastrarCliente(){
		
	}
	
	public void buscarCliente(){
		
	}
	
	public abstract void excluirCliente();
	
	public abstract void editarCliente();

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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
