package br.ufms.bean;

public abstract class Pagamento {
	
	private double valorPago;
	
	public Pagamento(){
		this.valorPago= 0.0;
	}
	
	public Pagamento(double valorPago){
		this.valorPago = valorPago;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	

}
