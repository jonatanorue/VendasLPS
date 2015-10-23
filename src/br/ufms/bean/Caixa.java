package br.ufms.bean;

public class Caixa {
	
	private String horaAbertura;
	private String horaFechamento;
	private double valorCaixaAbertura;
	private double valorCaixaFechamento;
	
	public Caixa(){
		this.horaAbertura = "";
		this.horaFechamento = "";
		this.valorCaixaAbertura = 0.0;
		this.valorCaixaFechamento = 0.0;
	}
	
	public Caixa(String horaAbertura, String horaFechamento, double valorCaixaAbertura, double valorCaixaFechamento){
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.valorCaixaAbertura = valorCaixaAbertura;
		this.valorCaixaFechamento = valorCaixaFechamento;
	}
	
	public String getHoraAbertura() {
		return horaAbertura;
	}
	public void setHoraAbertura(String horaAbertura) {
		this.horaAbertura = horaAbertura;
	}
	public String getHoraFechamento() {
		return horaFechamento;
	}
	public void setHoraFechamento(String horaFechamento) {
		this.horaFechamento = horaFechamento;
	}
	public double getValorCaixaAbertura() {
		return valorCaixaAbertura;
	}
	public void setValorCaixaAbertura(double valorCaixaAbertura) {
		this.valorCaixaAbertura = valorCaixaAbertura;
	}
	public double getValorCaixaFechamento() {
		return valorCaixaFechamento;
	}
	public void setValorCaixaFechamento(double valorCaixaFechamento) {
		this.valorCaixaFechamento = valorCaixaFechamento;
	}
	
	

}
