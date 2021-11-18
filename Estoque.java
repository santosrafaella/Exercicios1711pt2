package br.com.generation.exerciciosCollection;

public class Estoque {//classe
	
	//atributos
	private String produto;
	private int quantidade;
	private double preco;
	private String fornecedor;
	
	//construtores
	public Estoque(String produto, int quantidade, double preco, String fornecedor) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fornecedor = fornecedor;
	}
	

	//getter e setter
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}


	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + ", fornecedor="
				+ fornecedor + "]";
	}
	
}
