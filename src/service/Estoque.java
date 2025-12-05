package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Verdura;
import model.Produto;
import model.ProdutoLimpeza;
import view.Atendente;

public class Estoque {
	
	private List<Produto> produtos;                    
	
	public Estoque() {
		produtos = new ArrayList<>();
	}
	
	public void _iniciar_(Atendente atd) {
		
		int opc = atd.menuInicial();
		
		switch(opc) {
		case 1 -> addProduto();
		case 2 -> listarProdutos();
		case 3 -> rmvProduto();
		case 4 -> buscarProduto();
		case 5 -> editarProduto();
		case 6 -> atd._finalizar_();
		}
		
		
		
	}
	
	public Fruta novaFruta(Atendente atd) {
		System.out.println("-----Fruta-----");
		System.out.print("Nome: ");
		String nome = atd.lerString();
		
		System.out.print("Preço: ");
		double preco = atd.lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = atd.lerInt();
		
		System.out.print("Peso: ");
		double peso = atd.lerDouble();
		
		return new Fruta(nome, preco, quantidade, peso);
	}
	public Verdura novaVerdura(Atendente atd) {
		System.out.println("-----Verdura-----");
		System.out.println("Nome: ");
		String nome = atd.lerString();
		
		System.out.print("Preço: ");
		double preco = atd.lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = atd.lerInt();
		
		System.out.print("Tipo: ");
		String tipo = atd.lerString();
		
		return new Verdura(nome, preco, quantidade, tipo);
	}
	public ProdutoLimpeza novoPLimpeza(Atendente atd) {
		System.out.println("-----Produto de Limpeza-----");
		System.out.println("Nome: ");
		String nome = atd.lerString();
		
		System.out.print("Preço: ");
		double preco = atd.lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = atd.lerInt();
		
		System.out.print("Marca: ");
		String marca = atd.lerString();
		
		System.out.print("Tipo: ");
		String tipo = atd.lerString();
		
		return new ProdutoLimpeza(nome, preco, quantidade, marca, tipo);
	}
	
	
	public void addProduto() {
		
	}
	
	public void listarProdutos() {
		
	}
	
	public void rmvProduto() {
		
	}
	
	public void buscarProduto() {
		
	}
	
	public void editarProduto() {
		
	}
	
	
	
	
	
	
	
	
	
}