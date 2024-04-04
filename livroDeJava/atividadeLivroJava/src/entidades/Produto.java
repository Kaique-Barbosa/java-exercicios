package entidades;

import javax.swing.JOptionPane;

public class Produto {
	private int codigo;
	private double preco;
	private String descricao;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
		public double calcularFrete(int km) {
			double valor = km * 1.05;
			return valor;
		}
		
		public void inserirDados(){
			this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite  o código:"));
			this.descricao = JOptionPane.showInputDialog("Digite  a descricao:");
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite  o preco:"));
			
			
		}
		public void mostrarDados(){
			JOptionPane.showMessageDialog(null, "O código de " + this.descricao + " é : " + this.codigo);
			JOptionPane.showMessageDialog(null, "A descrição de "+ this.descricao + " é: " + this.descricao);
			JOptionPane.showMessageDialog(null, "O preço de " + this.descricao + " é: " + this.preco);
			
		}
		
}
