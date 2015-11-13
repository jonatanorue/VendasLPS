package br.ufms.bean;
import br.ufms.dao.ConnectionManager;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectionManager connect = new ConnectionManager();
		
		connect.ConnectDB("vendasdb", "root", "ajuakirb4c");
		
		connect.CloseDB();
		
		

	}

}
