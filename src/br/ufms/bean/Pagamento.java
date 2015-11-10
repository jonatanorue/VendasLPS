package br.ufms.bean;

public abstract class Pagamento {
	
	private double valorPago;
	private String tipo;
	
	public Pagamento(){
		this.valorPago= 0.0;
		this.tipo = "";
	}
	
	public Pagamento(double valorPago, String tipo){
		this.valorPago = valorPago;
		this.tipo = tipo;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
