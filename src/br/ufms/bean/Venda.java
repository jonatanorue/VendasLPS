package br.ufms.bean;

public class Venda {
	
	private int codigoVenda;
	private String dataVenda;
	private String horaVenda;
	private double valorVenda;
	private Pagamento p;
	
	public Venda(){
		this.codigoVenda = 0;
		this.dataVenda = "";
		this.horaVenda = "";
		this.valorVenda = 0.0;
	}
	
	public Venda(int codigoVenda, String dataVenda, String horaVenda, double valorVenda){
		this.codigoVenda = codigoVenda;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.valorVenda = valorVenda;
	}
	
	public void iniciarVenda(){
		// instanciar item venda e fazer a lista de produtos
		
	}
		
	
	public void imprimirNota(){
		//imprimir lista de produtos
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
