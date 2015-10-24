package br.ufms.bean;

public class Dinheiro extends Pagamento{
	
	private double troco;
	
	public Dinheiro(double valorPago, double valorVenda){
		super(valorPago);
		setTroco(valorPago-valorVenda);
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	
	
}
