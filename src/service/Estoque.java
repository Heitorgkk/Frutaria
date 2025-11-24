package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import view.Atendente;

public class Estoque {
	private List<Fruta> listaFruta;

	public Estoque() {
		listaFruta = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			String tipo = atendente.frutaTipo();

			Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
			listaFruta.add(fruta);
		}

		case 2 -> {
			for (Fruta fruta : listaFruta) {
				atendente.vizualizar(fruta);
			}
		}

		case 3 -> {
			String nome = atendente.removerFruta();
			boolean removido = false;

			for (int indice = 0; indice < listaFruta.size(); indice++) {
				if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaFruta.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				atendente.vizualizarFrutaRemovidada(nome);
			} else {
				atendente.mensagemNaoEncontrado();
			}
		}
		}
	}
}