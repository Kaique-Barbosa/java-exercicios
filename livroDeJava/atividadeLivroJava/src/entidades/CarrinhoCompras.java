package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CarrinhoCompras {
	
	private List<Produto> listaProd = new ArrayList<Produto>();
	
	public void adicionar(Produto prod) {
		JOptionPane.showMessageDialog(null, "Frete para o produto: " + prod.getDescricao());
		int km = Integer.parseInt(JOptionPane.showInputDialog("Quantos km para a entrega?"));
		listaProd.add(prod);
	}
	
	public List<Produto> gerarLista(){
		return this.listaProd;
	}
}
