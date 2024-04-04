package atividadeLivroJava;


import java.util.List;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		Produto filme1 = new Filme();
		Produto livro1 = new Livro();
		
		livro1.inserirDados();
		filme1.inserirDados();
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(livro1);
		meuCarrinho.adicionar(filme1);
		
		List<Produto> minhaLista = meuCarrinho.gerarLista();
		
		for (Produto a: minhaLista) {
			a.mostrarDados();
		}
	
	}

}
