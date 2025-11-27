package model;

public class Verdura extends Produto{

	private String tipo;
	
	public Verdura() {
		super();
		this.setTipo("");
	}
	public Verdura(String nome, double preco, int quantidade, String tipo) {
		super(nome, preco, quantidade);
		this.setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
