package br.ufms.bean;
import br.ufms.dao.daoProduto;

public abstract class Produto {
	    
	    private int codigo;
	    private String descricao;
	    private String fabricante;
	    private double precoVendaVarejo;
	    private double precoVendaAtacado;
	    
	    public Produto(){
	        this.codigo = 0;
	        this.fabricante = "";
	        this.descricao = "";
	        this.precoVendaAtacado = 0.0;
	        this.precoVendaVarejo = 0.0;
	    }
	    
	    public Produto( String descricao, String fabricante, double precoVarejo, double precoAtacado){
	        this.codigo = codigoProduto;
	        this.fabricante = fabricante;
	        this.descricao = descricao;
	        this.precoVendaVarejo = precoVarejo;
	        this.precoVendaAtacado = precoAtacado;
	    }
	    
	    public void cadastrarProduto( String fabricante, double precoVarejo, double precoAtacado){
	    	 ( fabricante, precoVarejo, precoAtacado);  
	    }
	    
	    public void buscarProduto(){
	    	
	    }
	    
	    // variabilidades, excluir e editar
	    
	    public abstract void excluirProduto();
	    
	    public abstract void editarProduto();

	    /**
	     * @return the codigoProduto
	     */
	    public int getCodigo() {
	        return codigo;
	    }

	    /**
	     * @param codigoProduto the codigoProduto to set
	     */
	    public void setCodigo(int codigoProduto) {
	        this.codigo = codigoProduto;
	    }

	    /**
	     * @return the descricao
	     */
	    public String getDescricao() {
	        return descricao;
	    }

	    /**
	     * @param descricao the descricao to set
	     */
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	    
	    /**
	     * @param descricao the fabricante to set
	     */
	    public void setFabricante(String fabricante) {
	        this.fabricante = fabricante;
	    }
	    
	    /**
	     * @return the fabricante
	     */
	    public String getFabricante() {
	        return fabricante;
	    }

	    /**
	     * @return the precoVarejo
	     */
	    public double getPrecoVendaVarejo() {
	        return precoVendaVarejo;
	    }

	    /**
	     * @param precoVarejo the precoVarejo to set
	     */
	    public void setPrecoVendaVarejo(double precoVarejo) {
	        this.precoVendaVarejo = precoVarejo;
	    }

	    /**
	     * @return the precoAtacado
	     */
	    public double getPrecoVendaAtacado() {
	        return precoVendaAtacado;
	    }

	    /**
	     * @param precoAtacado the precoAtacado to set
	     */
	    public void setPrecoVendaAtacado(double precoAtacado) {
	        this.precoVendaAtacado = precoAtacado;
	    }
	    
	}

