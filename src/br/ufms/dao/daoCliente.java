package br.ufms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.ufms.bean.Cliente;

public class daoCliente {
	private final Connection connection;
	private Cliente c;

	public daoCliente(Cliente c) {
		connection = new ConnectionFactory().getConnection();
		this.c = c;
	}

	public boolean salvar (){
		try {
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM Cliente where cpf_cnpj = '" + c.getCpf_cnpj() + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			if (rs.next()) {
				return false;
			}
			
			String sqlInsert = "INSERT INTO Cliente (telefone, endereco, nome, tipoCliente, cpf_cnpj) VALUES(?, ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sqlInsert);
			ps.setString(1, c.getTelefone());
			ps.setString(2, c.getEndereco());
			ps.setString(3, c.getNome());
			ps.setString(4, c.getTipoCliente());
			ps.setString(5, c.getCpf_cnpj());
			
			ps.execute();
			
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean buscar(){
		try {
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM Cliente where cpf_cnpj = '" + c.getCpf_cnpj() + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			if (rs.next()) {
				return true;
			}else {
				return false;
			}	
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean excluir(){
		try {
				Statement stmt = connection.createStatement();
				String sqlConsulta = "SELECT * FROM Cliente where cpf_cnpj = '" + c.getCpf_cnpj() + "';";
				ResultSet rs = stmt.executeQuery(sqlConsulta);
				if (!rs.next()) {
					return false;
				}else{
				
					String sqlInsert = "DELETE FROM Cliente WHERE cpf_cnpj = '?';";
					PreparedStatement ps = connection.prepareStatement(sqlInsert);
					ps.setString(1, c.getCpf_cnpj());
					
					ps.execute();
					return true;
				}
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}



