package app;
import entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaique Barbosa
 */
public class Aula280224 {
    
    public static void main(String[] args) {
        
        Funcionarios funcionarios = new Funcionarios();
        
        funcionarios.nome =  JOptionPane.showInputDialog("Digite o nome do funcionário");
        funcionarios.salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário bruto do funcionario"));
        funcionarios.imposto = Float.parseFloat(JOptionPane.showInputDialog("Digite o imposto para aplicar sobre o salário"));
        
        JOptionPane.showMessageDialog(null, "Nome: " + funcionarios.nome);
        JOptionPane.showMessageDialog(null, "Salario Bruto: " + funcionarios.salarioBruto);
        JOptionPane.showMessageDialog(null, "Tax " + funcionarios.imposto);
        JOptionPane.showMessageDialog(null, "Salario Liquido é de: " + funcionarios.calcularSalarioLiquido());
//        -----------------------------------------------------------------------------------------------------------------------------------------
        funcionarios.aumentarSalario(Integer.parseInt(JOptionPane.showInputDialog("digite o percentil de aumento")));
        JOptionPane.showMessageDialog(null, "Salario novo salario com aumento é:  " + funcionarios.getSalarioLiquido());
        
        
    }
}
