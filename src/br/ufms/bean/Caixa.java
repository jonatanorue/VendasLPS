package br.ufms.bean;

import java.util.Date;

import br.ufms.dao.daoCaixa;

public class Caixa {
	
	private Date horaAbertura;
	private Date horaFechamento;
	private double valorCaixaAbertura;
	private double valorCaixaFechamento;
	private Funcionario f;
	private daoCaixa dc;
	
	public Caixa(Funcionario f){
		this.f = f;	
	}
	
	public void abrirCaixa(double valorCaixaAbertura){
		Date d = new Date();
		this.setHoraAbertura(d);
		this.setValorCaixaAbertura(valorCaixaAbertura);
		this.setHoraFechamento(d);
		this.setValorCaixaFechamento(valorCaixaAbertura);
		
		dc = new daoCaixa(this, f);
		dc.salvar();
	}
	
	public void FecharCaixa(double valorCaixaFechamento){
		Date d = new Date();
		setHoraFechamento(d);
		this.setValorCaixaFechamento(valorCaixaFechamento);
		
		dc.atualizar(this);
	}
	
	
	public Date getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(Date horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Date getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(Date horaFechamento) {
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