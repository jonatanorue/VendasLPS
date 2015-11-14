package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import br.ufms.dao.ConnectionManager;
import br.ufms.bean.Produto;

public class daoProduto {

	/**
	 * @param args
	 */
	private final Connection connection;

	public daoProduto() {
		connection = new ConnectionFactory().getConnection();
	}

	public boolean inserir(Produto pr) {
		try {
			
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM produtos where idProduto = '" + pr.getCodigo() + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			if (rs.next()) {
				return false;
			}
			

			stmt.executeUpdate("INSERT INTO Produto VALUES('"
					+ pr.getDescricao() + "', '" + pr.getFabricante() + "',"
					+ pr.getPrecoVendaAtacado() + "', '"
					+ pr.getPrecoVendaVarejo() + "')");
			System.out.println("Inserida!");
					
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public boolean excluir(Produto pr) {
	
		try {
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM Produto where idProduto = '" + pr.getCodigo() + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			if (!rs.next()) {
				return false;
			}else{
			
				String sqlDelete = "DELETE FROM Produto WHERE idProduto = '" + pr.getCodigo() + "';";
				rs = stmt.executeQuery(sqlDelete);
				
				return true;
			}
	}catch (Exception e) {
		throw new RuntimeException(e);
	}
	}

	private void imprimeErro(String string, String message) {
		// TODO Auto-generated method stub

	}

	public Vector<Produto> buscar(int idCod) {

		Vector<Produto> resultados = new Vector<Produto>();
		ResultSet rs;
		try {
			
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM produtos where idProduto = '" + pr.getCodigo() + "';";
			rs = stmt.executeQuery(sqlConsulta);
			
			while (rs.next()) {
				Produto temp = new Produto();
				// pega todos os atributos do produto
				temp.setCodigo(rs.getInt("idCodigo"));
				temp.setDescricao(rs.getString("descricao"));
				temp.setFabricante(rs.getString("fabricante"));
				temp.setPrecoVendaAtacado(rs.getFloat("precoVendaAtac"));
				temp.setPrecoVendaVarejo(rs.getFloat("precoVendaVare"));
				resultados.add(temp);
			}
			return resultados;
		} catch (SQLException e) {
			imprimeErro("Erro ao buscar pessoa", e.getMessage());
			return null;
		}

	}

}
