package br.ufms.bean;
import br.ufms.dao.ConnectionFactory;;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Cliente c = new Cliente("jonatan","99302019", "rua caranda, 61", "04987156121", "F");	
		//c.cadastrarCliente();
		//System.out.print(c.getCodigoCliente());
		
		
		
		//Produto pr = new Produto("coca-cola", "coca-cola", 2.25, 2.07);
		//pr.cadastrarProduto();
		
		Funcionario fun = new Funcionario("Leandro", "04987554122", "leandro", "feuzer");
		fun.cadastrarFuncionario();
		
		Caixa cx = new Caixa(fun);
		cx.abrirCaixa(298.27);
		
		
		
		
		
		
	}

}
