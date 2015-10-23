package br.ufms.bean;

public class ClienteFisico extends Cliente{
	
	private String cpf;
	
	public ClienteFisico(){
		super();
		this.cpf = "";
	}
	
	public ClienteFisico(String nome, String telefone, String endereco, String cpf){
		super(nome, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
