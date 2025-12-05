package model;

public class ProdutoLimpeza extends Produto{

	private String marca;
	private String tipo;
	
	public ProdutoLimpeza() {
		super();
		setMarca("");
		setTipo("");
	}
	public ProdutoLimpeza(String nome, double preco, int quantidade, String marca, String tipo) {
		super(nome, preco, quantidade);
		setMarca(marca);
		setTipo(tipo);
	}
	
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
