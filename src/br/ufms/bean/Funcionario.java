package br.ufms.bean;

public abstract class Funcionario{
	
	private int codigo;
	private String cpf;
	private String login;
	private String senha;
	private Caixa c;
	private String nome;
	
	public Funcionario(){
		this.codigo = 0;
		this.cpf = "";
		this.login = "";
		this.senha = "";
		this.nome = "";
	}
	
	public Funcionario(String nome, int codigo, String cpf, String login, String senha){
		this.codigo = codigo;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	public void cadastrarFuncionario(){
		
	}
	
	public void buscarFuncionario(){
		
	}
	
	public abstract void excluirFuncionario();
	
	public abstract void editarFuncionario();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
