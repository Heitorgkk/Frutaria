package model;

public class ProdutoLimpeza {
	private String nome;
	private double preco;
	private int quantidade;
	private String categoria;

	public ProdutoLimpeza() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
		this.categoria = "";
	}

	public ProdutoLimpeza(String nome, double preco, int quantidade, String categoria) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
