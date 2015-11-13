/*package br.ufms.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class daoCliente {
	
	private ConnectionManager cm;
	private Connection connection;    
	    
	
	 public daoCliente(){
		
		 //cm.ConnectDB("vendasdb", "root", "root");
	 }
	 

	public void save (String cpf_cnpj){
		String sqlConsulta = "SELECT * FROM Cliente where cpf_cnpj = '?';";
		try{
			cm = new ConnectionManager();
			cm.ConnectDB("vendasdb", "root", "root");
			connection =  cm.getConnection();
		}catch (Exception ex){
			
		}
		
		PreparedStatement ps  = new this.connection.prepareStatement(sqlConsulta);
	}
	
}*/

package br.ufms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import br.ufms.bean.CategoriaExemplar;
import br.ufms.factory.ConnectionFactory;

public class daoCliente {
	private final Connection connection;

	public daoCliente() {
		connection = new ConnectionFactory().getConnection();
	}

	public boolean save (String cpf_cnpj){
		try {
			Statement stmt = connection.createStatement();
			String sqlConsulta = "SELECT * FROM Cliente where cpf_cnpj = '" + cpf_cnpj + "';";
			ResultSet rs = stmt.executeQuery(sqlConsulta);
			if (rs.next()) {
				return false;
			}
			String sqlInsert = "INSERT INTO Cliente () VALUES(?)";
			PreparedStatement psstmt = connection.prepareStatement(sqlInsert);
			psstmt.setString(1, categoriaExemplar.getDescricao());
			psstmt.execute();
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}



