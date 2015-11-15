package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.ufms.bean.Cliente;
import br.ufms.bean.Funcionario;
import br.ufms.bean.ItemProduto;
import br.ufms.bean.Venda;

public class daoVenda {
	
	private final Connection connection;
	private Venda v;
	private Funcionario f;
	private Cliente c;
	private ArrayList<ItemProduto> listaP;
	
	public daoVenda(Venda v, Funcionario f, Cliente c, ArrayList<ItemProduto> listaP){
		connection = new ConnectionFactory().getConnection();
		this.v = v;	
		this.f = f;
		this.c = c;
		this.listaP = listaP;
	}
	
	public boolean salvar (){
		try {
			
			String sqlInsert = "INSERT INTO Venda (Funcionario_idFuncionario, Cliente_idCliente, dataVenda, horaVenda, valorVenda, tipoPagamento, valorPago) VALUES(?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sqlInsert);
			ps.setInt(1, f.getCodigoFuncionario());
			ps.setInt(2, c.getCodigoCliente());
			ps.setString(3, v.getDataVenda());
			ps.setString(4, v.getHoraVenda());
			ps.setDouble(5, v.getValorVenda());
			ps.setString(6, v.getTipoPagamento());
			ps.setDouble(7, v.getValorPago());
			
			ps.execute();
			
			daoItemProduto ip = new daoItemProduto(listaP, c.getCodigoCliente(), this.getId(), v.getDataVenda());
			ip.salvar();
			
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public int getId(){
		try {
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT (idVenda) FROM Venda where horaVenda = '" + v.getDataVenda() + "' and horaVenda = '" + v.getHoraVenda() + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			return rs.getInt("idVenda");
				
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
