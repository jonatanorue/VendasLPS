package br.ufms.bean;
import br.ufms.dao.ConnectionManager;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("049871", "joao1993", "123456", "jonatan");
		f.cadastrarFuncionario();
		
	}

}
