package br.ufms.bean;

public class Venda {
	
	private int codigoVenda;
	private String dataVenda;
	private String horaVenda;
	private double valorVenda;
	private String tipoPagamento;
	private double valorPago;
	
	public Venda(){
		this.codigoVenda = 0;
		this.dataVenda = "";
		this.horaVenda = "";
		this.valorVenda = 0.0;
		this.tipoPagamento = "";
		this.valorPago = 0.0;
	}
	
	public Venda(int codigoVenda, String dataVenda, String horaVenda, double valorVenda, String tipoPagamento, double valorPago){
		this.codigoVenda = codigoVenda;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.valorVenda = valorVenda;
		this.tipoPagamento = tipoPagamento;
		this.valorPago = valorPago;
	}
	
	public void iniciarVenda(){
		// instanciar item venda e fazer a lista de produtos
		
	}
	
	public void registrarPagamento(){
		
	}
	
	public void cancelarVenda(){
		
	}
	
	public void finalizarVenda(){
		
	}
	
	public void registrarVenda(){
		
	}
		
	public void imprimirNota(){
		//imprimir lista de produtos
	}
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public int getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	

}
