package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.ufms.bean.Produto;

public class daoItemProduto {
	
	private final Connection connection;
	private Produto p;
	
	public daoItemProduto (Produto p){
		connection = new ConnectionFactory().getConnection();
		this.p = p;
	}
	
	public boolean salvar (){
		try {
			
			String sqlInsert = "INSERT INTO Venda (Funcionario_idFuncionario, Cliente_idCliente, dataVenda, horaVenda, valorVenda, tipoPagamento, valorPago) VALUES(?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sqlInsert);
			//ps.setSInt(1, f.getCodigoFuncionario());
			ps.setInt(2, c.getCodigoCliente());
			ps.setString(3, v.getDataVenda());
			ps.setString(4, v.getHoraVenda());
			ps.setDouble(5, v.getValorVenda());
			ps.setString(6, v.getTipoPagamento());
			ps.setDouble(7, v.getValorPago());
			
			ps.execute();
			
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
