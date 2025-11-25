package view;

import java.util.Scanner;
import model.Fruta;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Listar frutas");
		System.out.println("3 - Remover fruta");
		System.out.println("0 - Sair");
		System.out.print("Escolha uma opção: ");
		int opcao = input.nextInt();
		input.nextLine();
		return opcao;
	}

	public String frutaNome() {
		System.out.print("Digite o nome da fruta:");
		return input.nextLine();
	}

	public double frutaPreco() {
		System.out.print("Digite o preço da fruta:");
		double preco = input.nextDouble();
		input.nextLine();
		return preco;
	}

	public int frutaQuantidade() {
		System.out.print("Digite a quantidade:");
		int quantidade = input.nextInt();
		input.nextLine();
		return quantidade;
	}

	public void vizualizar(Fruta fruta) {
		System.out.println("---");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Código: " + fruta.getCodigo());
	}

	public String removerFruta() {
		System.out.println("Digite o nome da fruta a remover:");
		return input.nextLine();
	}

	public void vizualizarFrutaRemovidada(String nome) {
		System.out.println("A fruta '" + nome + "' foi removida.");
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Fruta não encontrada.");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
}
