package main;

import service.Estoque;
import view.Atendente;

public class FrutariaApp {
	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		
		estoque._iniciar_(atendente);
		
	}
}
