package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import br.ufms.bean.ItemProduto;
import br.ufms.bean.Produto;

public class daoItemProduto {
	
	private final Connection connection;
	private int codigoVenda;
	private int codigoCliente;
	private ArrayList<ItemProduto> listaP;
	private String dataVenda;
	
	
	public daoItemProduto (ArrayList<ItemProduto> listaP, int codigoVenda, int codigoCliente, String dataVenda){
		connection = new ConnectionFactory().getConnection();
		this.listaP = listaP;
		this.codigoVenda = codigoVenda;
		this.codigoCliente = codigoCliente;
		this.dataVenda = dataVenda;
	}
	
	public boolean salvar (){
		try {
			
			for(int i=0; i < listaP.size(); i++){
				String sqlInsert = "INSERT INTO ItemProduto (Produto_idProduto, Venda_Cliente_idCliente, dataVenda, Venda_idVenda, qtdProdutos, valorTotalitem) VALUES(?, ?, ?, ?, ?, ?);";
				PreparedStatement ps = connection.prepareStatement(sqlInsert);
				ps.setInt(1, listaP.get(i).getP().getCodigo());
				ps.setInt(2, getCodigoCliente());
				ps.setString(3, getDataVenda());
				ps.setDouble(4, getCodigoVenda());
				ps.setDouble(5, listaP.get(i).getQtdProdutos());
				ps.setDouble(6, listaP.get(i).getValorItem());
				
				ps.execute();
				ps.close();
			}
			
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Connection getConnection() {
		return connection;
	}
}
