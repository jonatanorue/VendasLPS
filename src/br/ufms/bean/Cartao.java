package br.ufms.bean;

public abstract class Cartao extends Pagamento{

	public Cartao(){
		super();
	}
	
	public Cartao(double valorPago){
		super(valorPago);
	}
	
}
