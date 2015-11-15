package br.ufms.bean;

import br.ufms.dao.daoCliente;
import br.ufms.dao.daoFuncionario;

public class Funcionario{

	private String cpf;
	private String login;
	private String senha;
	private String nome;
	private daoFuncionario df;
	
	public Funcionario(){
		this.cpf = "";
		this.login = "";
		this.senha = "";
		this.nome = "";
		
		this.df = new daoFuncionario(this);
	}
	
	public Funcionario(String nome, String cpf, String login, String senha){
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		
		this.df = new daoFuncionario(this);
	}
	
	public void cadastrarFuncionario(){
		
		if(df.salvar()){
			System.out.println("Funcionario inserido com sucesso!");
		}else{
			System.out.println("Funcionario já cadastrado!");
		}
		
	}
	
	public void buscarFuncionario(){
		
		if(df.buscar()){
			System.out.println("Funcionario existente!");
		}else{
			System.out.println("Funcionario não encontrado!");
		}
		
	}
	
	public void excluirFuncionario(){
		
		if(df.excluir()){
			System.out.println("Funcionario excluído com sucesso!");
		}else{
			System.out.println("Funcionario não existente!");
		}
		
	}
	
	public void editarFuncionario(){
		
	}
	
	public int getCodigoFuncionario(){
		return df.getId();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public daoFuncionario getDf() {
		return df;
	}

	public void setDf(daoFuncionario df) {
		this.df = df;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
