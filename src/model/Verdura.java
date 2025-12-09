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
	
	@Override
	public String toString() {
		return "Código: "+codigo+"\n"+
				"Nome: "+nome+"\n"+
				"Preço: R$"+preco+"\n"+
				"Quantidade: "+quantidade+"\n"+
				"Tipo: "+tipo+"\n";
	}
	
}
