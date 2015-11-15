package br.ufms.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.ufms.dao.daoVenda;

public class Venda {
	
	private int codigoVenda;
	private String dataVenda;
	private String horaVenda;
	private double valorVenda;
	private String tipoPagamento;
	private double valorPago;
	private Funcionario f;
	private Cliente c;
	private ArrayList<ItemProduto> listaP;
	
	public Venda(Cliente c, Funcionario f){
		this.c = c;
		this.f = f;
		
		Scanner s = new Scanner(System.in);
		
		iniciarVenda();
		System.out.println("Deseja confirmar venda? \n 1 - Sim \n 2 - Não \n");
		int op = s.nextInt();
		switch(op){
			case 1 : System.out.print("Digite o valor Pago: ");				 
					 registrarPagamento(s.nextDouble()); 
					 registrarVenda();
					 imprimirNota(); break;
			case 2 : cancelarVenda(); break;
		}
	}
	
	public void iniciarVenda(){		
		
		listaP = new ArrayList<ItemProduto>();
		Scanner s = new Scanner(System.in);
		this.valorVenda = 0; 
		System.out.println("Incluir novo Produto? \n 1 - Sim \n 2 - Não \n");
		while(s.nextInt() == 1){
			ItemProduto ip = new ItemProduto();
			System.out.println("Codigo do Produto: ");
			int codigoP = s.nextInt();
			System.out.println("Quantidade: ");
			int qtdP = s.nextInt(); 
			ip.incluirItem(codigoP, qtdP);
			listaP.add(ip);
			System.out.println("Incluir novo Produto? \n 1 - Sim \n 2 - Não \n");
			this.valorVenda += ip.getValorItem(); 
		}
		
		Date d = new Date();
		setDataVenda(d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
		setHoraVenda( d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());			
	}
	
	public void registrarPagamento(double valorPago){
		this.valorPago = valorPago;
		Scanner s = new Scanner(System.in);
		System.out.println("Qual tipo de pagamento? \n (1) Dinheiro \n (2) Cartão de crédito \n (3) Cartão de débito \n (4) Cheque \n");
		int tipoP = s.nextInt();
		switch(tipoP){
			case 1 : this.tipoPagamento = "DI"; 
				     System.out.println("Troco: " + calcularTroco());
					 break;
			case 2 : this.tipoPagamento = "CC"; break;
			case 3 : this.tipoPagamento = "CD"; break;
			case 4 : this.tipoPagamento = "CH"; break;
		}
	}
	
	public void cancelarVenda(){
		this.codigoVenda = 0;
		this.dataVenda = "";
		this.horaVenda = "";
		this.valorVenda = 0.0;
		this.tipoPagamento = "";
		this.valorPago = 0.0;		
	}
	
	public void registrarVenda(){		
		 daoVenda dv = new daoVenda(this, f, c);
		 dv.salvar();
	}
		
	public void imprimirNota(){
		//Pegar lista de produtos e imprimir
		System.out.println("CUPOM FISCAL");
		System.out.println("Cliente: " + c.getNome() + " cpf/cnpj: " + c.getCpf_cnpj());
		System.out.println("Funcionario: " + f.getCodigo());
		for(int i=0; i < listaP.size(); i++){
			System.out.println("Codigo: " + listaP.get(i).getP().getCodigo() + " Quantidade: " + listaP.get(i).getQtdProdutos() + " Preco: " + listaP.get(i).getValorItem());
		}
		System.out.println("Preço total: " + this.valorVenda);
		
	}
	
	public double calcularTroco(){
		return (this.valorPago - this.valorVenda);
	}
	
	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public int getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	

}
