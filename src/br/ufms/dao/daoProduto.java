package br.ufms.dao;
import br.ufms.dao.ConnectionManager;

public class daoProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 public void inserir (String fabricante; double precoVarejo; double precoAtacado)
		 {
			 
		 }  
		 
		 public void insere(String fabricante, double precoVarejo, double precoAtacado){  
		      conectar();  
		      try {  
		         comando.executeUpdate("INSERT INTO Produto VALUES('"  
		               + fabricante + "', '" + precoVarejo + "',"  
		               + precoAtacado + "')");  
		         System.out.println("Inserida!");  
		      } catch (SQLException e) {  
		         imprimeErro("Erro ao inserir Funcionario", e.getMessage());  
		      } finally {  
		         fechar();  
		      }  
		  public void delete ();    
		  public List list ();    
		  public User find ();

	}

}
