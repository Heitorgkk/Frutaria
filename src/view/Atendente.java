package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import model.Fruta;
import model.Produto;
import model.ProdutoLimpeza;
import model.Verdura;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuInicial() {
		
		
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃            🛒   MENU DE PRODUTOS   🛒        ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("   [1]  ➤  Adicionar produto");
		System.out.println("   [2]  ➤  Listar produtos");
		System.out.println("   [3]  ➤  Remover produto");
		System.out.println("   [4]  ➤  Buscar produto");
		System.out.println("   [5]  ➤  Editar produto");
		System.out.println("   [6]  ➤  Sair");
		System.out.println("────────────────────────────────────────────────");
		

		
		return lerEntradaMenu();
		
	}
	
	public int lerEntradaMenu() {
		
		System.out.print("   Digite sua opção: ");
		int opc = lerInt();
		if(testInRange(1, 6, opc) == true) {
			return opc;
		}else {
			System.out.println("   Opção Inválida!");
			return lerEntradaMenu();
		}
		
	}
	public int lerTiposProduto() {
		System.out.println("\nEscolha o tipo de Produto \n");		
		System.out.println("| [1] Produtos Geral");
		System.out.println("| [2] Fruta");
		System.out.println("| [3] Verdura");
		System.out.println("| [4] Produto de Limpeza");
		System.out.print("\nEscolha: ");
		
		int out = lerIntInRange(1, 4);
		return out;
	}
	public int lerTipoProdutos() {
		System.out.println("\nEscolha o tipo de Produto ");
		System.out.println("| [1] Fruta");
		System.out.println("| [2] Verdura");
		System.out.println("| [3] Produto de Limpeza");
		System.out.print("\n >>");
		
		int out = lerIntInRange(1, 3);
		return out;
	}
	
	public int lerIntInRange(int min, int max) {
		
		int out;
		do {
			out = lerInt();
			if(!testInRange(min, max, out)) System.out.println("Opção Inválida! Tente novamente.");
		}while(!testInRange(min, max, out));
		return out;
	}
	
	public String lerNomeProduto() {
		System.out.print("Nome do produto: ");
		return lerString();
	}
	
	
	
	
	public int lerCodigo(List<Produto> list) {
		System.out.print("\nDigite o código do produto: ");
		return lerIntInRange(0, list.size() - 1);
	}
	
	
	
	
	
	
	
	
	public Fruta novaFruta() {
		System.out.println("\n-----Fruta-----");
		System.out.print("Nome: ");
		String nome = lerString();
		
		System.out.print("Preço: ");
		double preco = lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = lerInt();
		
		System.out.print("Peso: ");
		double peso = lerDouble();
		
		return new Fruta(nome, preco, quantidade, peso);
	}
	public Verdura novaVerdura() {
		System.out.println("\n-----Verdura-----");
		System.out.print("Nome: ");
		String nome = lerString();
		
		System.out.print("Preço: ");
		double preco = lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = lerInt();
		
		System.out.print("Tipo: ");
		String tipo = lerString();
		
		return new Verdura(nome, preco, quantidade, tipo);
	}
	public ProdutoLimpeza novoPLimpeza() {
		System.out.println("\n-----Produto de Limpeza-----");
		System.out.print("Nome: ");
		String nome = lerString();
		
		System.out.print("Preço: ");
		double preco = lerDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = lerInt();
		
		System.out.print("Marca: ");
		String marca = lerString();
		
		System.out.print("Tipo: ");
		String tipo = lerString();
		
		return new ProdutoLimpeza(nome, preco, quantidade, marca, tipo);
	}
	
	
	
	
	
	public int lerInt() {
		
		int out;
		try {
			out = input.nextInt();
			
		}catch(InputMismatchException e) {
			input.nextLine();
			System.out.print("-Apenas número inteiro! ");
			return lerInt();
		}
		input.nextLine();
		return out;
	}
	
	public double lerDouble() {
		
		double out;
		try {
			out = input.nextDouble();
			
		}catch(InputMismatchException e) {
			input.nextLine();
			System.out.print("-Apenas número com ponto! ");
			return lerDouble();
		}
		return out;
	}
	
	public String lerString() {
		return input.nextLine();
	}
	
	
	
	public void erroCritico() {
		System.out.println("================================");
		System.out.println("Erro Crítico, encerrando sistema");
		System.out.println("================================");
		_finalizar_();
	}
	
	
	
	public void _finalizar_() {
		
		System.out.println("\nEncerrando programa...");
		barraCarregamento(12, 2);

	}
	
	
	public void barraCarregamento(int length, double time) {
		
		for(int i = 1; i <= length; i++) {
			
			StringBuilder line = new StringBuilder("\r [");
			
			for(int l = 1; l <= i; ++l) {
				line.append("=");
			}
			for(int b = 1; b <= length - i; b++) {
				line.append(" ");
			}
			
			line.append("]");
			
			System.out.print(line);
			System.out.flush();
			
			aguardar(Math.round(time * 1000 / length));
			
		}
		
	}
	
	public static void aguardar(long millis) {
		try { Thread.sleep(millis); }catch(InterruptedException e){}
	}
	
	public boolean testInRange(int min, int max, int enter) {
		if(enter >= min & enter <= max) return true;
		return false;
	}
	
}
