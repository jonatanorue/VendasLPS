package br.ufms.bean;
import br.ufms.dao.ConnectionManager;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c = new Cliente("jonatan","99302019", "rua caranda, 61", "04987156121", "F");
		c.excluirCliente(c);
	}

}
