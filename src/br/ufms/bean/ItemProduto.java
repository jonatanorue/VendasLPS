package br.ufms.bean;

import java.util.ArrayList;

public abstract class ItemProduto {

	private int qtdProdutos;
	
	
	public ItemProduto(){
		this.qtdProdutos = 0;
	}
	
	public void incluirItem(int codigoProduto, int qtd){	
		qtdProdutos += qtd;
		
		
	 }
	
	public void editarItem(){
		
	}
	
	public void excluirItem(){
		
	}
	

	
	

}
