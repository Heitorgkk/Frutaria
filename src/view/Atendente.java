package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Produto;

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
		System.out.print("   Digite sua opção: ");

		
		return 0;
		
	}
	
	public int lerEntradaMenu() {
		
		int opc = lerInt();
		if(testInRange(1, 6, opc) == true) {
			return opc;
		}
		
	}
	
	
	
	
	
	public int lerInt() {
		
		int out;
		try {
			out = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Apenas número inteiro!");
			return lerInt();
		}
		return out;
	}
	
	public double lerDouble() {
		
		double out;
		try {
			out = input.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("Apenas número com ponto!");
			return lerDouble();
		}
		return out;
	}
	
	public String lerString() {
		return input.nextLine();
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
