package br.ufms.bean;

import java.util.Date;

import br.ufms.dao.daoCaixa;

public class Caixa {
	
	private String horaAbertura;
	private String horaFechamento;
	private double valorCaixaAbertura;
	private double valorCaixaFechamento;
	private Funcionario f;
	private daoCaixa dc;
	
	public Caixa(Funcionario f){
		this.f = f;	
	}
	
	public void abrirCaixa(double valorCaixaAbertura){
		Date d = new Date();
		this.setHoraAbertura( d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
		this.setValorCaixaAbertura(valorCaixaAbertura);
		this.setHoraFechamento(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
		this.setValorCaixaFechamento(valorCaixaAbertura);
		
		dc = new daoCaixa(this, f);
		dc.salvar();
	}
	
	public void FecharCaixa(double valorCaixaFechamento){
		Date d = new Date();
		setHoraFechamento( d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
		this.setValorCaixaFechamento(valorCaixaFechamento);
		
		dc.atualizar(this);
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
