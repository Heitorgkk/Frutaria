package main;

import service.Estoque;
import view.Atendente;

public class FrutariaApp {
	public static void main(String[] args) {

		Atendente at = new Atendente();
		Estoque est = new Estoque();
		
		est._iniciar_(at);
		
	}
}
