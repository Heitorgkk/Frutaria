package model;

public class Fruta extends Produto{
	
	private double peso;

	public Fruta() {
		super();
		this.setPeso(0.0);
	}
	public Fruta(String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}