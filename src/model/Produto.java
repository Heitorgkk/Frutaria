package model;

public class Produto {

	protected String nome;
	protected double preco;
	protected int quantidade;
	
	protected int codigo;
	
	protected static int contador;
	
	public Produto() {
		this.setNome("");
		this.setPreco(0.0);
		this.setQuantidade(0);
		this.setCodigo(contador++);
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.setCodigo(contador++);
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

	public int getCodigo() {
		return codigo;
	}
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
