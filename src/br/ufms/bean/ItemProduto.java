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
		this.p = p.contruirObjeto();
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
