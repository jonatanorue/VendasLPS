package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.ufms.bean.Cliente;
import br.ufms.bean.Funcionario;
import br.ufms.bean.Venda;

public class daoVenda {
	
	private final Connection connection;
	private Venda v;
	private Funcionario f;
	private Cliente c;
	
	public daoVenda(Venda v, Funcionario f, Cliente c){
		connection = new ConnectionFactory().getConnection();
		this.v = v;	
		this.f = f;
		this.c = c;
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
