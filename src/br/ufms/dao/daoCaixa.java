package br.ufms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.ufms.bean.Caixa;
import br.ufms.bean.Funcionario;

public class daoCaixa {

	private final Connection connection;
	private Caixa cx;
	private Funcionario f;
	
	public daoCaixa(Caixa cx, Funcionario f){
		connection = new ConnectionFactory().getConnection();
		this.cx = cx;
		this.f = f;
	}
	
	public void salvar(){
		
		try {
			
			String sqlInsert = "INSERT INTO Caixa (Funcionario_idFuncionario, valorCaixaAbertura, horaAbertura, horaFechamento, valorCaixaFechamento) VALUES(?, ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sqlInsert);
			ps.setInt(1, f.getCodigoFuncionario());
			ps.setDouble(2, cx.getValorCaixaAbertura());
			ps.setString(3, cx.getHoraAbertura());
			ps.setString(4, cx.getHoraFechamento());
			ps.setDouble(5, cx.getValorCaixaFechamento());
			
			ps.execute();
			ps.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void atualizar(Caixa cx){
		this.cx = cx;
		try {
		
			String sqlInsert = "UPDATE Caixa SET horaFechamento = ?, valorCaixaFechamento = ?);";
			PreparedStatement ps = connection.prepareStatement(sqlInsert);
			ps.setString(1, cx.getHoraFechamento());
			ps.setDouble(2, cx.getValorCaixaFechamento());
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}
}
