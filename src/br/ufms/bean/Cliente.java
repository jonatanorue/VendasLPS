package br.ufms.bean;

import br.ufms.dao.daoCliente;

public class Cliente {
	
	private String telefone;
	private String endereco;
	private String nome;
	private String cpf_cnpj;
	private String tipoCliente;
	private daoCliente dc;
	
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
		
		this.dc = new daoCliente(this);
	}

	public void cadastrarCliente() {

		if(dc.salvar()){
			System.out.println("Cliente inserido com sucesso!");
		}else{
			System.out.println("Cliente já cadastrado!");
		}
		
	}
	
	public void buscarCliente(){
		
		if(dc.buscar()){
			System.out.println("Cliente existente!");
		}else{
			System.out.println("Cliente não encontrado!");
		}
	}
	
	public void excluirCliente(){
		
		if(dc.excluir()){
			System.out.println("Cliente excluído com sucesso!");
		}else{
			System.out.println("Cliente não existente!");
		}
		
	}
	
	public int getCodigoCliente(){
		return dc.getId();
	}
	
	public void editarCliente(){
		
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
