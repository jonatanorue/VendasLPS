/*********************************************
Classe que implementa a conexão com o Banco de
Dados.
Autora: Maria Istela Cagnin
Data: Julho/2005
*********************************************/

package br.ufms.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionManager{

    static Connection con;
    static Statement stmt;

    // Conexao - carrega o driver e realiza a conexao com o banco
    public static void ConnectDB(String fonte, String user, String password) {
      try {

    	String url = "jdbc:mysql://localhost:3306/" + fonte;
    	
    	Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();
        con.setAutoCommit(true);
        System.out.println("Base de dados aberta!");

      }
      catch (Exception e) {
        e.printStackTrace();
        System.out.println("Problema na abertura da base de dados!");
      }
    }

   // encerra o statement e a conexao
   public static void CloseDB(){
      try {
	    stmt.close();	// encerra objeto statement
            con.close();       // encerra objeto connection
            System.out.println("Base de dados fechada!");
      }
      catch (Exception e) {
        e.printStackTrace();
        System.out.println("Problema no fechamento da base de dados!");
      }
    }

} // end class