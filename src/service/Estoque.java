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
		
		int opc;
		
		do {
		
			opc = atd.menuInicial();
			
			switch(opc) {
			case 1 -> addProduto(atd);
			case 2 -> listarProdutos(atd);
			case 3 -> rmvProduto(atd);
			case 4 -> buscarProduto(atd);
			case 5 -> editarProduto(atd);
			case 6 -> atd._finalizar_();
			}
			
		}while(opc != 6);
		
	}
	
	
	public void addProduto(Atendente atd) {
		
		
		int tipo = atd.lerTipoProdutos();
		switch(tipo){
		case 1 -> produtos.add(atd.novaFruta());
		case 2 -> produtos.add(atd.novaVerdura());
		case 3 -> produtos.add(atd.novoPLimpeza());
		}
	
	
	}
	
	public void listarProdutos(Atendente atd) {
		
		int tipo = atd.lerTiposProduto();
		ArrayList<Produto> mostrar = new ArrayList<>();
		
		switch(tipo) {
		case 1 -> { for(Produto p : produtos) mostrar.add(p); }
		case 2 -> { for(Produto p : produtos) if(p instanceof Fruta) mostrar.add(p); }
		case 3 -> { for(Produto p : produtos) if(p instanceof Verdura) mostrar.add(p); } 
		case 4 -> { for(Produto p : produtos) if(p instanceof ProdutoLimpeza) mostrar.add(p); }
		}
		
		for(Produto p : mostrar) {
			System.out.println("------------------------");
			System.out.println(p);
		}
		System.out.println("------------------------");
		
		
	}
	
	public void rmvProduto(Atendente atd) {
		
		int cod = atd.lerCodigo(produtos);
		produtos.remove(cod);
		
	}
	
	public void buscarProduto(Atendente atd) {
		
		
		String nome = atd.lerNomeProduto();
		
		for(Produto p : produtos) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				System.out.println("------------------------");
				System.out.println(p);
			}
		}
		System.out.println("------------------------");
		
	}
	
	public boolean editarProduto(Atendente atd) {
		
		boolean mudou = false;
		
		int cod = atd.lerCodigo(produtos);
		
		if(produtos.get(cod) instanceof Fruta) {
			produtos.set(cod, atd.novaFruta());
		}else if(produtos.get(cod) instanceof Verdura) {
			produtos.set(cod, atd.novaVerdura());
		}else if(produtos.get(cod) instanceof ProdutoLimpeza) {
			produtos.set(cod, atd.novoPLimpeza());
		}else {
			
		}
		
		
		return mudou;
	}
	

}