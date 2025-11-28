package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Produto;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
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
		
		System.out.print("\nEncerrando programa...\n");
		//System.out.print("\n");
		
		int length = 10;
		for(int i = 1; i <= length; i++) {
			
			StringBuilder line = new StringBuilder("\r[");
			
			for(int l = 1; l <= i; ++l) {
				line.append("=");
			}
			for(int b = 1; b <= length - i; b++) {
				line.append(" ");
			}
			
			line.append("]");
			
			System.out.print(line);
			System.out.flush();
			
			aguardar(100);
			
		}
		
		
	}
	
	
	
	
	
	
	public void aguardar(int millis) {
		try { Thread.sleep(millis); }catch(InterruptedException e){}
	}
	
	public boolean testeInRange(int min, int max, int enter) {
		if(enter >= min & enter <= max) return true;
		return false;
	}
	
}
