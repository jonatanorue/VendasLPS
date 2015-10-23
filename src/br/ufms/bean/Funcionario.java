package br.ufms.bean;

public class Funcionario extends Pessoa{
	
	private int codigo;
	private String cpf;
	private String login;
	private String senha;
	
	public Funcionario(){
		super();
		this.codigo = 0;
		this.cpf = "";
		this.login = "";
		this.senha = "";
	}
	
	public Funcionario(String nome, int codigo, String cpf, String login, String senha){
		super(nome);
		this.codigo = codigo;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	
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
