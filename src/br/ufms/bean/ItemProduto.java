package br.ufms.bean;

import java.util.ArrayList;

import br.ufms.dao.daoItemProduto;

public class ItemProduto {

	private int qtdProdutos;
	private Produto p;
	
	public ItemProduto(){
		this.qtdProdutos = 0;
	}
	
	public void incluirItem(int codigoProduto, int qtd){
		this.qtdProdutos = qtd;
		p = new Produto();
		p.setCodigo(codigoProduto);
		// criar função em produto que constroi o objeto produto apartir do codigo de barras para nossa lista
	 }
	
	public void editarItem(){
		
	}
	
	public void excluirItem(){
		
	}
	
	public double getValorItem(){
		if(this.qtdProdutos > 10){
			return this.qtdProdutos*p.getPrecoVendaAtacado();
		}
		return this.qtdProdutos*p.getPrecoVendaVarejo();
	}
	
	public void salvarItem(){
		daoItemProduto di = new daoItemProduto();
	}
	
	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	
	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
	}

}
